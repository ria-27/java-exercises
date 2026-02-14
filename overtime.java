//Write a Java program to accept the number of hours worked, hourly rate and calculates the salary for an employee
//according to the following criteria: The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40 hours.
package exercise;
import java.util.Scanner;
public class overtime {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of hours worked: ");
        int hoursWorked = sc.nextInt();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        double salary;
        
        // Straight time for first 40 hours
        if (hoursWorked <= 40) {
            salary = hoursWorked * hourlyRate;
        } 
        else {
            // First 40 hours at straight rate
            double straightPay = 40 * hourlyRate;

            // Extra hours at time and a half
            int overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyRate * 1.5);

            salary = straightPay + overtimePay;
        }

        System.out.println("Total Salary = " + salary);

        sc.close();
    }
	 
		     
		       

	}

