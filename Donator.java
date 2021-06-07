import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
public class Donator extends User{
    public String n(){
        return "";
    }
    public static void main(String[] args){
    System.out.println("Welcome  + name + nameOrgani+ nameAdmin");
    System.out.println("Please enter true if you want Material or false if you want Service:");
    
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner. nextLine();
    boolean Material=true;
    boolean Service=false;
    
  if(Material==true){
        System.out.println("1.Material");
        ArrayList<String> MaterialList = new ArrayList<String>();
    MaterialList.add("products1");
    
    System.out.println(MaterialList); 
    }
    else{
        System.out.println("2.Services");
        
    ArrayList<String> ServiceList = new ArrayList<String>();
    ServiceList.add("products2");
  
    System.out.println(ServiceList); 
    }
}
   //methods!
boolean a = true;
//AddOffer
String getAdd(){
    System.out.println("1.Material " + "number");
    System.out.println("2.Services "+ "number");
    if(a==true){
      System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    
        return getAdd();
    }
//ShowOffers
String getShow(){
    System.out.println("Exit!");
        return getShow();
    }
//Commit
String getCommit(){
    System.out.println("Success");
        return getCommit();
    }
//Back
String getBack(){ //the previous step
        return getBack();
    }
//Logout    
String getLogout(){
    System.out.println("User logout.");
    System.out.println("Another user?");
        return getLogout();
    }
//Exit
String getExit(){
    System.out.println("Exit!");
        return getExit();
    }
}