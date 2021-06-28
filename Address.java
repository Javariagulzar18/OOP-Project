import java.io.Serializable;


public class Address implements Serializable {
    
    
    
    protected String house;
    protected String city;
     

public Address(){
    
    }

public Address(String house,String city){
     this.house = house;
     this.city = city;
 
         }

   

    public void setHouseNumber(String house) {
        this.house = house;
    }

    public void setCity(String city) {
        this.city = city;
    }

  

    public String getHouseNumber() {
        return house;
    }

    public String getCity() {
        return city;
    }
    
    

    
    public void display(){
        System.out.println("house : "+ house+ ", city : "+ city);
    }
    
    
    @Override
    public String toString() {
        return house+city;
        
    }
    
}