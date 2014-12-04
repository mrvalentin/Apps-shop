/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore;

/**
 *
 * @author Robert
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
}