//Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods: 
//a. read(): to read N employee details 
//b. display(): to display employee details 
//c. compute_net_sal(): to compute net salary 
//Write a Java program to read data of N employees, compute and display net salary of each employee .
//Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary) 
package exercise;
import java.util.Scanner;
public class employee {
	String Ename;
	int Eid;
	double basic, DA, gross_sal, net_sal;
	
	void read(Scanner sc) {
		System.out.print("Enter Employee Name:");
		Ename=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Employee ID:");
		Eid=sc.nextInt();
		System.out.print("Enter Basic Salary:");
		basic=sc.nextDouble();
	}
	void compute() {
		DA = 0.52 * basic;                
        gross_sal = basic + DA;           
        double IT = 0.30 * gross_sal;     
        net_sal = gross_sal - IT;
	}
	void display() {
		System.out.println("\nEmployee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + gross_sal);
        System.out.println("Net Salary: " + net_sal);
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Creating array of employee objects
        employee[] employees = new employee[n];
		
		// Reading employee details
        for (int i = 0; i < n; i++) {
            employees[i] = new employee();
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i].read(sc);
            employees[i].compute();
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        sc.close();
    }
}





