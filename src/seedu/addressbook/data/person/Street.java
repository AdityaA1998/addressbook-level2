package seedu.addressbook.data.person;

/**
 * Represents a Person's address' street
 */

public class Street {

    private static String street;

    /**
     * A constructor to initialise Street object
     *
     * @param street to represent the block
     */

    public Street (String street) {
        this.street = street;
    }

    /**
     * Returns street from the address
     *
     * @return street (string type) from the address
     */

    public static String getStreet() {
        return street;
    }

}

