package module04.ch06.p04;

public class Application {
	/*
	 * (Rounding Numbers) To round numbers to specific decimal places, use a
	 * statement like
	 *
	 * double y = Math.floor(x * 10 + 0.5) / 10; which rounds x to the tenths
	 * position (i.e., the first position to the right of the decimal point), or
	 *
	 * double y = Math.floor(x * 100 + 0.5) / 100; which rounds x to the hundredths
	 * position (i.e., the second position to the right of the decimal point). Write
	 * an application that defines four methods for rounding a number x in various
	 * ways:
	 *
	 * roundToInteger(number)
	 *
	 * roundToTenths(number)
	 *
	 * roundToHundredths(number)
	 *
	 * roundToThousandths(number)
	 *
	 * For each value read, your program should display the original value, the
	 * number rounded to the nearest integer, the number rounded to the nearest
	 * tenth, the number rounded to the nearest hundredth and the number rounded to
	 * the nearest thousandth.
	 */


	public static int roundToInteger(double x) {
		return (int) Math.floor(x + 0.5);
	}

	public static void main(String[] args) {

	}

}
