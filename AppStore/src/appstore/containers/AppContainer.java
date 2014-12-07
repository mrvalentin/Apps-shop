/*
 *ALL TRESPASSERS WILL BE PROS
 */

package appstore.containers;

import appstore.App;
import java.util.Iterator;

/**
 *
 * @mage Robert
 */
public class AppContainer extends Container {

    public AppContainer() {
        super("App");
    }
    
    public void store(){
        super.storeArrayList();
    }
    
    //adds App object to ArrayList
    public void add(App app){
        //checks if app name already exists
        if (this.find(app.getName())==null){
            super.add(app);
        }
    }
    
    //searches applist for app with given name
    public App find(String name){
        
        //initializes iterator
        Iterator it = l.iterator();
        
        //checks app name while an app exists
        while (it.hasNext()){
            App a = (App) it.next();
            if (a.getName().equals(name)){
                return a;
            }
        }
        
        //returns null if no match is found
        return null;
    }
    
    //deletes app with given name
    public void delete(String name){
        App a = this.find(name);
        l.remove(a);
    }
}
