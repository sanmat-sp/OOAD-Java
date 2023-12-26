public class bugati {
    
    private String make;
    private String model;
    private int year;
    private double mileage;
 
    bugati(String make, String model, int year, double mileage) {
       this.make = make;
       this.model = model;
       this.year = year;
       this.mileage = mileage;
    }
 
    public String getMake(){
         return this.make;
    }
    public String getModel(){
         return this.model;
    }
    public int getYear(){
         return this.year;
    }
     public double getMileage(){
           return this.mileage;
     }
 
     public void setMake(String make){
         this.make=make;
     }
     public void setModel(String model){
         this.model=model;
     }
     public void setYear(int year){
         this.year=year;
     }
     public void setMileage(double mileage){
         this.mileage=mileage;
     }
 
     public void display(){
         System.out.println("Make:"+this.make);
         System.out.println("Model:"+this.model);
         System.out.println("Year:"+this.year);
         System.out.println("Mileage:"+this.mileage);
     }
     
 
 public double cost(double distance,double costperlitre){
     return ((distance/this.getMileage()) * costperlitre);
 }
 public double cost(double costperlitre){
     return ((1/this.getMileage())*costperlitre);
 }
  
  public static void main(String args[]){
 
      bugati c1=new bugati("bugati","City",2019,16.5);
      c1.display();
      double cost1,cost2;
      cost1=c1.cost(100);
      cost2=c1.cost(200, 100);
      System.out.println("Cost to drive for a distance of 1km is "+cost1);
      System.out.println("Cost of Journey "+cost2);
     }
 
 
 }