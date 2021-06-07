public class Beneficiary extends User{
//Main
public static void main(String[] args){
    System.out.println("Welcome names");//θελει και αλλα
        
}
    
//methods

//AddRequest   
String getAddRequest(){
    System.out.println("a");
        return getAddRequest();
    }
//Show Requests
String getShowRequests(){
    System.out.println("a");
        return getShowRequests();
    }
//Commit
String getCommit(){ 
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