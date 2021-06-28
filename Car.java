import java.io.Serializable;



public class Car implements Serializable
{
    private String carName;
    private String color;
    private String price;
    
    
    public Car()
    {
        
    }
    public Car(String carName,String color, String price)
    {
        this.carName = carName;
        this.color = color;
        this.price = price;
    }

    public void setcarName(String carName)
    {
        this.carName = carName;
    }
    
    public void setcolor(String color)
    {
        this.color = color;
    }
    
   public String getcarName()
    {
        return carName;
    }
    public String getcolor()
    {
        return color;
    }
    public String getprice()
    {
        return price;
    }
    
    public void display(){
        System.out.println("car name : "+this.carName+"car colour : "+this.color+"car price : "+this.price);
    }
   
    public String toString(){
        return this.carName+this.color+this.price;
        
    }
}
