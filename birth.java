// For a given date of birth of a person, calculate the date of retirement by taking years of service as input.
package S1;
import java.util.Scanner;
public class birth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of birth: ");
        int year = sc.nextInt();
        System.out.print("Enter month of birth (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day of birth: ");
        int date = sc.nextInt();

        // To find last day of the given month
        int lastDay;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                lastDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                lastDay = 30;
                break;
            case 2:
                //checking if leap year, for February
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    lastDay = 29;
                } else {
                    lastDay = 28;
                }
                break;
            default:
                lastDay = 30; // fallback
        }
        
        System.out.print("Enter years of service: ");
        int serv = sc.nextInt();
        
        year = serv + year;
 
        System.out.println("Date of Retirement: " + lastDay + "-" + month + "-" + year);

        sc.close();
    }
}