/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore;

import java.util.ArrayList;
/**
 *
 * @author Robert
 */
public abstract class Container implements java.io.Serializable {
    
    protected ArrayList l;
    protected String classname;
    
    public Container(String classname){
        if (Storage.fileExists(classname)){
            l = Storage.getObject(classname);
            this.classname=classname;
        }
        else {
            l = new ArrayList();
            this.classname = classname;
        }
    }
    
    //sends ArrayList of instance to class Storage to be serialized into file
    public void storeArrayList(){
        Storage.storeObject(l, classname);
    }
    
    //adds new object into ArrayList
    //returns true if successfull
    public < E > boolean addObject(E object){
        boolean add = l.add(object);
        return add;
    }
}