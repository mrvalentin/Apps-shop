/**
 * @project AppStore
 * @name ManageUser.java
 * @package appstore
 * @created 12-Dec-2014
 * @author ioGhost
 */
package appstore;

import java.util.Scanner;
import appstore.containers.UserContainer;

public class ManageUser {
    
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
    
    
    
    public static void register () {

        // create new UserContainer object
        // we need it so we can use the add method
        // and add the user credentials to the ArrayList
        UserContainer container = new UserContainer();
        
        Scanner input = new Scanner(System.in); // create the scanner object
        String userInput; // storing user input
        
        // the items in this array would be replaced with the user input
        // values during the for loop below
        String[] array = {"username", "name", "address", "profession"};
        
        // this loop will ask user for input and replace the values of the array
        // above with the user input
        for (int i = 0; i < array.length; i++) {
            
            // this do loop is used in order to validate each array item
            // by using the validation class
            do {
                // ask for user input
                System.out.print("Please, enter " + array[i] + ": ");
                userInput = input.nextLine();
            }   while ( validation(array[i], userInput) ); // push that input through the validation
            
            // replace the array item with the user input
            array[i] = userInput;
        }
        
        // create an object of type user to which we'll pass the data we've obtained
        // above during the registration
        User user = new User(array[0],array[1],array[2],array[3]);
        
        // add the newly created user object in the ArrayList
        container.add(user);
        
        // save the updated ArrayList into a text file
        container.store();
    }
    
    
    
    // validation method
    public static boolean validation (String key, String value){
        
        // create new UserContainer object
        // we need it so we can use the find method
        // and verify is the username present in the ArrayList
        UserContainer container = new UserContainer();
        
        // list of censored words that won't be allowed in the system
        String[] censored_words={"fuck","suck","wanker","shit","poop"};
        
        // check if the user input contains any of the censored words above
        for (String censored_word : censored_words) {
            
            // user input match one of the censored words
            if (value.contains(censored_word)) {
                // display error on the screen
                System.out.println("You are not allowed to use the word " + value + ".");
                
                // since error is found, we are returning true to break the for loop
                return true;
            }
        }
        
        
        
        // each 'key' has its own validation
        switch (key) {
            
            case "username":
                // username is already registered
                if (container.find(value)!= null) {
                    System.out.println("The username you've chosen is already in use by another member.");
                    return true;
                }
                
                // make sure we've provided a value for the username and the username is not longer than 10 characters
                else if (value == null || value.contains(" ") || value.isEmpty() || value.length() > 10) {
                    System.out.println("Your username can't contain any 'spaces' be empty or have more than 10 characters.");
                    return true;
                }
                
                // minimum number of characters in username that are allowed
                else if( value.length() < 2 ) {
                    System.out.println("Your username must contain more than 1 character.");
                    return true;
                }
                
                // no errors found
                return false;
                
                
                
            case "name":
                // make sure name is provided
                if (value == null || value.isEmpty()) {
                    System.out.println("The name field is required.");
                }
                
                // check does the name contain any 'special' symbols
                else if (value == null || value.contains("#") || value.contains("*") || value.contains("$")) {
                   System.out.println("Your name can contain only A-Z");
                   return true;
                }
                
                // no errors are found
                return false;
                
                
                
            // address field validation    
            case "address":
                // address input is empty
                if (value == null || value.isEmpty()) {
                    System.out.println("The address field is required.");
                    return true;
                }
                
                // no errors are found
                return false;
                
                
                
            // profession field validation
            case "profession":
                // profession is a student
                if (value.equals("student")) {
                    System.out.println("Your account is eligible for 25% discount.");
                    return false;
                }
                
                // profession is a educational institution
                else if (value.equals("university")) {
                    System.out.println("Your account is eligible for 15% discount.");
                    return false;
                }
                
                // no profession provided provided
                else if(value.isEmpty()||value == null){
                    System.out.println("The profession field is required.");
                    return true;
                }
                
                // returning false if no errors found
                return false;
        }
        
        // return false if none of the fields 'activates'
        return false;
    }
}
