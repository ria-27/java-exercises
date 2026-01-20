//For a given 9-digit registration number of a CSE student, identify the year of joining. Assuming the first two digits specify the year of joining.
package S1;
import java.util.Scanner;
public class registration {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter 9-digit registration number: ");
      long regNo = sc.nextLong();   // use long for 9-digit number

      long yearDigits = regNo / 10000000;  // remove last 7 digits

      int year = (int)(2000 + yearDigits);

      System.out.println("Year of Joining: " + year);

      sc.close();
  }
}
