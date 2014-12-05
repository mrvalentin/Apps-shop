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
    
    public void store(){
        super.storeArrayList();
    }
    
    public void add(App app){
        super.add(app);
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

}
