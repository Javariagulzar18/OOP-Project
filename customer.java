public class customer extends Names
{
    
  
    
    private String phoneNumber;
    private String city;
    private String house;
    private Address add;
    
    public customer(String firstName, String lastName, String phoneNumber, Address add)
    {
        super(firstName, lastName);
        
        this.phoneNumber = phoneNumber;
        this.add = add;
        
    }
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }
   
    public void setphoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
   
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
   
    
    public void display(){
        System.out.println(super.toString()+" ,phone number :"+this.phoneNumber+", house number :"+add.house+", city :"+add.city);
   
    }
    
    @Override
    public String toString(){
        return super.toString()+" ,phone number :"+this.phoneNumber+", house number :"+add.house+", city :"+add.city;
    }
    
}

