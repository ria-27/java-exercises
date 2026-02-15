package exercise;
import java.util.Scanner;
class Mixer {
    int[] arr;   
    int size;    

    void accept(Scanner sc) {
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter " + size + " elements in ascending order (no duplicates):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Merge current object array with another Mixer array
    Mixer mix(Mixer A) {
        int[] result = new int[this.size + A.size];
        int i = 0, j = 0, k = 0;
   // i=position in this.arr, j=position in A.arr, k=position in resultant array
        while (i < this.size && j < A.size) {
            if (this.arr[i] < A.arr[j]) {
                result[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                result[k++] = A.arr[j++];
            } else {
                // equal elements → take one, skip duplicate
                result[k++] = this.arr[i];
                i++;
                j++;
            }
        }

        // Copy remaining elements
        while (i < this.size) {
            result[k++] = this.arr[i++];
        }
        while (j < A.size) {
            result[k++] = A.arr[j++];
        }

        // Create new Mixer object with merged array
        Mixer merged = new Mixer();
        merged.size = k;
        merged.arr = new int[k];
        for (int m = 0; m < k; m++) {
            merged.arr[m] = result[m]; //copying resultant to merged object since we need to return an object
        }
        return merged;
    }

    // Display array elements
    void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test Mixer class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        System.out.println("Enter details for first array-:");
        m1.accept(sc);

        System.out.println("Enter details for second array-:");
        m2.accept(sc);

        System.out.println("\nFirst Array:");
        m1.display();
        System.out.println("Second Array:");
        m2.display();

        Mixer merged = m1.mix(m2);

        System.out.println("\nMerged Array:");
        merged.display();

        sc.close();
    }
}
