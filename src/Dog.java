import java.util.ArrayList;

/**
 * The Dispatcher Class
 * Here acting as Event Source also
 */
public class Dog {

    String name;
    /**
     * Stores the list of subscribers
     */
    private ArrayList<Police> police = new ArrayList<Police>();

    /**
     * Takes identifier for Dispatcher
     * @param name
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * API to subscribers to subscribe Dispatcher
     * @param police
     */
    public void subscribe(Police police){
        this.police.add(police);
    }

    /**
     * Action generator
     */
    public void bark(){
        for(Police police : this.police){
            police.handleBark(name);
        }
    }

}
