package asteonline;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The class in charge to memorize and provide login and logout functionalities in the cannolo.
 * @author gcarl
 */
public class UserManager {
    private static UserManager instance = null;   
    private static final Object sync = new Object();
    private User signedInUser = null;
    private List<User> users;
    
    /**
     * Returns the singleton instance
     * @return UserManager instance
     */
    public static UserManager getInstance(){
        synchronized(sync) {
            if(instance == null) instance = new UserManager();
        }
        return instance;
    }
    
    private UserManager() {
        this.users = new ArrayList<>();
    }
    
    /**
     * Adds an user to the system
     * @param u the user to add
     * @return true if the add is success
     */
    public boolean add(User u) {
        if(u == null)
            throw new IllegalArgumentException();
        
        boolean res;
        res = this.users.add(u);
        
        return res;
    }
    
    /**
     * Removes an user from the system
     * @param id the UUID of the user to remove
     * @return true if the add is success
     */
    public Boolean remove(UUID id) {
        if(id == null)
            throw new IllegalArgumentException();
        
        User userResult = null;
        for (User usersItem : this.users) {
            if (usersItem.getId().equals(id)) {
                userResult = usersItem;
            }
        }
        
        boolean res = false;
        if(userResult != null)
            res = this.users.remove(userResult);
        
        return res;
    }
    
    /**
     * Signs in the test user
     */
    public void login() {
        this.signedInUser = new User("caas@isw.com","verybello");
    }
    
    /**
     * Signs out the test user
     */
    public void logout() {
        this.signedInUser = null;
    }
    
    /**
     * Returns the user current signed in
     * @return the user
     */
    public User getSignedInUser() {
        return this.signedInUser;
    }
}
