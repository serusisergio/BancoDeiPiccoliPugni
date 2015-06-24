/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author gcarl
 */
public class UserManager {
    private static UserManager instance = null;   
    private static final Object sync = new Object();
    private User signedInUser = null;
    private List<User> users;
    
    public static UserManager getInstance(){
        synchronized(sync) {
            if(instance == null) instance = new UserManager();
        }
        return instance;
    }
    
    private UserManager() {
        this.users = new ArrayList<>();
    }
    
    public boolean add(User u) {
        if(u == null)
            throw new IllegalArgumentException();
        
        boolean res;
        res = this.users.add(u);
        
        return res;
    }
    
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
    
    public void login() {
        this.signedInUser = new User("caas@isw.com","verybello");
    }
    
    public void logout() {
        this.signedInUser = null;
    }
    
    public User getSignedInUser() {
        return this.signedInUser;
    }
}
