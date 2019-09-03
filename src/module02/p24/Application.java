package module02.p24;

import java.util.Scanner;

public class Application {
    /*
       (Separating the Digits in an Integer) Write an application that inputs 
       one number consisting of five digits from the user, separates the number 
       into its individual digits and prints the digits separated from one 
       another by three spaces each. For example, if the user types in the 
       number 42339, the program should print

           4   2   3   3   9

       Assume that the user enters the correct number of digits. What happens 
       when you enter a number with more than five digits? What happens when 
       you enter a number with fewer than five digits? 

       Hint: You’ll need to use both division and remainder operations to "pick off" each digit.

     */

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n, n1, n2, n3, n4;
    	
    	System.out.println("Enter a five digit number: ");
    	
    	n = in.nextInt();
    	
    	in.close();
    	
    	n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
    	n = n / 10;
    	n4 = n % 10;
    	n = n / 10;
    	
    	System.out.printf("%d   %d   %d   %d   %d", n, n4, n3, n2, n1);
    	
    }

}
