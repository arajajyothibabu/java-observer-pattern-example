/**
 * Event Subscriber Class
 */
public class PoliceOfficial implements Police {

    String name;

    /**
     * Identifier for Subscriber
     * @param name
     */
    public PoliceOfficial(String name) {
        this.name = name;
    }

    /**
     * Custom handler for action
     * @param name
     */
    @Override
    public void handleBark(String name) {
        System.out.println(this.name + " heard " + name + " barking..!");
    }

}
