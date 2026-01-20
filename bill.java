//Write a Java program to compute the electricity bill for an industry using a switch case statement. 
//The program should take the daily consumption in units for 7 days as input. Based on the total 
//consumption, the program should calculate and display the total electricity bill according to the 
//following pricing table
//Units      Price Per Unit (INR)
//0-100       7.00
//101-200     8.00
//>= 201      10.00
package S1;
import java.util.Scanner;
public class bill {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int totalUnits = 0;
      
      System.out.println("Enter daily consumption (in units) for 7 days:");
      for (int i = 1; i <= 7; i++) {
          System.out.print("Day " + i + ": ");
          int units = sc.nextInt();
          totalUnits += units;
      }
      double rate;
     
      switch (totalUnits / 100) {
          case 0:
              rate = 7.0;
              break;
          case 1:
              rate = 8.0;
              break;
          default:
              rate = 10.0;
      }
      double bill = totalUnits * rate;
      System.out.println("Total Units Consumed: " + totalUnits);
      System.out.println("Rate per Unit: INR " + rate);
      System.out.println("Total Electricity Bill: INR " + bill);
      sc.close();
  }
}


