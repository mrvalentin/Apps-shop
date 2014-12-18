/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore.containers;

import appstore.App;
import appstore.User;
import java.util.ArrayList;

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
    
    //add app to shopping cart
    public void addApp(App app){
        l.add(app);
    }
    
    
}
