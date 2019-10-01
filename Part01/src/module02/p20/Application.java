package module02.p20;

import java.util.Scanner;

public class Application {
    /*
     * (Multiples) Write an application that reads two integers, determines whether
     * the first is a multiple of the second and prints the result.
     * 
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n, m;
        
        System.out.println("Enter number 1: ");
        n = in.nextInt();
        
        System.out.println("Enter number 2: ");
        m = in.nextInt();
        
        if(n % m == 0) {
            System.out.println(n + " is a multiple of " + m);
        } else if(m % n == 0) {
            System.out.println(m + " is a multiple of " + n);
        } 
    }
}
