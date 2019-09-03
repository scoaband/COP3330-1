package module01.p10;

import java.util.Scanner;

public class Application {
	/*
	 * (Comparing Integers) Write an application that asks the user to enter two
	 * integers, obtains them from the user and displays the larger number followed
	 * by the words "is larger". If the numbers are equal, print the message
	 * "These numbers are equal".
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n1 = in.nextInt();
		
		System.out.print("Enter another integer: ");
		int n2 = in.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " is larger");
		} else if(n2 > n1) {
			System.out.println(n2 + " is larger");
		} else {
			System.out.println("These numbers are equal");
		}
	}
	
	// How would we test this code to make sure that it works as intended?

}
