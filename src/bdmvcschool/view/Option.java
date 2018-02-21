package bdmvcschool.view;

public class Option {

    /*=======Attributes=======*/
    private String description;

    /*=======Constructors=======*/
    /**
     * Option() Option constructor
     *
     * @param desc desc
     */
    public Option(String desc) {
        description = desc;
    }

    /*=======Methods=======*/
    /**
     * toString() converts option to string
     *
     * @return String conversion
     */
    @Override
    public String toString() {
        return description;
    }
}
