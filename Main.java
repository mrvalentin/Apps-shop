import java.util.Scanner;

class Main {
    
    // main method
    public static void main (String[] args) {
        
        // keeping the application running
        boolean run = true;
        
        // store the user input
        String command = "";
        
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
                    System.out.println("User login\n");
                    break;
                
                // User registration
                case "1.2":
                    System.out.println("User register\n");
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
