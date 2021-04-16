/**
 * Representation of user
 * @author shahrukhzarir
 *
 */

public abstract class User {
    protected String username;
    protected String email;

    /**
     * Creates new users
     * @param username
     * @param email
     */
    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    /**
     * gets username
     * @return username of User
     */
    public String getUsername() {
        return username;
    }

    /**
     * gets email
     * @return email of user
     */
    public String getEmail() {
        return email;
    }
    /**
     * sets email of User
     * @param email new email desired
     */
    public void setEmail(String email) {
        this.email = email;
    }


}
