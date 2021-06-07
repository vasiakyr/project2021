import java.util.ArrayList;
import java.util.Scanner;
public class Admin extends User{
    boolean isAdmin= true;
    String name ;
   
    
    
   //method introduction 
      public void welcome(){
       System.out.println("Welcome Admin!" );
       System.out.println("Please choose between Donation and Request.");
      }
      //Main
       public static void main(String[] args){
        
            Admin person = new Admin();
            person.welcome();
            System.out.println("If you want donation enter 1, if you want request enter 2.");
            person.choose1();
            person.choose2();
            System.out.println("You are ready!");
            System.out.println(" ");
            
            
        }
        //Choose2
        String choose2(){
         System.out.println("Please enter 1 if you want Material or 2 if you want Service:");
          
           
           Scanner input = new Scanner(System.in);
           int number = input.nextInt();
           if(number==1){
            System.out.println("1.Material");
            ArrayList<String> MaterialList = new ArrayList<String>();
            MaterialList.add("products1");
    
            System.out.println(MaterialList); 
            }
            else if(number==2){
                System.out.println("2.Services");
        
            ArrayList<String> ServiceList = new ArrayList<String>();
            ServiceList.add("products2");
  
            System.out.println(ServiceList); 
            }
            else{
                System.out.println("You have to choose between 1 and 2. Try again please.");
                int number2 = input.nextInt();
                 if(number==1){
            System.out.println("1.Material");
            ArrayList<String> MaterialList = new ArrayList<String>();
            MaterialList.add("products1");
    
            System.out.println(MaterialList); 
            }
            }
            return"";
        }
      
        //Choose1
        int choose1(){
          Scanner input = new Scanner(System.in);
           int number = input.nextInt();
            if(number==1){
                System.out.println("You choosed Donation!");
            }
            else if(number==2){
                System.out.println("You choosed Request!");
            }
            else{
                System.out.println("You have to choose between 1 and 2. Try again please.");
                int number2 = input.nextInt();
            }
            return 0;
    }
    
}