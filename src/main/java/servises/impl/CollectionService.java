package servises.impl;

import models.DTO.CollectionDTO;
import models.DTO.CrawlDTO;
import models.DTO.DBQueryDTO;
import models.businessLogic.CollectionModel;
import models.businessLogic.FlightModel;
import models.businessLogic.SegmentModel;
import models.constants.Airport;
import models.constants.FlightDirection;
import models.constants.Settings;
import servises.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This Class collects needed information from SourceCode.
 */
public class CollectionService implements ICollectionService {

    private ICrud crud;
    private ICrawlService crawlService;
    private ISegmentFinder segmentFinder;
    private IPriceFinder priceFinder;
    private ITaxesFinder taxesFinder;

    public CollectionService() {
        crud = new Crud();
        crawlService = new CrawlService();
        segmentFinder = new SegmentFinder();
        priceFinder = new PriceFinder();
        taxesFinder = new TaxesFinder();
    }


    /**
     * @param model depending on model field values, finds information from source code.
     */
    public CollectionDTO collect(CollectionModel model) {
        CrawlDTO dto = crawlService.getSourceCode(model);
        if (!dto.isSuccess()) {
            return new CollectionDTO(dto.getMessage(), false);
        }
        String sourceCode = dto.getSourceCode();
        List<SegmentModel> segments = segmentFinder.getAllSegments(sourceCode);

        // Finding flights without connection.
        List<SegmentModel> outbound = findFlightsWithoutCon(model, segments, FlightDirection.OUTBOUND);
        List<SegmentModel> returns = findFlightsWithoutCon(model, segments, FlightDirection.RETURN);
        List<FlightModel> outboundFlights = getFlightsWithoutCon(sourceCode, FlightDirection.OUTBOUND, outbound);
        List<FlightModel> returnsFlights = getFlightsWithoutCon(sourceCode, FlightDirection.RETURN, returns);

        // Finding flights with connection.
        List<List<SegmentModel>> listOutbound = findFlightsWithCon(model, segments, FlightDirection.OUTBOUND);
        List<List<SegmentModel>> listReturn = findFlightsWithCon(model, segments, FlightDirection.RETURN);
        List<FlightModel> flightListOut = getFlightsWithCon(sourceCode, FlightDirection.OUTBOUND, listOutbound);
        List<FlightModel> flightListRet = getFlightsWithCon(sourceCode, FlightDirection.RETURN, listReturn);

        // Adding all to one list.
        List<FlightModel> allFlights = new ArrayList<>();
        allFlights.addAll(outboundFlights);
        allFlights.addAll(returnsFlights);
        allFlights.addAll(flightListOut);
        allFlights.addAll(flightListRet);

        // Sending list to server.
        StringBuilder message = new StringBuilder();
        for (FlightModel fm: allFlights) {
            DBQueryDTO dbQueryDTO = crud.create(fm);
            if (!dbQueryDTO.isSuccess()){
                message.append(dbQueryDTO.getMessage()).append("\n");
            }
        }

        if (!message.toString().isEmpty()) {
            return new CollectionDTO(message.toString(), false);
        }

        return new CollectionDTO(Settings.SUCCESS, true);
    }


    /**
     * This method finds all needed values for @FlightModel, with services help.
     * @param dir is needed for @PriceFinder service, to find right table. Its outbound or return table.
     */
    private List<FlightModel> getFlightsWithCon(String source, FlightDirection dir, List<List<SegmentModel>> list) {
        List<FlightModel> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            FlightModel flight = new FlightModel();
            flight.setDepartureAirport(Airport.getByAirportName(list.get(i).get(0).getBLocation()));
            flight.setArrivalAirport(Airport.getByAirportName(list.get(i).get(1).getELocation()));
            flight.setConnectionAirport(Airport.getByAirportName(list.get(i).get(0).getELocation()));
            flight.setDepartureTime(list.get(i).get(0).getBDate());
            flight.setArrivalTime(list.get(i).get(1).getEDate());
            flight.setCheapestPrice(priceFinder.findCheapestPrice(source, dir, list.get(i).get(1).getFlightId()));
            flight.setTaxes(taxesFinder.find(source, flight.getCheapestPrice()));
            newList.add(flight);
        }
        return newList;
    }


    /**
     * This method finds all needed values for @FlightModel, with services help.
     * @param dir is needed for @PriceFinder service, to find right table. Its outbound or return table.
     */
    private List<FlightModel> getFlightsWithoutCon(String source, FlightDirection dir, List<SegmentModel> list) {
        List<FlightModel> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            FlightModel flight = new FlightModel();
            flight.setDepartureAirport(Airport.getByAirportName(list.get(i).getBLocation()));
            flight.setArrivalAirport(Airport.getByAirportName(list.get(i).getELocation()));
            flight.setDepartureTime(list.get(i).getBDate());
            flight.setArrivalTime(list.get(i).getEDate());
            flight.setCheapestPrice(priceFinder.findCheapestPrice(source, dir, list.get(i).getFlightId()));
            flight.setTaxes(taxesFinder.find(source, flight.getCheapestPrice()));
            newList.add(flight);
        }
        return newList;
    }


    /**
     * This method finds flights in @SegmentModel's, depending on @FlightDirection
     * and @ConnectionModel Airport values, to get flights with connection.
     */
    public List<SegmentModel> findFlightsWithoutCon(CollectionModel cm, List<SegmentModel> list, FlightDirection direction) {
        List<SegmentModel> newList = new ArrayList<>();
        if(list.isEmpty()) {
            return newList;
        }
        for (SegmentModel model : list) {
            if(direction == FlightDirection.OUTBOUND && cm.getArrival().get().equals(model.getBLocation())
                    && cm.getDeparture().get().equals(model.getELocation())) {
                newList.add(model);
            }
            if(direction == FlightDirection.RETURN && cm.getDeparture().get().equals(model.getBLocation())
                    && cm.getArrival().get().equals(model.getELocation())) {
                newList.add(model);
            }
        }
        return newList;
    }


    /**
     * This method pares segment models to a list of list, depending on @FlightDirection
     * and @ConnectionModel Airport values, to get flights with connection.
     * @List<SegmentModel> contains 2 segments which pares for one flight.
     */
    public List<List<SegmentModel>> findFlightsWithCon(CollectionModel cm, List<SegmentModel> list, FlightDirection direction) {
        List<List<SegmentModel>> flights = new ArrayList<>();
        if(list.isEmpty()) {
            return flights;
        }
        for (int i = 0; i < list.size(); i++) {
            if (direction == FlightDirection.OUTBOUND
                    && cm.getDeparture().get().equals(list.get(i).getBLocation())
                    && cm.getConnection().get().equals(list.get(i).getELocation())) {
                List<SegmentModel> oneFLight = new ArrayList<>();
                oneFLight.add(list.get(i));
                for (int j = 0; j < list.size(); j++) {
                    if (cm.getConnection().get().equals(list.get(j).getBLocation())
                            && cm.getArrival().get().equals(list.get(j).getELocation())
                            && list.get(j).getFlightId().equals(list.get(i).getFlightId())) {
                        oneFLight.add(list.get(j));
                        flights.add(oneFLight);
                    }
                }
            }
            if (direction == FlightDirection.RETURN
                    && cm.getArrival().get().equals(list.get(i).getBLocation())
                    && cm.getConnection().get().equals(list.get(i).getELocation())) {
                List<SegmentModel> oneFLight = new ArrayList<>();
                oneFLight.add(list.get(i));
                for (int j = 0; j < list.size(); j++) {
                    if (cm.getConnection().get().equals(list.get(j).getBLocation())
                            && cm.getDeparture().get().equals(list.get(j).getELocation())
                            && list.get(j).getFlightId().equals(list.get(i).getFlightId())) {
                        oneFLight.add(list.get(j));
                        flights.add(oneFLight);
                    }
                }
            }
        }
        return flights;
    }
}
