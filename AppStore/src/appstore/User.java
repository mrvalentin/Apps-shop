/**
 * @project AppStore
 * @name User.java
 * @package appstore
 * @created 12-Dec-2014
 * @author ioGhost
 */
package appstore;

public class User implements java.io.Serializable {

    private String username,name,address,profession;
    private int trialUsed,appPurchased;

    // constructor
    public User(String username, String name, String address, String profession){
        this.username = username;
        this.name = name;
        this.address = address;
        this.profession = profession;
        this.trialUsed = 0;
        this.appPurchased=0;
    }

    // default constructor
    public User (){
        this.username ="";
        this.name = "";
        this.address = "";
        this.profession = "";
        this.trialUsed = 0;
        this.appPurchased=0;
    }

    /*** start getters ***/
    public String getUsername (){
        return this.username;
    }

    public String getName (){
        return this.name;
    }

    public String getAddress (){
        return this.address;
    }

    public String getProfession (){
        return this.profession;
    }
    
    public int getTrialUsed (){
        return this.trialUsed;
    }
    
    public int getAppPurchased() {
        return this.appPurchased;
    }
    /*** start setters ***/
    public void setUsername (String username){
        this.username=username;
    }
    
    
    public void setName (String name){
        this.name=name;
    }
    
    public void setAddress (String address){
        this.address=address;
    }
    
    public void setProfession (String profession){
        this.profession=profession;
    }
    
    public void setTrialUsed (int trialUsed){
        this.trialUsed=trialUsed;
    }
    
    public void setAppurchased(int appPurchased){
        this.appPurchased=appPurchased;
    }
    // Shows user information on user's profile
    public void showProfile () {
        System.out.println("Username: "+this.username+":\n"
        +"Name:"+this.name+"\n"
        +"Address:"+this.address
        +"\n"+"Profession:"+this.profession+"\n");
    }
    //Increment the number of app the user has been purchased
    public void AppPurchased(){
        this.appPurchased++;
    }
}
