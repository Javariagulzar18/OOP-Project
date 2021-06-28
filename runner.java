import java.util.Scanner;

public class runner 
{
    
    public static void main(String[] args) 
    {
       
        customer_management c = new customer_management();
        c.read();
        
        carManagement m = new carManagement();
        m.read();
        
        
        boolean b = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tCar Management System");
        
        
        
        
        
        while (b){
            
            int option=0;
            while(true){
                
                
            try{
                
            System.out.println("1.buy new car\n2.sale a car\n3.search a customer\n4.to print customers list\n5.exit application");
             
             
             option = Integer.parseInt(input.next());
             break;
            }
            catch(NumberFormatException e){
                System.out.println("wrong choice! please enter a correct choice :");
            }
            
            }
            
            if (option ==1){
            
            System.out.println("enter the first name of customer :");
            Scanner a = new Scanner(System.in);
            String s = a.next();

            System.out.println("enter the last name of customer :");
            Scanner ls = new Scanner(System.in);
            String Ls = ls.next();

            System.out.println("enter the phone number of customer :");
            Scanner p = new Scanner(System.in);
            String phone = p.next();

            System.out.println("enter the address of customer :");
            System.out.println("enter the house number :");
            Scanner hou = new Scanner(System.in);
            String house = hou.next();


            System.out.println("enter the city name :");
            Scanner cit = new Scanner(System.in);
            String city = cit.next();
            
           
            
            Address A = new Address(house, city);
            customer C= new customer(s,Ls,phone,A);
            c.addContact(C);
            
            
            
            
                
            
                    
            System.out.println("enter the name of car you want to buy :");
            Scanner nam= new Scanner(System.in);
            String name = nam.next();
            
            System.out.println("enter the price of car you want to buy :");
            Scanner pri= new Scanner(System.in);
            String price = pri.next();
            
            boolean bool = m.search(name, price);
                
                if (bool = true){
                
                    System.out.println("press 1 to buy this car : press 2 to exit application ");
                    Scanner sc = new Scanner(System.in);
                    int Sca = sc.nextInt();
                    
                        if(Sca == 1){
                            
                            m.delete(name, price);
                            System.out.println("congratulations on buying a new car !!!!");
                        }
                        if (Sca == 2){
                            b = false;
                        }
                }
                
            }
                
                
                
                
                
              
                    
            
            if (option == 2){
                
            System.out.println("enter the first name of customer :");
            Scanner a = new Scanner(System.in);
            String s = a.next();

            System.out.println("enter the last name of customer :");
            Scanner ls = new Scanner(System.in);
            String Ls = ls.next();

            System.out.println("enter the phone number of customer :");
            Scanner p = new Scanner(System.in);
            String phone = p.next();

            System.out.println("enter the address of customer :");
            System.out.println("enter the house number :");
            Scanner hou = new Scanner(System.in);
            String house = hou.next();


            System.out.println("enter the city name :");
            Scanner cit = new Scanner(System.in);
            String city = cit.next();
            
           
            
            Address A = new Address(house, city);
            customer C= new customer(s,Ls,phone,A);
            c.addContact(C);
            
            System.out.println("enter the car details :");
                
                
            
                
            System.out.println("enter the name of car you want to sell :");
            Scanner car= new Scanner(System.in);
            String carr = car.next();
            System.out.println("enter the colour of car you want to sell :");
            Scanner colo= new Scanner(System.in);
            String color = colo.next();
            System.out.println("enter the price of car you want to sell");
            Scanner pricee= new Scanner(System.in);
            String priceee = pricee.next();
            
            Car ca = new Car(carr,color,priceee);
            m.add(ca);
                
                
                
                
            }
            
            
            if (option == 3){
                System.out.println("enter the first name of customer :");
                Scanner a = new Scanner(System.in);
                String s = a.next();

                System.out.println("enter the last name of customer :");
                Scanner ls = new Scanner(System.in);
                String Ls = ls.next();
                
                c.search(s, Ls);
            }
            
            if(option == 4){
                c.print();
            }
            
            if (option == 5){
                b = false;
            }
        }
        
        
        
        
    }      
       
    
}