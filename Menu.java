import java.util.Scanner;
import java.util.ArrayList;
public class Menu{
    public static void main(String args[]){
    String name;
    String phone;

    Menu x = new Menu();
    
    System.out.println("Please enter your phone number: ");
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner. nextLine();
    ArrayList<Integer> phoneList = new ArrayList<Integer>();
   
      phoneList.add(0,1);
    if (phoneList.contains(0)) {
          System.out.println(phoneList.contains("69123"));
        System.out.println("Your name exists. ");
    } else {
        System.out.println("You name does not exist.");
        System.out.println("Would you like to create an account? ");
    }
    
  
    
    // the person can choose between donator or beneficiary
    //if th eperson exists then:
    System.out.println("Welcome χαιρετισμό και τα στοιχεία του χρήστη, το όνομα του Οργανισμού και το όνομα του Admin.");
}

}





