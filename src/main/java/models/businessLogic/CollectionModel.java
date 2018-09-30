package models.businessLogic;

import lombok.Getter;
import lombok.Setter;
import models.constants.Airport;
import java.util.Date;

/**
 * This model contains information that needs to be collected.
 */
@Getter
@Setter
public class CollectionModel {
    private Airport arrival;
    private Airport departure;
    private Airport connection;
    private Date arrivalDate;
    private Date departureDate;
}
