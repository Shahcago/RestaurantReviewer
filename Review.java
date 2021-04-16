/**
 * Representation of a Review
 * @author shahrukhzarir
 *
 */

public class Review {

    private boolean thumbsUp;
    private Reviewer reviewer;
    private String comments;
    private String response = null;
    private int reviewID;
    private static int  numReviews= 0;

    /**
     * Creates a review
     * @param reviewer a representation of Reviewer
     * @param thumbsUp if Reviewer approves food
     * @param comments comments of Reviewer
     */
    public Review(Reviewer reviewer, boolean thumbsUp, String comments) {
        this.reviewer = reviewer;
        this.thumbsUp = thumbsUp;
        this.comments = comments;
        this.reviewID = Review.numReviews;
        numReviews ++;

    }
    /**
     * Gets whether approved or not
     * @return boolean of whether food is approved
     */
    public boolean getThumbsUp() {
        return thumbsUp;
    }

    /**
     * gets Reviewer
     * @return reviewers
     */
    public Reviewer getReviewer() {
        return reviewer;
    }

    /**
     * gets comments made by Reviewer
     * @return comments made by Reviewer
     */
    public String getComments() {
        return comments;
    }

    /**
     * gets ReviewID of Review
     * @return reviewID of Review
     */
    public int getReviewID() {
        return reviewID;
    }

    /**
     * gets response of Owner
     * @return
     */
    public String getResponse() {
        return response;
    }

    /**
     * sets response of Owner
     * @param response new response of Owner
     */
    public void setResponse(String response) {
        this.response = response;
    }

}
