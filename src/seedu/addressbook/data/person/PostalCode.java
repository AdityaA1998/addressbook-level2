package seedu.addressbook.data.person;

/**
 * Represents a Person's address' postal code
 */

public class PostalCode {

    private static String postalCode;

    /**
     * A constructor to initialise PostalCode object
     *
     * @param postal code to represent the postal code
     */

    public PostalCode (String postalCodeo) {
        this.postalCode = postalCode;
    }

    /**
     * Returns postal code from the address
     *
     * @return postal code (string type) from the address
     */

    public static String getPostalCode() {
        return postalCode;
    }

}

