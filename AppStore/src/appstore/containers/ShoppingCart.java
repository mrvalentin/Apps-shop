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
    
    //returns sum of price of all apps based on user that is buying
    public double getTotalPrice(){
        
        Iterator it = l.iterator();
        
        double price = 0;
        
        while (it.hasNext()){
            App app;
            app = (App) it.next();
            price =+ app.checkPrice(customer);
        }
        
        return price;
    }
    
    //purchase all apps in Shopping Cart
    public void buyAll(){
        
        Iterator it = l.iterator();
        
        double price = 0;
        
        while (it.hasNext()){
            App app;
            app = (App) it.next();
            app.purchase(customer);
        }
    }
    
    //returns list of names with all apps in cart
    public String returnAllAppNames(){
        
        String appnames = "";
        
        //initializes iterator
        Iterator it = l.iterator();
        
        while (it.hasNext()){
            App a = (App) it.next();
            appnames = appnames.concat(a.getName()+"\n");
        }
        
        return appnames;
    }
}
