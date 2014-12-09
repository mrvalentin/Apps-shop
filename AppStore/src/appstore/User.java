//Valentin

package appstore;

public class User implements java.io.Serializable {
  
  private String username,name,address;
  private int trialUsed;
  private Prof profession;
  
  public enum Prof {
      STUDENT, ACADEMIC, NORMAL
  }
  
  //Constructors
  public User(String username, String name, String address, Prof profession){
      this.username = username;
      this.name = name;
      this.address = address;
      this.profession = profession;
      this.trialUsed = 0;
  }
 
  public User(){
      this.username ="";
      this.name = "";
      this.address = "";
      this.profession = Prof.NORMAL;
      this.trialUsed = 0;
  }
  // returns username
  public String getUsername(){
  return this.username;
  }
  //returns user'name
  public String getName(){
  return this.name;
  }
  //returns user' address
  public String getAddress(){
  return this.address;
  }
  // returns user' profession
  public Prof getProfession(){
  return this.profession;
  }
  //returns number of tiral used by the user
  public int getTrialUsed(){
  return this.trialUsed;
  }
  //setters
  public void setUsername(String username){
  this.username=username;
  }
  public void setName(String name){
  this.name=name;
  }
  public void setAddress(String address){
  this.address=address;
  }
  public void setProfession(Prof profession){
  this.profession=profession;
  }
  public void setTrialUsed(int trialUsed){
  this.trialUsed=trialUsed;
  }
  // Shows user information on user's profile
  public void showProfile(){
  System.out.println("Username: "+this.username+":\n"
  +"Name:"+this.name+"\n"
  +"Address:"+this.address
  +"\n"+"Profession:"+this.profession+"\n");
  }
}
