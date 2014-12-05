public class App {
    private String AppName; 
    private String developerName;
    private String description;
    private int numberOfPurchases=0; 
    private String type;
    private double cost; 
    private boolean trial; 
    private double rate; 
    
    
    public String getAppName()
    {
        return this.AppName;
    }
    public void setappName(String AppName)
    {
        this.AppName=AppName;
    }
    
   public String getdevName()
   {
       return this.developerName;
   }
   public void setdevName(String DevName)
   {
       this.developerName=DevName;
   }
   public String getDescription()
   {
       return this.description;
   }
   public void setDescription(String Description)
   {
       this.description=Description;
   }
   public int getNumberOfPurchases()
   {
       return this.numberOfPurchases;
   }
   public void AddPurchases()
   {
       numberOfPurchases++;
   }
   public String getType()
   {
       return this.type;
   }
   public void setType(String type)
   {
       this.type=type;
   }
   public double getCost()
   {
       return this.cost;
   }
   public void setCost(double cost)
   {
       this.cost=cost;
   }
   public boolean getTrial()
   {
       return this.trial;
   }
   public void setTrial(boolean trial)
   {
       this.trial=trial;
   }
   public double getRate()
   {
       return this.rate;
   }
   public void setRate(double rate)
   {
       this.rate=rate;
   }
}
