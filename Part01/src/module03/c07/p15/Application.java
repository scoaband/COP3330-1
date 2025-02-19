package module03.c07.p15;

import java.util.Scanner;

public class Application {
	/*
	 * (Total Sales) Use a two-dimensional array to solve the following problem: A
	 * company has four salespeople (1 to 4) who sell five different products (1 to
	 * 5). Once a day, each salesperson passes in a slip for each type of product
	 * sold. Each slip contains the following:
	 * 
	 * 1) The salesperson number
	 * 
	 * 2) The product number
	 * 
	 * 3) The total dollar value of that product sold that day
	 * 
	 * Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume
	 * that the information from all the slips for last month is available. Write an
	 * application that will read all this information for last month’s sales and
	 * summarize the total sales by salesperson and by product. All totals should be
	 * stored in the two-dimensional array `sales`. After processing all the
	 * information for last month, display the results in tabular format, with each
	 * column representing a salesperson and each row representing a particular
	 * product. Cross-total each row to get the total sales of each product for last
	 * month. Cross-total each column to get the total sales by salesperson for last
	 * month. Your output should include these cross-totals to the right of the
	 * totaled rows and to the bottom of the totaled columns.
	 */
	


	public static void main(String[] args) {
		// sales structure: 
		//   col represents sales person   (0-3)
		//   row represents product        (0-4)
		//   value is daily dollar value
	    final int NUM_EMPLOYEES = 2;
	    final int NUM_PRODUCTS = 2;
	    
	    double[][] sales = new double[NUM_EMPLOYEES][NUM_PRODUCTS];
		
	    // for each sales person
        //   for each product
        //     read dollar value and add to value in sales array
	    Scanner in = new Scanner(System.in);
	    double amount = 0;
	    System.out.println("You will now be prompted to enter the total sales data for this month.");
	    for(int employeeId = 0; employeeId < sales.length; employeeId++) {
	        System.out.printf("Enter the total sales amounts for employee %d ", employeeId);
	        for(int productId = 0; productId < sales[employeeId].length; productId++) {
	            System.out.printf("product %d: ", productId);
	            amount = in.nextDouble();
	            sales[employeeId][productId] += amount;
	        }
	    }
	    
	    // print the data in tabular form while also totaling each employee's sales
	    System.out.println();
	    double employeeTotal;
	    for(int employeeId = 0; employeeId < sales.length; employeeId++) {
            System.out.printf("Employee %d", employeeId);
            employeeTotal = 0;
            for(int productId = 0; productId < sales[employeeId].length; productId++) {
                System.out.printf("%10.2f", sales[employeeId][productId]);
                employeeTotal += sales[employeeId][productId];
            }
            System.out.printf("|%10.2f%n", employeeTotal);
	    }
	    
	    // add totals for each product
	    double productTotal;
	    System.out.print("Total     ");
	    for(int productId = 0; productId < NUM_PRODUCTS; productId++) {
            productTotal = 0;
            for(int employeeId = 0; employeeId < sales.length; employeeId++) {
                productTotal += sales[employeeId][productId];
            }
            System.out.printf("%10.2f", productTotal);
        }
	    System.out.println();
	}

}
