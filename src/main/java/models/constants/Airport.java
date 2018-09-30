package models.constants;

/**
 * This enum class contains all airports and their short names.
 * Note. Still not all Airports are included in this enum class.
 */
public enum Airport {
    STOCKHOLM("ARN"), LONDON("LHR"), OSLO("OSL"), COPENHAGEN("CPH");

    Airport(String Name) {
        name = Name;
    }

    private String name;

    public String get() {
        return name;
    }

    public static Airport getByAirportName(String airportName) {
        for (Airport air: Airport.values()) {
            if (air.get().equals(airportName)) {
                return air;
            }
        }
        return null;
    }
}
