

import java.util.*;

public class Weekofsales {

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    String r = "Revenue: $";
    int [] dOTW = {0,428,589,214,300,735,903,1067};
    int sunday = dOTW [1];
    int monday = dOTW [2];
    int tuesday = dOTW [3];
    int wednesday = dOTW [4];
    int thursday = dOTW [5];
    int friday = dOTW [6];
    int saturday = dOTW [7];

   System.out.println("\nPlease enter the day in the last week (1-7, where 1 is Sunday, 2 is Monday, etc..) you would like to see the revenue for. \n");
   int firstDate = user_input.nextInt();
   user_input.nextLine();
   System.out.println("\nYou selected: 6/" + (firstDate + 23) + "/20\n");
   
   switch (firstDate) {
     case 1: 
     System.out.println("Revenue: $" + sunday);
     break;
     case 2:
     System.out.println("Revenue: $" + monday);
     break;
     case 3:
     System.out.println("Revenue: $" + tuesday);
     break;
     case 4:
     System.out.println("Revenue: $" + wednesday);
     break;
     case 5:
     System.out.println("Revenue: $" + thursday);
     break;
     case 6: 
     System.out.println("Revenue: $" + friday);
     break;
     case 7:
     System.out.println("Revenue: $" + saturday);
     break;
        }

    System.out.println("\n");
    System.out.println("You would like to see the revenue of more days?");
    System.out.println("\n");
//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
    String yesorno = user_input.nextLine(); 

    switch (yesorno) {
      case "yes":
      System.out.println("\n");
      System.out.println("What day?");
      System.out.println("\n");
      int secondDate = user_input.nextInt();
      user_input.nextLine();
      System.out.println("\nYou selected: 6/" + (secondDate + 23) + "/20\n");
      System.out.println("\n");
      switch (secondDate){
        case 1:
        System.out.println("Revenue: $" + sunday);
        break;
        case 2:
        System.out.println(r + monday);
        break;
        case 3:
        System.out.println("Revenue: $" + tuesday);
        break;
        case 4:
        System.out.println("Revenue: $" + wednesday);
        break;
        case 5:
        System.out.println("Revenue: $" + thursday);
        break;
        case 6: 
        System.out.println("Revenue: $" + friday);
        break;
        case 7:
        System.out.println("Revenue: $" + saturday);
        break;}
         System.out.println("\n");
          System.out.println("You would like to see the revenue of more days?");
          System.out.println("\n");
//ljfljfljhfgljfjlhgljgljhfljhljfljhfjhfjlhvjhvhjvjvjvjjh
          String yesornoII = user_input.nextLine();

          switch (yesornoII) {
      case "yes":
      System.out.println("\n");
      System.out.println("What day?");
      System.out.println("\n");
      int thirdDate = user_input.nextInt();
      user_input.nextLine();
      System.out.println("\n");
      switch (thirdDate){
        case 1:
        System.out.println("Revenue: $" + sunday);
        break;
        case 2:
        System.out.println(r + monday);
        break;
        case 3:
        System.out.println("Revenue: $" + tuesday);
        break;
        case 4:
        System.out.println("Revenue: $" + wednesday);
        break;
        case 5:
        System.out.println("Revenue: $" + thursday);
        break;
        case 6: 
        System.out.println("Revenue: $" + friday);
        break;
        case 7:
        System.out.println("Revenue: $" + saturday);
        break;}
         System.out.println("\n");
          System.out.println("You would like to see the revenue of more days?");
          System.out.println("\n");
// jgghjglhjgjhgljhgjgjgjlgljgjgjhgjgljgljgjglj
          String yesornoIII = user_input.nextLine();

          switch (yesornoIII) {
      case "yes":
      System.out.println("\n");
      System.out.println("What day?");
      System.out.println("\n");
      int fourthDate = user_input.nextInt();
      user_input.nextLine();
      System.out.println("\n");
      switch (fourthDate){
        case 1:
        System.out.println("Revenue: $" + sunday);
        break;
        case 2:
        System.out.println(r + monday);
        break;
        case 3:
        System.out.println("Revenue: $" + tuesday);
        break;
        case 4:
        System.out.println("Revenue: $" + wednesday);
        break;
        case 5:
        System.out.println("Revenue: $" + thursday);
        break;
        case 6: 
        System.out.println("Revenue: $" + friday);
        break;
        case 7:
        System.out.println("Revenue: $" + saturday);
        break;}
         System.out.println("\n");
          System.out.println("You would like to see the revenue of more days?");
          System.out.println("\n");
//dddddddddddddddddddddddddddddddddddddddddddddddddddddddd
        String yesornoIV = user_input.nextLine();

          switch (yesornoIV) {
      case "yes":
      System.out.println("\n");
      System.out.println("What day?");
      System.out.println("\n");
      int fifthDate = user_input.nextInt();
      user_input.nextLine();
      System.out.println("\n");
      switch (fifthDate){
        case 1:
        System.out.println("Revenue: $" + sunday);
        break;
        case 2:
        System.out.println(r + monday);
        break;
        case 3:
        System.out.println("Revenue: $" + tuesday);
        break;
        case 4:
        System.out.println("Revenue: $" + wednesday);
        break;
        case 5:
        System.out.println("Revenue: $" + thursday);
        break;
        case 6: 
        System.out.println("Revenue: $" + friday);
        break;
        case 7:
        System.out.println("Revenue: $" + saturday);
        break;}
         System.out.println("\n");
          System.out.println("You would like to see the revenue of more days?");
          System.out.println("\n");
//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
                String yesornoV = user_input.nextLine();

          switch (yesornoV) {
      case "yes":
      System.out.println("\n");
      System.out.println("What day?");
      System.out.println("\n");
      int sixthDate = user_input.nextInt();
      user_input.nextLine();
      System.out.println("\n");
      switch (sixthDate){
        case 1:
        System.out.println("Revenue: $" + sunday);
        break;
        case 2:
        System.out.println(r + monday);
        break;
        case 3:
        System.out.println("Revenue: $" + tuesday);
        break;
        case 4:
        System.out.println("Revenue: $" + wednesday);
        break;
        case 5:
        System.out.println("Revenue: $" + thursday);
        break;
        case 6: 
        System.out.println("Revenue: $" + friday);
        break;
        case 7:
        System.out.println("Revenue: $" + saturday);
        break;}
         System.out.println("\n");
          System.out.println("You would like to see the revenue of more days?");
          System.out.println("\n");
//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
               String yesornoVI = user_input.nextLine();

          switch (yesornoVI) {
      case "yes":
      System.out.println("\n");
      System.out.println("What day?");
      System.out.println("\n");
      int seventhDate = user_input.nextInt();
      user_input.nextLine();
      System.out.println("\n");
      switch (seventhDate){
        case 1:
        System.out.println("Revenue: $" + sunday);
        break;
        case 2:
        System.out.println(r + monday);
        break;
        case 3:
        System.out.println("Revenue: $" + tuesday);
        break;
        case 4:
        System.out.println("Revenue: $" + wednesday);
        break;
        case 5:
        System.out.println("Revenue: $" + thursday);
        break;
        case 6: 
        System.out.println("Revenue: $" + friday);
        break;
        case 7:
        System.out.println("Revenue: $" + saturday);
        break;
        }
         System.out.println("\n");
          System.out.println("There is no more days!");
          System.out.println("\n");
        case "no":
      System.out.println("\n");
      System.out.println("Okay! Less work for me :)");
      break;
        } // close for yonVI
//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
      break;
      case "no":
      System.out.println("\n");
      System.out.println("Okay! Less work for me :)");
      break;}//close for yonV
      break;
      case "no":
      System.out.println("\n");
      System.out.println("Okay! Less work for me :)");
      break;}// close for yonIV
      break;
       case "no":
      System.out.println("\n");
      System.out.println("Okay! Less work for me :)");
      break;}//close for yonIII
      break;
         case "no":
      System.out.println("\n");
      System.out.println("Okay! Less work for me :)");
      break; }//Close for yonII
      break;
    case "no":
      System.out.println("\n");
      System.out.println("Okay! Less work for me :)");
      break;}//close for yon

   System.out.println("\n");
    System.out.println("There is some logged information that you can access if you would like!\n Please select between:\n \"average\" for average revenue per day over the week \n \"total\" for total revenue of the week \n \"profit\" for the profit of the last week\n\n");

    String loggedInfo = user_input.nextLine();

    switch (loggedInfo) {
      case "average": 
      System.out.println("\n$" + (monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7);
      break;
      case "total":
      System.out.println("\n$" + (sunday+monday+tuesday+wednesday+thursday+friday+saturday));
      break;
      case "profit":
      System.out.println("\n$1090");
      break;
    }

    
    }//PSVM Close
  
  }//close for method

