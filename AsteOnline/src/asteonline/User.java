/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

/**
 *
 * @author gcarl
 */
public class User {
    private final int userId;
    private final String username;
    private final String password;
    
    public User(int id, String name, String pwd)
    {
        this.userId = id;
        this.username = name;
        this.password = pwd;
    }

    public int getId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
