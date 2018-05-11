/**
 * Subscriber Class (The Super Class for all Listeners)
 */
public interface Police {

    /**
     * Interface method to handle Action from dispatcher
     * @param name
     */
    public void handleBark(String name);

}
