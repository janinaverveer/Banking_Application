package bank;
import java.util.Scanner;

public class start {
  static Scanner sc = new Scanner(System.in);
    static String customerName;
    static int customerId;
    static char op1;
    
public static void main(String[] args) {
  
  
  System.out.println("Voeg uw Naam"); 
  String naam =sc.nextLine();  
  System.out.println("Uw naam is: " + naam); 

  System.out.println("Voeg uw Id"); 
  int id =sc.nextInt();  
  System.out.println("Uw id is: " + id);
  System.out.println("\n");
   showMenu(); 
}

    static void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner (System.in);
      System.out.println("welkom bij de bank applicatie");
      System.out.println("Hier kunt u alle gegevens van de bank verkrijgen");         
      System.out.println("\n");         
      System.out.println("Uw naam is " + customerName);      
      System.out.println("Uw id is " + customerId);      
      System.out.println("\n");      
      System.out.println("A. De Centrale Bank van Suriname");
      System.out.println("B. DE Surinaamse Bank");
      System.out.println("C. De Surinaamse Postspaarbank");
      System.out.println("D. De volkskredietbank");
      System.out.println("E. Finabank");
      System.out.println("F. Exit");

      
      System.out.println("=======================================================");
      System.out.println("Enter een optie");
      System.out.println("=======================================================");
      option = sc.next().charAt(0);
      System.out.println("\n");

      switch(option){

        case 'A':
      database1 AA = new database1();
      AA.bank_data1();
        System.out.println("======================================================");
        System.out.println("enter F to leave");
        System.out.println("======================================================");
        op1 = sc.next().charAt(0);
        if (op1 == 'F'){
         showMenu();
        }
        break;

        case 'B':
        database1 BB = new database1();
        BB.bank_data2();
        System.out.println("enter F to leave");
        System.out.println("======================================================");
        op1 = sc.next().charAt(0);
        if (op1 == 'F'){
          showMenu();
        }
        break;

        case 'C':
        database1 CC = new database1();
        CC.bank_data3();
        System.out.println("enter F to leave");
        System.out.println("======================================================");
        op1 = sc.next().charAt(0);
        if (op1 == 'F'){
          showMenu();
        }
        break;

        case 'D':
        database1 DD = new database1();
        DD.bank_data4();
        System.out.println("enter F to leave");
        System.out.println("======================================================");
        op1 = sc.next().charAt(0);
        if (op1 == 'F'){
          showMenu();
        }
        break;

        case 'E':
        database1 EE = new database1();
        EE.bank_data5();
        System.out.println("enter F to leave");
        System.out.println("======================================================");
        op1 = sc.next().charAt(0);
        if (op1 == 'F'){
          showMenu();
        }
        break;

        default:
        System.out.println("Invalid option!!!. Please enter again");
        System.out.println("Enter F to leave");
        op1 = sc.next().charAt(0);
        if (op1 == 'F'){
          showMenu();
      
        break;
      }
    
  while(option != 'F');
  System.out.println("Thank you for your services");
    }
  }
  }
  
 


   
  

