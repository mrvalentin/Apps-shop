/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore.containers;

import appstore.App;
import appstore.User;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Robert
 */
public class ShoppingCart {
    
    private ArrayList l = new ArrayList();
    
    private User customer;
    
    //constructor takes customer as input
    public ShoppingCart(User U){
        this.customer = U;
    }
    
    //searches shoppingcart for app with given name
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
    
    //add app to shopping cart if its not already there
    public void addApp(App app){
        
        String appname = app.getName();
        
        if (find(appname)==null){
            l.add(app);
        }
    }
    
    //deletes app with name from shopping list
    public void deleteApp(App app){
        l.remove(app);
    }
}
