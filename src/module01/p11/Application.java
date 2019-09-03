package module01.p11;

import java.util.Scanner;

public class Application {
    /*
     * (Arithmetic, Smallest and Largest) Write an application that inputs three
     * integers from the user and displays the sum, average, product, smallest and
     * largest of the numbers. [Note: The calculation of the average in this
     * exercise should result in an integer representation of the average. So, if
     * the sum of the values is 7, the average should be 2, not 2.3333...]
     */

    public static void main(String[] args) {
        System.out.println("Enter 3 integers, separated by a space:");
        
        Scanner in = new Scanner(System.in);
        int smallest, largest;
        
        int n1 = in.nextInt();
        largest = n1;
        smallest = n1;
        
        int n2 = in.nextInt();
        if(n2 > largest) {
            largest = n2;
        }
        if(n2 < smallest) {
            smallest = n2;
        }
        
        int n3 = in.nextInt();
        if(n3 > largest) {
            largest = n3;
        }
        if(n3 < smallest) {
            smallest = n3;
        }
        
        System.out.println("Sum: " + (n1 + n2 + n3));
        System.out.println("Average: " + (n1 + n2 + n3)/3);
        System.out.println("Product: " + (n1 * n2 * n3));
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

    }

}
