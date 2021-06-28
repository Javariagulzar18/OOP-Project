import java.io.Serializable;


public class Names implements Serializable{
    
    public String firstName;
    public String lastName;
    
    public Names(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
     public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    
    public void display(){
        System.out.println("first name :"+this.firstName+", last name :"+this.lastName);
    }
    
    public String toString(){
        return "first name : "+this.firstName+", last name :"+ this.lastName;
    }
    
}
