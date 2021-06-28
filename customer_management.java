import java.util.*;
import java.io.*;

public class customer_management extends Abstract
{
    
    
    
    private ArrayList<customer> contacts;
    
    
    public customer_management(){
    {
        contacts = new ArrayList<>();
    }
    }
    

    
    public void addContact(customer add)
    {
        
        try{
            contacts.add(add);
            update();
        }
        catch(Exception e){
            System.out.println("error");
        }
        
        }
    public void update(){
        try{
                ObjectOutputStream abc=new ObjectOutputStream(new FileOutputStream("contacts.txt"));
                abc.writeObject(contacts);
                abc.close();
        }
                
                catch(Exception e){
                        System.out.println("Error in saving contact to file");
                        
            
        }
    }
    
               
    public boolean search(String firstName, String lastName)
    {   boolean b = false;
        for(customer o:contacts){
            if(o.getFirstName().equals(firstName) && o.getLastName().equals(lastName)){
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
              ObjectInputStream xyz=new ObjectInputStream(new FileInputStream("contacts.txt"));
                contacts=(ArrayList<customer>) xyz.readObject();
                xyz.close();
               
                
        } 
                
                catch(Exception e){
                        System.out.println("Error in reading file");
                        }
                
    }
    
    
    public void delete(String firstName, String lastName){
        for (customer c : contacts){
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName));
            contacts.remove(c);
            update();
        }
        
    }
    
    public void print(){
        for (customer c : contacts){
            c.display();
        }
    }
        
      
}
