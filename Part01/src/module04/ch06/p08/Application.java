package module04.ch06.p08;

import java.util.Scanner;

public class Application {
	/*
	 * (Exponentiation) Write a method integerPower(base, exponent) that returns the
	 * value of base^(exponent)
	 * 
	 * For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that
	 * exponent is a positive, nonzero integer and that base is an integer. Use a
	 * for or while statement to control the calculation. Do not use any Math class
	 * methods. Incorporate this method into an application that reads integer
	 * values for base and exponent and performs the calculation with the
	 * integerPower method.
	 */
	
	public static long integerPower(int base, int exponent) {
		long ans = 1;
		for(int i = 0; i < exponent; i++) {
			ans *= base;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		int base = in.nextInt();
		
		System.out.print("Enter the exponent: ");
		int exponent = in.nextInt();
		
		System.out.printf("%d raised to the power of %d is %d%n", base, exponent, integerPower(base, exponent));
	}

}
