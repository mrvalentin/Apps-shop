/**
 * @project AppStore
 * @name UserContainer.java
 * @package appstore.containers
 * @created 12-Dec-2014
 * @author ioGhost
 */
package appstore.containers;

import java.util.Iterator;
import appstore.User;

public class UserContainer extends Container {

    // class constructor
    public UserContainer() {
        
        // uses Container's constructor and passes
        // 'user' as a name of the file the user information
        // will be stored in.
        super("User");
    }
    
    
    
    // sends ArrayList of instance to class Storage to be serialized into file
    // ALL objects INSIDE the ArrayList object MUST be SERIALIZABLE
    // ALL objects inside ArrayList should be of same class because they will be stored in a file 
    // with the name of the class
    public void store () {
        super.storeArrayList();
    }
    
    
    
    // adds user to ArrayList and stores new arraylist
    public void add (User user) {
        
        // checks if username already exists
        if (this.find(user.getUsername())== null) {
            super.add(user);
        }
    }
    
    // searches userlist for username
    public User find (String username) {
        
        // initializes iterator
        Iterator it = l.iterator();
        
        // checks username while a user exists
        while (it.hasNext()) {
            User u = (User) it.next();
            if (u.getUsername().equals(username)){
                return u;
            }
        }
        
        // returns null if no match is found
        return null;
    }
    
    
    
    // deletes user with given username
    public void delete(String username) {
        User u = this.find(username);
        l.remove(u);
    }
    
}
