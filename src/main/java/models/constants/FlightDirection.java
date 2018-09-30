package models.constants;

/**
 * Source code contains 2 tables, 0 and 1.
 * first, 0 is for outbound.
 * Second, 1 is for return.
 */
public enum FlightDirection {
    OUTBOUND("0"), RETURN("1");

    FlightDirection(String TableNumber) {
        tableNumber = TableNumber;
    }

    private String tableNumber;

    public String getTableNumber() {
        return tableNumber;
    }
}
