import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;



/**
 * A test class for owner.
 * @author Shahrukh
 *
 */

public class OwnerTest {

    protected Restaurant restaurantOne, restaurantTwo, restaurantThree;
    protected Owner owner;
    protected Reviewer reviewer;
    protected Review reviewOne;

    @BeforeEach
    /**
     * Setup for test methods
     * @throws Exception
     */
    public void setUp() throws Exception {
        owner = new Owner("Tyrone", "Tyrone@gmail.com");
        List<String> listOfCuisine = new ArrayList<String>();
        listOfCuisine.add("Fish");
        listOfCuisine.add("Ham");
        listOfCuisine.add("Bacon");
        restaurantOne = new Restaurant("Phil's Place", "Harlem","10$-15$", listOfCuisine);
        restaurantTwo = new Restaurant("Mohammed", "Mexico","20$-25$", listOfCuisine);
        restaurantThree = new Restaurant("T-Bonez", "Toronto","20$-35$", listOfCuisine);
        reviewer = new Reviewer("Michael", "michael@yahoo.com");
        reviewOne = new Review(reviewer, true, "Really Good Food and Service");
    }

    @AfterEach
    /**
     * tear down for test methods
     * @throws Exception
     */
    public void tearDown() throws Exception {
        owner = null;
        restaurantOne = null;
        restaurantTwo = null;
        restaurantThree = null;
    }

    @Test
    /**
     * Test Constructor tests the constructor
     */
    public void testOwner() {
        assertEquals("Tyrone", owner.getUsername());
        assertEquals("Tyrone@gmail.com", owner.getEmail());
    }

    /**
     * Test addRestaurant(String, Object).
     */
    @Test
    public void testAddRestaurant() {
        owner.addRestaurant(restaurantOne);
        assertEquals("Phil's Place", owner.getRestaurant(restaurantOne.getName()).getName());
        owner.addRestaurant(restaurantTwo);
        assertEquals("Mohammed", owner.getRestaurant(restaurantTwo.getName()).getName());
        owner.addRestaurant(restaurantThree);
        assertEquals("T-Bonez", owner.getRestaurant(restaurantThree.getName()).getName());
    }
    /**
     * Test respondToReview(int,String,String).
     */
    @Test
    public void testRespondToReview() {
        owner.addRestaurant(restaurantOne);
        int reviewID =reviewOne.getReviewID();
        restaurantOne.addReview(reviewOne);
        owner.respondToReview(reviewID, "Phil's Place","Thank you very much!");
        assertEquals("Thank you very much!",reviewOne.getResponse());
    }

    /**
     * Test testGetRestaurant(String)
     */
    @Test
    public void testGetRestaurant(){
        owner.addRestaurant(restaurantOne);
        assertEquals(restaurantOne, owner.getRestaurant("Phil's Place"));
        owner.addRestaurant(restaurantTwo);
        assertEquals(restaurantTwo, owner.getRestaurant("Mohammed"));
        owner.addRestaurant(restaurantThree);
        assertEquals(restaurantThree, owner.getRestaurant("T-Bonez"));
    }

    @Test
    public void testGetRestaurantNull(){
        assertEquals(null,owner.getRestaurant("Mcdonalds"));
    }

    @Test
    public void testOwns(){
        owner.addRestaurant(restaurantOne);
        assertEquals(true,owner.owns(restaurantOne.getName()));
    }

    @Test
    public void testOwnsEmpty(){
        assertEquals(false,owner.owns("bananas"));
    }
}