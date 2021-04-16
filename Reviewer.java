/**
 * Representation of reviewer
 * @author shahrukhzarir
 *
 */

public class Reviewer extends User {

    /**
     * Creates new Reviewer
     * @param username username of Reviewer
     * @param email email of Reviewer
     */
    public Reviewer(String username, String email) {
        super(username, email);
        // TODO Auto-generated constructor stub
    }

    /**
     * Writes a review
     * @param restaurant restaurant being reviewed
     * @param thumbsUp whether approved by Reviewer
     * @param comments comments made by Reviewer
     */
    public void writeReview(Restaurant restaurant, boolean thumbsUp, String comments){
        Review newReview = new Review(this, thumbsUp, comments);
        restaurant.addReview(newReview);
    }
}