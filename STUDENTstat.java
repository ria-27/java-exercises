package exercise;
import java.util.Scanner;
class STUDENTstat {
    String name;
    int rollNo;
    int age;

    // Default constructor
    STUDENTstat() {
        name = "Unknown";
        rollNo = 0;
        age = 0;
    }

    // Parameterized constructor
    STUDENTstat(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        STUDENTstat s1 = new STUDENTstat();
        System.out.println("Student created with default constructor:");
        s1.display();

        // Using parameterized constructor with user input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        STUDENTstat s2 = new STUDENTstat(name, rollNo, age);
        System.out.println("Student created with parameterized constructor:");
        s2.display();

        sc.close();
    }
}

