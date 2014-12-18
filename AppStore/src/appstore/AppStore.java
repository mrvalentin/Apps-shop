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
    
        //logged in user
        User u;
        
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
                + "- edit app\n"
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
                    
                    case "search app":
                        System.out.println("enter name of app");
                        command = input.nextLine();
                        //find app
                        App a = appCont.find(command);
                        a.showApp();
                        
                    case "add app":
                        ManageApp.add();
                        break;
                        
                    case "list app":
                        //
                        break;
                        
                    case "list users":
                        //
                        
                        
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
