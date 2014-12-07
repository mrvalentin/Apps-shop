/*
 * ALL TRESPASSERS WILL BE PROS
 */

package appstore;

import java.util.ArrayList;
/**
 *
 * @mage Robert
 */

//this abstract class interacts with Storage to retrieve and store ArrayList object file 
//(it doesnt because its abstract but you should know)
public abstract class Container implements java.io.Serializable {
    
    protected ArrayList l;
    //classname is the class of objects stored in arraylist
    protected String classname;
    
    public Container(String classname){
        //check if file exists before retrieving it
        if (Storage.fileExists(classname)){
            l = Storage.getObject(classname);
            this.classname=classname;
        }
        //retireves ArrayList object
        else {
            l = new ArrayList();
            this.classname = classname;
        }
    }
    
    //sends ArrayList of instance to class Storage to be serialized into file
    //ALL objects INSIDE the ArrayList object MUST be SERIALIZABLE
    //ALL objects inside ArrayList should be of same class because they will be stored in a file with the name of the class
    public void storeArrayList(){
        Storage.storeObject(l, classname);
    }
    
    //adds new object into ArrayList
    //returns true if successfull
    public < E > boolean add(E object){
        boolean add = l.add(object);
        return add;
    }
}
