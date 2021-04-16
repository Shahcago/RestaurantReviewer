import java.util.List;

/**
 * Representation of TakeoutRestaurant
 * @author shahrukhzarir
 *
 */
public class TakeoutRestaurant extends Restaurant implements Takeout {
    private int avgWaitTime;

    /**
     * Creates a new TakeoutRestaurant
     * @param name of a new restaurant
     * @param hood neighborhood of new restaurant
     * @param price price range of new restaurant
     * @param cuisines list of cuisine of new restaurant
     * @param avgWaitTime average wait time og new restaurant
     */
    public TakeoutRestaurant(String name, String hood, String price, List<String> cuisines, int avgWaitTime){
        super(name, hood, price, cuisines);
        this.avgWaitTime = avgWaitTime;

    }
    /**
     * gets average wait time of TakeoutRestaurant
     */
    public int getAvgWaitTime() {
        return this.avgWaitTime;
    }


}