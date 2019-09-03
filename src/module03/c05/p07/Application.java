package module03.c05.p07;

import java.util.Scanner;

public class Application {
    /*
     * (Find the Smallest Value) Write an application that finds the smallest of
     * several integers. Assume that the first value read specifies the number of
     * values to input from the user.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int smallest = Integer.MAX_VALUE;
        
        System.out.print("How many integers do you want to enter? ");
        int numValues = in.nextInt();
        
        for(int i = 1; i <= numValues; i++) {
            System.out.printf("Enter integer %d: ", i);
            n = in.nextInt();
            
            if(n < smallest) {
                smallest = n;
            }
        }
        
        System.out.println("The smallest integer entered was " + smallest);
    }
}
