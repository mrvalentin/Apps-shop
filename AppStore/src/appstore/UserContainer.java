/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class UserContainer extends Container {

    public UserContainer() {
        super("User");
    }
    
    public void storeUsers(){
        super.storeArrayList();
    }
    
    public void addUser(User user){
        super.addObject(user);
        storeUsers();
    }
}
