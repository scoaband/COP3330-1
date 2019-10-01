package module04.ch06.p02;

import java.util.Scanner;

public class Application {
	
	public static double calculateCharges(double hours) {
		final double MIN_RATE = 2.0;
		double charges = MIN_RATE;
		
		if(hours > 3.0) {
			charges = MIN_RATE + 0.50 * (Math.ceil(hours - 3.0));
		}
		
		charges = Math.min(charges, 10.0);
		
		return charges;
	}

	public static void main(String[] args) {
		// (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up
		// to three hours. The garage charges an additional $0.50 per hour for each hour
		// or part thereof in excess of three hours. The maximum charge for any given
		// 24-hour period is $10.00. Assume that no car parks for longer than 24 hours
		// at a time. Write an application that calculates and displays the parking
		// charges for each customer who parked in the garage yesterday. You should
		// enter the hours parked for each customer. The program should display the
		// charge for the current customer and should calculate and display the running
		// total of yesterday’s receipts. It should use the method calculateCharges to
		// determine the charge for each customer.

		Scanner in = new Scanner(System.in);

		// for each customer that parked yesterday

		// get the hours parked
		System.out.println("How many hours were you parked?");
		double hours = in.nextDouble();

		// calculate the charge
		double parkingFee = calculateCharges(hours);

		// and display it to the user
		System.out.printf("You owe $%.2f.", parkingFee);

		// and add it to the total fees for yesterday
	}

}
