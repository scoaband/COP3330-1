package week02.p18;

import java.util.Scanner;

public class Program18 {

    /*
     * (Largest and Smallest Integers) Write an application that reads five integers
     * and determines and prints the largest and smallest integers in the group. Use 
     * only variables, console IO, and selection statements (no loops or arrays). 
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int smallest;
        int largest;
        int n;
        
        System.out.print("Enter number 1: ");
        n = in.nextInt();
        
        smallest = n;
        largest = n;
        
        System.out.print("Enter number 2: ");
        n = in.nextInt();
        
        if(n > largest) {
            largest = n;
        }
        
        if(n < smallest) {
            smallest = n;
        }
        
        System.out.print("Enter number 3: ");
        n = in.nextInt();
        
        if(n > largest) {
            largest = n;
        }
        
        if(n < smallest) {
            smallest = n;
        }
        
        System.out.print("Enter number 4: ");
        n = in.nextInt();
        
        if(n > largest) {
            largest = n;
        }
        
        if(n < smallest) {
            smallest = n;
        }
        
        System.out.print("Enter number 5: ");
        n = in.nextInt();
        
        if(n > largest) {
            largest = n;
        }
        
        if(n < smallest) {
            smallest = n;
        }
        
        in.close();
        
        System.out.println("The largest number entered is " + largest);
        System.out.println("The smallest number entered is " + smallest);
    }

}
