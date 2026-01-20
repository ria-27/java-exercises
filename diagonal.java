//Write a Java Program to display non principal diagonal elements and find their sum.
package S1;
import java.util.Scanner;

public class diagonal {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter size of square matrix (n): ");
      int n = sc.nextInt();

      int[][] matrix = new int[n][n];

      System.out.println("Enter matrix elements:");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              matrix[i][j] = sc.nextInt();
          }
      }
      int sum = 0;
      System.out.println("Non-principal diagonal elements:");
      for (int i = 0; i < n; i++) {
          int j = n - 1 - i;   // column index for non-principal diagonal
          System.out.print(matrix[i][j] + " ");
          sum += matrix[i][j];
      }
      System.out.println("\nSum of non-principal diagonal elements: " + sum);
      sc.close();
  }
}
