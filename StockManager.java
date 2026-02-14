package exercise;
import java.util.Scanner;
public class StockManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] name = new String[n];
        double[] price = new double[n];
        int[] quantity = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Price: ");
            price[i] = sc.nextDouble();
            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        System.out.println("\nAvailable Products:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + name[i] +" | Price: " + price[i] +" | Quantity: " + quantity[i]);
        }

        System.out.print("\nEnter product number to purchase: ");
        int productIndex = sc.nextInt() - 1;
        System.out.print("Enter quantity to purchase: ");
        int qty = sc.nextInt();
        if (qty <= quantity[productIndex]) {
            double totalBill = qty * price[productIndex];
            System.out.println("\nYou purchased " + qty + " x " + name[productIndex]);
            System.out.println("Total Bill = " + totalBill);
        } else {
            System.out.println("\nSorry, not enough stock available for " + name[productIndex]);
        }


        sc.close();
    }
}