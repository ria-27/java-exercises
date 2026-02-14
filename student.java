// Define a Class STUDENT having following 
//Members: sname, marks_array, total, avg and provide the following methods: 
//a. assign(): to assign initial values to the STUDENT object 
//b. display(): to display the STUDENT object 
//c. compute(): to Compute Total, Average marks 
//Write a Java program Illustrating Class Declarations, Definition, and Accessing Class 
//Members to test the class defined. 
package exercise;
import java.util.Scanner;
public class student {
	String sname;
	int marks_array[];
	int total;
	double avg;
	
	void assign(String name,int marks[]) {
		sname=name;
		marks_array=marks;
	}
	void compute() {
		total=0;
		for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
	}
	void display() {
		System.out.println("Student Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + avg);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter student name: ");
	    String name = sc.nextLine();

	    System.out.print("Enter number of subjects: ");
	    int n = sc.nextInt();

	    int[] marks = new int[n];
	    System.out.println("Enter marks for " + n + " subjects:");
	    for (int i = 0; i < n; i++) {
	        marks[i] = sc.nextInt();
	    }

	    student st = new student();

	    st.assign(name, marks);

	    st.compute();

	    st.display();

	    sc.close();
	}


	}
		
	
	        

	
