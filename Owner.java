import java.util.HashMap;
import java.util.Map;

/**
 * A representation of a Owner.
 * @author Shahrukh
 *
 */
public class Owner extends User{

    private Map<String, Restaurant> restaurants;

    /**
     * Creates a Owner with the username, and email.
     * @param email email of user.
     * @param username username of user.
     */
    public Owner(String username, String email) {
        super(username, email);
        this.restaurants = new HashMap<String, Restaurant>();
    }

    public boolean owns(String restaurantName) {
        return restaurants.containsKey(restaurantName);

    }
    /**
     * adds restaurant to restaurants
     * @param rest a representation of Restaurant
     */
    public void addRestaurant(Restaurant rest){
        restaurants.put(rest.getName(), rest);
    }

    /**
     * responds to a review
     * @param reviewID is the given ID for the review
     * @param restName restaurant being reviewed
     * @param response response from the Owner
     */
    public void respondToReview(int reviewID, String restName, String response){
        Restaurant rest = restaurants.get(restName);
        Review review =rest.getReviews().get(reviewID);
        review.setResponse(response);
    }
    /**
     * gets the restaurant from restaurants
     * @param name name of the restaurant
     * @return Restaurant representation of name
     */
    public Restaurant getRestaurant(String name){
        return restaurants.get(name);

    }
}