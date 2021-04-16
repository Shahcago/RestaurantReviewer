import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representation of Restaurant
 * @author shahrukhzarir
 */
public class Restaurant {
    protected String name;
    protected String neighbourhood;
    protected String priceRange;
    protected List<String> cuisines;
    protected Map<Integer, Review> reviews;

    /**
     * Creates a new restaurant
     * @param name name of restaurant
     * @param hood neighborhood of restaurant
     * @param price price range of restaurant
     * @param cuisines food offered
     */
    public Restaurant(String name, String hood, String price, List<String> cuisines){
        this.name = name;
        this.neighbourhood = hood;
        this.priceRange = price;
        this.cuisines = cuisines;
        this.reviews = new HashMap<Integer, Review>();
    }

    /**
     * Adds review to reviews
     * @param review a representation of Review
     */
    public void addReview(Review review){
        reviews.put(review.getReviewID(), review);

    }

    /**
     * Gets name of restaurant
     * @return name of restaurant
     */
    public String getName() {
        return name;
    }

    /**
     * Gets neighborhood of Restaurant
     * @return neighborhood of restaurant
     */
    public String getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Gets  price range of restaurant
     * @return price range of restaurant
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * Gets list of cuisines
     * @return list of cuisines
     */
    public List<String> getCuisines() {
        return cuisines;
    }

    /**
     * Gets map of reviews
     * @return map of reviews
     */
    public Map<Integer, Review> getReviews() {
        return reviews;
    }

    /**
     * Gets review
     * @param reviewID reviewID of the desired review
     * @return review desired
     */
    public Review getReview(int reviewID){
        return reviews.get(reviewID);
    }

    /**
     * Calculates the percentage of thumbs up
     * @return percentage of thumbsUp
     */
    public double percentageThumbsUp(){
        double numThumbsUp = 0.0;
        for(Review review : reviews.values()){
            numThumbsUp += (review.getThumbsUp()) ? 1 : 0;
        }
        return reviews.size()==0 ? 0 : numThumbsUp/reviews.size();

    }

    /**
     * adds a certain food to the menu
     * @param cuisine the food that is being added to menu
     */
    public void addCuisine(String cuisine){
        cuisines.add(cuisine);
    }

    /**
     * removes food from menu
     * @param cuisine food that is being removed
     */
    public void removeCuisine(String cuisine){
        cuisines.remove(cuisine);
    }
}