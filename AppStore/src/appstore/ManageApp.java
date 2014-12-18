/**
 * @project AppStore
 * @name ManageApp.java
 * @package appstore
 * @created 12-Dec-2014
 * @author ioGhost
 */
package appstore;

import java.util.Scanner;
import appstore.containers.AppContainer;

public class ManageApp {
    
    /*
    // login class that will loop until an existing username id entered
    // or the word 'back' is written.
    public static User login () {
        
        // create new UserContainer object
        // we need it so we can use the find method
        // and verify is the username present in the ArrayList
        UserContainer container = new UserContainer();
        
        
        Scanner input = new Scanner(System.in); // create the scanner object
        String userInput; // storing user input
        
        //the loop return 
        do {
            // ask the user to enter a username that must already
            // be present in the ArrayList
            System.out.print("Username: ");
            userInput = input.nextLine();
            
            // check if the username entered is in the ArrayList
            if (container.find(userInput) != null) {
                // if username found, return the object and get out of the loop
                return container.find(userInput);
            }
        
            else{
                System.out.println("The username you've entered is incorrect.\n"
                        + "Please try again, or type \"back\" to go back.");
            }
        } while( ! userInput.equals("back"));
        
        // return null in case the user wants to go back
        // and have not successfully logged in.
        return null;
    }
    */
    
    
    public static void add () {

        // create new AppContainer object
        // we need it so we can use the add method
        // and add the user credentials to the ArrayList
        AppContainer container = new AppContainer();
        
        Scanner input = new Scanner(System.in); // create the scanner object
        String userInput; // storing user input
        
        // the items in this array would be replaced with the user input
        // values during the for loop below
        String[] array = {"name", "developer", "description", "category", "cost", "trialAvailable"};
        
        // this loop will ask user for input and replace the values of the array
        // above with the user input
        for (int i = 0; i < array.length; i++) {
            
            // ask for user input
            System.out.print("Please, enter " + array[i] + ": ");
            userInput = input.nextLine();
            
            // replace the array item with the user input
            array[i] = userInput;
        }
        double cost=Double.parseDouble(array[4]);
        boolean trial=Boolean.parseBoolean(array[5]);
        // convert some of the objects
        //boolean array[5] = Boolean.valueOf("true");
        
        // create an object of type user to which we'll pass the data we've obtained
        // above during the registration
        App app = new App(array[0],array[1],array[2],array[3],cost,trial);
        
        // add the newly created user object in the ArrayList
        container.add(app);
        
        // save the updated ArrayList into a text file
        container.store();
    }
    
}
