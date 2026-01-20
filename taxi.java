//A Taxi service offers a new service based on travel distance. Write a Java Program to calculate the total
//distance traveled by considering the following charges. First 5 km = INR 10/km, Next 15 km = INR 8/km
//Next 25 km = INR 5/km.

package S1;
import java.util.Scanner;

public class taxi {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter distance traveled (in km): ");
      double distance = sc.nextDouble();   
      double fare = 0;                    

      if (distance <= 5) {
          fare = distance * 10;
      } else if (distance <= 20) {
          fare = (5 * 10) + (distance - 5) * 8;
      } else if (distance <= 45) {
          fare = (5 * 10) + (15 * 8) + (distance - 20) * 5;
      } else {
          fare = (5 * 10) + (15 * 8) + (25 * 5) + (distance - 45) * 5;
      }

      System.out.println("Total Fare: INR " + fare);
      
      sc.close();
  }
}
