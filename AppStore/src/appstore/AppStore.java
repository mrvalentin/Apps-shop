/**
 * @project AppStore
 * @name AppStore.java
 * @package appstore
 * @created 18-Dec-2014
 * @author ioGhost
 */
package appstore;

import java.util.Scanner;
import appstore.containers.UserContainer;
import appstore.containers.AppContainer;
import appstore.ManageUser;
import appstore.ManageApp;

public class AppStore {

    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in); // scanner object
        
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
                    ManageUser.login();
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
    }
    
}