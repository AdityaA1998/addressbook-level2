package seedu.addressbook.data.person;

/**
 * Represents a Person's address' unit
 */

public class Unit {

    private static String unit;

    /**
     * A constructor to initialise Unit object
     *
     * @param unit to represent the unit
     */

    public Unit (String unit) {
        this.unit = unit;
    }

    /**
     * Returns unit from the address
     *
     * @return unit (string type) from the address
     */

    public static String getUnit() {
        return unit;
    }

}

