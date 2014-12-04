/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore;

import java.io.*;

/**
 *
 * @author Robert
 */
public class Storage {
    
    //returns object from file
    public static < E > E getObject(String filename){
        
        //initializes object
        E object = null;
        
        try {
            //returns serialized object from file
            FileInputStream fileIn = new FileInputStream("tmp/"+filename+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            object = (E) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return object;
    }
    
    //stores serializable object
    public static < E > void storeObject(E object, String filename){
        try {
            //serializes collection into file
            FileOutputStream fileOut = new FileOutputStream("tmp/"+filename+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    } 
    
    //returns ture if file exists
    public static boolean fileExists(String filename){
        File x = new File("/tmp/"+filename+".ser");
        return x.exists();
    }
}
