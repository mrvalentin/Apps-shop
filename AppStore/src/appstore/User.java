public class User implements java.io.Serializable {
  private String username,name,address,profession;
  private int trialUsed;
  public User(String username, String name, String address, String profession){
      this.username = username;
      this.name = name;
      this.address = address;
      this.profession = profession;
      this.trialUsed = 0;
  }
  public String getUsername(){
  return username;
  }
  public String getName(){
  return name;
  }
  public String getAddress(){
  return address;
  }
  public String getProfession(){
  return profession;
  }
  public int getTrialUsed(){
  return trialUsed;
  }
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
  public void showProfile(){
  System.out.println("The user "+this.username+":\n"
  +"name:"+this.name+"\n"
  +"address:"+this.address
  +"\n"+"profession:"+this.profession+"\n");
  }
}
