/*
 *ALL TRESPASSERS WILL BE PRO SEC uuu Ted
 */

package appstore;

import java.util.Iterator;

/**
 *
 * @mage Robert
 */
public class AppContainer extends Container {

    public AppContainer() {
        super("App");
    }
    
    public void storeApps(){
        super.storeArrayList();
    }
    
    public void addApp(App app){
        super.addObject(app);
    }
    
    //searches userlist for 
    public User findApp(String appname){
        
        //initializes iterator
        Iterator it = l.iterator();
        
        //checks username while a user exists
        while (it.hasNext()){
            User u = (User) it.next();
            if (u.getUsername().equals(username)){
                return u;
            }
        }
        
        //returns null if no match is found
        return null;
    }

}
