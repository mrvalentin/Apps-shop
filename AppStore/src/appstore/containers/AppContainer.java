/**
 *ALL TRESPASSERS WILL BE PROS
 *
 *@author Robert K1317131
 */

package appstore.containers;

import appstore.App;
import java.util.Iterator;

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
    
    //returns sum of all apps purchased
    public int getTotalPurchases(){
        //this number will be returned
        int total = 0;
        
        //initializes iterator to iterate through ArrayList
        Iterator it = this.l.iterator(); 
        
        //adds total purchases of next app as long as there are more apps in array
        while (it.hasNext()){
            App a = (App) it.next();
            total += a.getTimesPurchased();
        }
        
        //returns sum of purchases of all apps
        return total;
    }
    
}
