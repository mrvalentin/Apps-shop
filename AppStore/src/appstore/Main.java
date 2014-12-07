package appstore;

import appstore.containers.UserContainer;
import java.util.Scanner;

class Main {
    
    // main method
    public static void main (String[] args) {
        
        //creates bob user so that you can try logging in as bob
        UserContainer users = new UserContainer();
        User bob=new User("bob", "Boob", "lalavale", "roach");
        users.add(bob);
        users.store();
        
        //an object that represents the current user that is using the program
        User user;
        // keeping the application running
        boolean run = true;
        
        // store the user input
        String command;
        
        // initialize the scanner
        Scanner userInput = new Scanner(System.in);
        
        // main loop
        while (run == true) {
            
            // Display the main menu
            System.out.println("1.0) User management");
            System.out.println("\t1.1) User login");
            System.out.println("\t1.2) User registration");
            
            // Ask for user input
            System.out.print("\nCommand: ");
            command = userInput.nextLine();
            
            // start switch statements
            switch (command) {
                
                // User login
                case "1.1":
                    
                    
                    //user login
                    user = ManageUser.Login();
                    
                    
                    //Login will be called twice with code below  Sincerely, Rob :P
                    /*
                    //If the user can't type his username correctly
                    if(ManageUser.Login() == null)
                        break;
                    //If the user typed it correctly, the user object gets the info of the person who logged in
                    user=ManageUser.Login();
                    */
                
                // User registration
                case "1.2":
                    ManageUser.Registration();
                    break;
                    
                case "exit":
                    run = false;
                    break;
                    
                default:
                    System.out.println("Invalid command.\n");
                    break;
            }
            
        }
        
        // Goodbye message
        System.out.println("Thank you for using AppStore v0.1 \n"
                + "Goodbye.");
    } 
    
}
