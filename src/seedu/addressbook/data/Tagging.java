package seedu.addressbook.data;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * Represents whether a tag has been added or remved for a person in the current session
 */
public class Tagging {
    
    private final Person person;
    private final Tag tag;
    private boolean isTagRemoved;

    /**
     * Constructs a tagging record
     * 
     * @param person the person affected
     * @param tag the tag changed
     * @param isTagRemoved {@code true} if tag is removed {@code false} if tag is added 
     */
    
    public Tagging(Person person, Tag tag, boolean isTagRemoved) {
        this.person = person;
        this.tag = tag;
        this.isTagRemoved = isTagRemoved;
    }
    
    @Override
    public String toString() {
        return (isTagRemoved ? "- " : "+ ") + person.getName().toString() + "[ " + tag.tagName +"]";
    }
    
}
