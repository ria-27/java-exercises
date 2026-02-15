//Create a class called Counter that contains a static data member to count the number of Counter objects being created.
//Also define a static member function called showCount() which displays the number of objects created at any given
//point of time. Illustrate this. 
package exercise;
class Counter {
    // Static data member (shared across all objects)
    static int count = 0;

    // Constructor
    Counter() {
        count++; // increment whenever a new object is created
    }

    // Static member function
    static void showCount() {
        System.out.println("Number of Counter objects created: " + count);
    }

    public static void main(String[] args) {
        // Before creating any objects
        Counter.showCount(); // should print 0

        // Create objects
        Counter c1 = new Counter();
        Counter.showCount(); // should print 1

        Counter c2 = new Counter();
        Counter.showCount(); // should print 2

        Counter c3 = new Counter();
        Counter.showCount(); // should print 3
    }
}
