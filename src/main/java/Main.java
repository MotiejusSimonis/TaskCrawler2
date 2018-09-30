import models.DTO.CollectionDTO;
import models.businessLogic.CollectionModel;
import models.constants.Airport;
import servises.ICollectionService;
import servises.impl.CollectionService;

public class Main {
    public static void main(String[] args) {

        CollectionModel model = new CollectionModel();
        model.setDeparture(Airport.STOCKHOLM);
        model.setArrival(Airport.LONDON);
        model.setConnection(Airport.OSLO);

        ICollectionService service = new CollectionService();
        CollectionDTO dto = service.collect(model);
        System.out.println(dto.getMessage());
    }
}
