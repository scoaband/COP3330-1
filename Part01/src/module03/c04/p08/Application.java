package module03.c04.p08;

import java.util.Scanner;

public class Application {
    /*
     * (Gas Mileage) Drivers are concerned with the mileage their automobiles get.
     * One driver has kept track of several trips by recording the miles driven and
     * gallons used for each tankful. Develop a Java application that will input the
     * miles driven and gallons used (both as integers) for each trip. The program
     * should calculate and display the miles per gallon obtained for each trip and
     * print the combined miles per gallon obtained for all trips up to this point.
     * All averaging calculations should produce floating-point results. Use class
     * Scanner and sentinel-controlled iteration to obtain the data from the user.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int miles = 0; // input the miles driven
        int gallons = 0; // and gallons used
        double mpg = 0; // miles per gallon obtained for each trip
        int totalMiles = 0; // miles per gallon obtained for all trips up to this point
        int totalGallons = 0; // miles per gallon obtained for all trips up to this point
        double totalMpg = 0; // miles per gallon obtained for all trips up to this point

        // input miles driven and gallons used for each trip
        while (true) {
            System.out.println("Enter miles (or a non-positive value to quit): ");
            miles = in.nextInt();
            if (miles <= 0) {
                break;
            }
            System.out.println("Enter gallons: ");
            gallons = in.nextInt();
            mpg = miles / (double) gallons;

            totalMiles += miles;
            totalGallons += gallons;
            totalMpg = totalMiles / (double) totalGallons;

            // display the miles per gallon obtained for each trip and print the combined
            // miles per gallon obtained for all trips up to this point
            System.out.println("Your MPG for this trip is: " + mpg);
            System.out.println("Your MPG over all trips is: " + totalMpg);
        }
    }

}
