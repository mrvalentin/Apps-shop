/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appstore;

import java.util.Scanner;

/**
 *
 * @author Valentin
 */
public class Manage_user {
    //Login class that is asking for the correct login until it is correct or user typed exit
    public static User Login(){
        UserContainer container=new UserContainer();
        System.out.println("Write down your username,please:");
        Scanner input=new Scanner(System.in);
        //the input of the user
        String user_input;
        //the loop return 
        do{
        user_input=input.nextLine();
        if(container.find(user_input)!=null){
            return container.find(user_input);
        }
        else{
            System.out.println("Wrong username.\n"
                    + "Type exit to go to the main menu.\n"
                    + "Please try again:");
        }
        }while(user_input.equals("exit"));
        return null;
    }
    public static void Registration(){
        //opening Scanner
        Scanner input=new Scanner(System.in);
        //user_input:the variable for what user input
        String user_input;
        //as far as container can't be static I have to create object of UserContainer
        UserContainer container=new UserContainer();
        String[] array={"username","name","address","profession"};
        for(int i=0;i<array.length;i++){
            System.out.println("Please write "+array[i]+":");
            do{
            user_input=input.nextLine();
            }while(Validation(array[i],user_input));
            array[i]=user_input;
        }
        User user=new User(array[0],array[1],array[2],array[3]);
        container.add(user);
    }
    public static boolean Validation(String key,String value){
        if(value.contains("fuck")||value.contains("suck")||value.contains("wanker")||value.contains("noob")
                ||value.contains("dick")||value.contains("Robert")){
            System.out.println("Hey!Watch your mouth you motherfucker!");
            return true;
        }
        UserContainer container= new UserContainer();
        switch(key){
            case "username":
                if(container.find(value)!=null){
                    System.out.println("There is another user with "+value+" username.Please write another name:");
                    return true;
                }
                else if(value.equals(null)||value.contains(" ")||value.isEmpty()||value.length()>10){
                    System.out.println("Your username must not have free spaces,be empty or has more than 10 characters.Please write your name again:");
                    return true;
                }
                else if(value.equals("Robert")){
                    System.out.println("Robert you smell.");
                    return true;
                }
                return false;
                
            case "name":
                if(value.equals(null)||value.contains("#")||value.isEmpty()){
                   System.out.println("Your name can't be empty or contain # symbol.Please write your name again:");
                   return true;
                }
                else if(value.equals("Robert")){
                    System.out.println("Robert you smell.");
                    return true;
                }
                return false;
                
            case "address":
                if(value.equals(null)||value.isEmpty()){
                    System.out.println("The address can't be empty.Please write your address again:");
                    return true;
                }
                return false;
                
            case "profession":
                if(value.equals("student")){
                    System.out.println("Yo man you have 25% discount!");
                    return false;
                }
                else if(value.isEmpty()||value.equals(null)){
                    System.out.println("The profession can't be empty.Please write your profession again:");
                    return true;
                }
                return false;
        }
        return false;
    }
}