/**
 * @project AppStore
 * @name Storage.java
 * @package appstore.io
 * @created 12-Dec-2014
 * @author ioGhost
 */
package appstore.io;

import java.io.*;

public class Storage {
    
    // returns serializable object that has been stored in file
    public static < E > E getObject (String filename){
        
        // initializes object that will be returned
        // E can be any object
        E object = null;
        
        //  error handling
        try {
            //  onnects to file
            FileInputStream fileIn = new FileInputStream(filename+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // returns boject in file
            object = (E) in.readObject();
            
            // close connection to file
            in.close();
            fileIn.close();
            
        }catch(IOException | ClassNotFoundException e) {
            // prints error cause
            // there may be better way to do this
            e.printStackTrace();
        }
        return object;
    }
    
    // stores serializable object
    // previous object with same filename will be OVERWRITTEN
    public static < E > void storeObject(E object, String filename) {
        try {
            // connects to file
            FileOutputStream fileOut = new FileOutputStream(filename+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            // serializes and stores object into file
            out.writeObject(object);
            
            // closes connection to file
            out.close();
            fileOut.close();
        }
        catch(IOException e) {
            // prints error cause
            // there may be better way to do this
            e.printStackTrace();
        }
    } 
    
    // returns ture if file exists
    public static boolean fileExists(String filename) {
        
        // path to file
        File x = new File(filename+".ser");
        
        // checks if file exists
        return x.exists();
    }
}
