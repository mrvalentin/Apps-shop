/**
 * @project AppStore
 * @name AppStore.java
 * @package appstore
 * @created 18-Dec-2014
 * @author ioGhost
 */
package appstore;

import appstore.ManageApp;
import appstore.ManageUser;
import appstore.containers.AppContainer;
import appstore.containers.ShoppingCart;
import appstore.containers.UserContainer;
import java.util.Scanner;

public class AppStore {

    public static void main(String[] args) {
    
        //logged in user
        User u = null;
        
        Scanner input = new Scanner(System.in); // scanner object
        UserContainer usrCont = new UserContainer();
        AppContainer appCont = new AppContainer();
        
        String command = ""; // storing user input
        
        boolean logged = false; // is the user logged or not
        boolean run = true; // used for the main loop
        
        // welcome message
        System.out.println("Welcome to AppStore v0.1\n"
                + "Created by Khalil, Valentin, Svetlozar & Robert");        

         // login / register loop
        while (run == true && logged == false) {
            
            // available commands
            System.out.println("Available commands:\n"
                    + "1) login\n"
                    + "2) register\n"
                    + "3) exit\n");
            
            // fetch user input
            System.out.print("Command: ");
            command = input.nextLine();
            
            
            
            // switch statement
            switch (command) {
                
                case "login":
                    u = ManageUser.login();
                    logged = true;
                    break;
                    
                case "register":
                    ManageUser.register(); // proceed with user registration
                    System.out.println("\nRegistration completed successfully."); // registration completed
                    break;
                    
                case "exit":
                    run = false;
                    break;
                    
                default:
                    System.out.println("\nInvalid command.\n");
                    break;
            }
            
        }      
        
        while (run == true) {
            // available commands
            System.out.println("\nAvailable commands:\n"
                + "- add app\n"
                + "- list app\n"
                + "- buy app\n"
                + "- delete app\n"
                + "- search app\n"
                + "- get app\n"
                + "-\n"
                + "- list users\n"
                + "- edit user\n"
                + "- delete user\n"
                + "--- exit");  
            
                // fetch user input
                System.out.print("Command: ");
                command = input.nextLine();
                
                
                
                // switch between commands
                switch (command) {
                    
                    case "total purchases":
                        AppContainer.getTotalPurchases();
                    
                    case "add app":
                        ManageApp.add();
                        break;
                        
                    case "list app":
                        System.out.println(appCont.returnAllAppNames());
                        break;
                        
                    case "list users":
                        System.out.println(usrCont.returnAllUserNames());
                        break;
                        
                    case "buy apps":
                        while(true) {
                            System.out.println("enter appname you want to purchase, enter 'done' to checkout");
                            command = input.nextLine();
                            
                            ShoppingCart cart = new ShoppingCart(u);
                            
                            if (command.equals("done")){
                                System.out.println("total price = "+cart.getTotalPrice());
                                cart.buyAll();
                                break;
                            }
                            else {
                                App app = appCont.find(command);
                                cart.addApp(app);
                            }
                        }
                        
                    case "delete user":
                        // fetch user input
                        System.out.print("Command: ");
                        command = input.nextLine();
                        
                        // delete the user
                        usrCont.delete(command); 
                                
                        break;
                    
                    case "exit":
                        run = false;
                        break;

                    default:
                        System.out.println("\nInvalid command.\n");
                        break;
                }
        }
    }
    
}
