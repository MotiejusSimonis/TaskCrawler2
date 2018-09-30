package models.businessLogic;

import lombok.Getter;
import lombok.Setter;


/**
 * This model contains information that can be found in segment objects found in source code.
 * Example of object:
 *
 * var segment = new Object();
 * segment.bookingClass = "U";
 * segment.flightId = "2";
 * segment.airlineCode = "*";
 * segment.bLocation   = "ARN";
 * segment.eLocation   = "LHR";
 * segment.bDate = "Mon Oct 08 18:20:00 GMT 2018";
 * segment.eDate =	"Mon Oct 08 19:55:00 GMT 2018";
 * recommendation.segments.push(segment);
 */
@Getter
@Setter
public class SegmentModel {
    private String flightId;
    private String bLocation;
    private String eLocation;
    private String bDate;
    private String eDate;
}
