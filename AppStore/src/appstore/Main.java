/**
 * @project AppStore
 * @name Main.java
 * @package appstore
 * @created 12-Dec-2014
 * @author ioGhost
 */
package appstore;

import java.util.Scanner;
import appstore.containers.UserContainer;
//import appstore.containers.AppContainer;

public class Main {

    public static void main (String[] args) {
        
        User user; // storing object of the current user (session)
        Scanner input = new Scanner(System.in); // scanner object
        
        String command = ""; // store user input
        
        boolean logged = false; // will run the login loop
        boolean run = true; // will run the main loop
        
        // welcome message
        System.out.println("Welcome to AppStore version 0.1\n"
                + "Created by Khalil, Valentin, Svetlozar & Robert");
        
        
        
        // login / registration loop
        while (logged == false) {
            
            // fetch user input
            System.out.println("\n\nPlease type \"login\" "
                    + "if you already have an account or"
                    + " \"register\" to create new one.");
            System.out.print("Command: ");
            command = input.nextLine();
            
            // login command
            if (command.equals("login")) {
                // let the manage user class deal with the login
                user = ManageUser.login();
                
                // go out of the loop, only if the user successfully logged
                if (user != null) {
                    logged = true;
                }
            }
            
            // registration command
            else if (command.equals("register")) {
                // let the manage user class deal with the registration
                ManageUser.register();
            }
            
            // invalid command
            else {
                System.out.println("Invalid command, please try again.");
            }
            
        }
        
        
        
        // main loop
        while (run == true) {
            
            // display main menu
            System.out.println("The following commands are available:"
                    + "APPS\n"
                    + "\t1) add app\n"
                    + "\t2) view app\n"
                    + "\t3) update app\n"
                    + "\t4 delete app\n"
                    + "\n"
                    + "USERS\n"
                    + "\t1) view user\n"
                    + "\t2) update user\n"
                    + "\t3) delete user\n");
            
            // get user input
            System.out.print("Command: ");
            command = input.nextLine();
            
            
            
            // switch between the commands
            switch (command) {
                
                // view user
                case "view user":
                    
                    // ask for username
                    System.out.print("Search for: ");
                    command = input.nextLine();
                    
                    // display profile information
                    //UserContainer.userInformation(command);
                    
                    System.out.println("\nPress enter to go back.");
                
            }
            
        }
        
        // goodbye message
        System.out.println("Goodbye.");
    }
     
}
