package asteonline;

import java.util.UUID;

/**
 * The class representing the user in the system
 * @author gcarl
 */
public class User {
    private final UUID userId;
    private final String username;
    private final String password;
    
    /**
     * Creates a user with username and password passed.
     * @param name username of the user
     * @param pwd password of the user
     */
    public User(String name, String pwd)
    {
        this.userId = java.util.UUID.randomUUID();
        this.username = name;
        this.password = pwd;
    }
    
    /**
     * Returns the unique id of the user
     * @return the UUID
     */
    public UUID getId() {
        return userId;
    }
    
    /**
     * Returns the username of the user
     * @return username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Returns the password of the user
     * @return password
     */
    public String getPassword() {
        return password;
    }
}
