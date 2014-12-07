package appstore;

public class User implements java.io.Serializable {
  
  private String username,name,address,profession;
  private int trialUsed;
  
  //Constructors
  public User(String username, String name, String address, String profession){
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
      this.profession = "";
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
  public String getProfession(){
  return this.profession;
  }
  //returns number of tiral used by the user
  public int getTrialUsed(){
  return this.trialUsed;
  }
  //setters
  public void setUsername(String newUsername){
  this.username=newUsername;
  }
  public void setName(String newName){
  this.name=newName;
  }
  public void setAddress(String newAddress){
  this.address=newAddress;
  }
  public void setProfession(String newProfession){
  this.profession=newProfession;
  }
  public void setTrialUsed(int newTrialUsed){
  this.trialUsed=newTrialUsed;
  }
  // Shows user information on user's profile
  public void showProfile(){
  System.out.println("Username: "+this.username+":\n"
  +"Name:"+this.name+"\n"
  +"Address:"+this.address
  +"\n"+"Profession:"+this.profession+"\n");
  }
}
