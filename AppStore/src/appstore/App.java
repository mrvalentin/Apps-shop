//Khalil Jabir K1317897

package appstore; 
public class App {

	private String name;
	private String developer;
	private String description;
	private String category;
	private int timesPurchased = 0;
	private double cost;
	private boolean trialAvailable;
	
	// Constructor
	public App (String name, String developer, String description, String category, double cost, boolean trialAvailable) {
		this.name = name;
		this.developer = developer;
		this.description = description;
		this.category = category;
		this.cost = cost;
		this.trialAvailable = trialAvailable;
	}
	
	// get app's name
	public String getName () {
		return this.name;
	}
	
	// set app's name
	public void setName (String name) {
		this.name = name;
	}
	
	
	
	// get app's developer
	public String getDeveloper () {
		return this.developer;
	}
	
	// set app's developer
	public void setDeveloper (String developer) {
		this.developer = developer;
	}
	
	
	
	// get app's description
	public String getDescription () {
		return this.description;
	}
	
	// set app's description
	public void setDescription (String description) {
		this.description = description;
	}
	
	
	
	// get app's category
	public String getCategory () {
		return this.category;
	}
	
	// set app's category
	public void setCategory (String category) {
		this.category = category;
	}
	
	
	
	// get app's number of purchases (the popularity of the app)
	public int getTimesPurchased () {
		return this.timesPurchased;
	}
	
	// increment the number of app's purchases
	public void purchased () {
		this.timesPurchased = this.timesPurchased + 1;
	}
	
	
	
	// get app's cost
	public double getCost () {
		return this.cost;
	}
	
	// set app's cost
	public void setCost (double cost) {
		this.cost = cost;
	}

	//returns price based on user
        public double checkPrice(User u){
            switch (u.getProfession()) {
                case "student":
                    return this.getCost()*0.75;
                case "academic":
                    return this.getCost()*0.9;
                default:
                    return this.getCost();
            }
        }
        
        //returns true if trial is available
        public boolean trialAvailable()
        {
            return this.trialAvailable;
        }
        
}
