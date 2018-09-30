package servises;

import models.constants.FlightDirection;
import java.math.BigDecimal;

public interface IPriceFinder {
    BigDecimal findCheapestPrice(String sourceCode, FlightDirection direction, String flightId);
}
