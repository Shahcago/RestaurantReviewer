import java.util.Date;
import java.util.List;
/**
 * A representation of a LicensedRestaurant.
 * @author Shahrukh
 *
 */
public class LicensedRestaurant extends Restaurant {
    private Date expiryDate;

    /**
     * Creates a LicensedRestaurant with the given name, neighborhood, price, and cuisine.
     * @param name name of the new Licensed Restaurant
     * @param hood neighborhood of the restaurant
     * @param price price of the food
     * @param cuisine food offered at restaurant
     */
    public LicensedRestaurant(String name, String hood, String price, List<String> cuisines, Date date){
        super(name, hood, price, cuisines);
        this.expiryDate = date;
    }

    /**
     * Returns the expiry date of LicensedRestaurant .
     * @return expiry date
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the expiry date of this LicensedRestaurant to expiryDate.
     * @param expiryDate the new expiry date of this LicensedRestaurant
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


}