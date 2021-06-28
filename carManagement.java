import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class carManagement extends Abstract{
    
    
    
   
    private ArrayList<Car> cars;
    
    
    public carManagement(){
        cars = new ArrayList<>();
    }
    
    public void add(Car add)
    {
        
        try{
            cars.add(add);
            update();
            System.out.println("car added sucessfully !");
        }
        catch (Exception e){
            System.out.println("error");
        }
        
        }
    public void update(){
        try{
                ObjectOutputStream abc=new ObjectOutputStream(new FileOutputStream("cars.txt"));
                abc.writeObject(cars);
                abc.close();
        }
                
                catch(Exception e){
                        System.out.println("Error in saving to file");
                        
            
        }
    }
    
    
    public boolean search(String carName, String price)
    {
        boolean b = false;
        for(Car o:cars){
            if(o.getcarName().equals(carName) && o.getprice().equals(price)){
                System.out.println("car is available !");
                o.display();
                b = true;
            }
            
            
        }
        if (b = false){
            System.out.println("no such match found");
        }
       return b;
        }
    public void read(){
        try{
              ObjectInputStream xyz=new ObjectInputStream(new FileInputStream("cars.txt"));
                cars=(ArrayList<Car>) xyz.readObject();
                xyz.close();
               
                
        } 
                
                catch(Exception e){
                        System.out.println("Error in reading file");
                        }
                
    }
    
    
    public void delete(String carName, String color){
        
            for(Car c: cars){
                if(c.getcarName().equals(carName) && c.getcolor().equals(color)) {
                    cars.remove(c);
                    update();
                    break;
                    
                    
        }
            
        
        }
    }
    
    
     public void print() {
            for(Car c : cars){
                System.out.println(c.toString());
            }
        }
    
    
}