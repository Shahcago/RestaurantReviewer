

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;



/**
 * Test class of Review
 * @author shahrukhzarir
 *
 */

public class ReviewTest {
    protected Owner owner;
    protected Review reviewOne, reviewTwo, reviewThree;
    protected Reviewer michael;

    /**
     * Sets up for test methods
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        michael = new Reviewer("Michael","mike@yahoo.com");
        owner = new Owner("Tyrone", "Tyrone@gmail.com");
        reviewOne = new Review(michael, true, "really good!");
        reviewTwo = new Review(michael, false, "bad");
        reviewThree = new Review(michael, true, "");

    }

    /**
     * Resets all the variables
     * @throws Exception
     */
    @AfterEach
    public void tearDown() throws Exception {
        michael = null;
        reviewOne = null;
        reviewTwo = null;
        reviewThree = null;
    }

    public void testStaticNumReviews() {
        int reviewID =reviewOne.getReviewID();
        assertEquals(reviewID, reviewOne.getReviewID());
        assertEquals(reviewID+1, reviewTwo.getReviewID());
    }
    /**
     * Test method for getThumbsUp()
     */
    @Test
    public void testGetThumbsUp() {
        assertEquals(true, reviewOne.getThumbsUp());
        assertEquals(false, reviewTwo.getThumbsUp());
        assertEquals(true, reviewThree.getThumbsUp());
    }
    /**
     * Test method for getReviewer()
     */
    @Test
    public void testGetReviewer() {
        assertEquals(michael, reviewOne.getReviewer());
        assertEquals(michael, reviewTwo.getReviewer());
        assertEquals(michael, reviewThree.getReviewer());

    }
    /**
     * Test method for getComments()
     */
    @Test
    public void testGetComments() {
        assertEquals("really good!", reviewOne.getComments());
        assertEquals("bad", reviewTwo.getComments());
        assertEquals("", reviewThree.getComments());

    }
    /**
     * Test method for getResponse()
     */
    @Test
    public void testGetResponseNull() {
        assertEquals(null,reviewOne.getResponse());
    }

    @Test
    public void testGetResponse() {
        reviewOne.setResponse("I hate it");
        assertEquals("I hate it", reviewOne.getResponse());
    }


    /**
     * Test method for setResponse(String)
     */
    @Test
    public void testSetResponse() {
        reviewOne.setResponse("I like your review!");
        assertTrue(reviewOne.getResponse().equals("I like your review!"));
    }

}