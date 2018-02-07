package seedu.addressbook.data.person;

/**
 * Represents a Person's address' block
 */

public class Block {

    private static String block;

    /**
     * A constructor to initialise Block object
     *
     * @param block to represent the block
     */

    public Block (String block) {
        this.block = block;
    }

    /**
     * Returns block from the address
     *
     * @return block (string type) from the address
     */

    public static String getBlock() {
        return block;
    }

}