package module01.p09;

import java.util.Scanner;

public class Application {
    /*
     * 2.15 (Arithmetic) Write an application that asks the user to enter two integers, 
     * obtains them from the user and prints their sum, product, difference and quotient 
     * (division).
     */
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();
        
        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();
      
        double answer = n1 + n2;
        System.out.printf("%d + %d = %.0f\n", n1, n2, answer);
        
        answer = n1 - n2;
        System.out.printf("%d - %d = %f\n", n1, n2, answer);
        
        answer = n1 * n2;
        System.out.printf("%d * %d = %f\n", n1, n2, answer);
        
        answer = n1 / n2;
        System.out.printf("%d / %d = %f\n", n1, n2, answer);
        
        in.close();
    }
    
    // How would we test this code to make sure it works as intended? What are some possible
    // problems that we might anticipate?
}
