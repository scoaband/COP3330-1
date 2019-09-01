package week03.c04.p10;

import java.util.Scanner;

public class C04P10 {
    /*
     * (Sales Commission Calculator) A large company pays its salespeople on a
     * commission basis. The salespeople receive $200 per week plus 9% of their
     * gross sales for that week. For example, a salesperson who sells $5,000 worth
     * of merchandise in a week receives $200 plus 9% of $5,000, or a total of $650.
     * 
     * Develop a Java application that inputs one salesperson’s items sold for last
     * week and calculates and displays that salesperson’s earnings. There’s no
     * limit to the number of items that can be sold.
     * 
     */

    public static void main(String[] args) {
        final int BASE_COMMISSION = 200;
        final double COMMISSION_FACTOR = 0.09;

        Scanner in = new Scanner(System.in);
        int sale = 0;
        int grossSales = 0;

        System.out.println("Would you like to enter sales data? (y/n): ");
        char response = in.next().toLowerCase().charAt(0);

        while (response != 'n') {
            System.out.print("Please enter the value of the next sale: ");
            sale = in.nextInt();
            grossSales += sale;

            System.out.print("Would you like to enter another sale? (y/n): ");
            response = in.next().toLowerCase().charAt(0);
        }

        double commission = BASE_COMMISSION + COMMISSION_FACTOR * grossSales;
        System.out.printf("The commission earned on gross sales of $%d is $%.2f", grossSales, commission);
    }

}
