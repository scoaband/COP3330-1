package module03.c07.p05;

import java.util.Scanner;

public class Application {
    /*
     * (Sales Commissions) Use a one-dimensional array to solve the following
     * problem: A company pays its salespeople on a commission basis. The
     * salespeople receive $200 per week plus 9% of their gross sales for that week.
     * For example, a salesperson who grosses $5,000 in sales in a week receives
     * $200 plus 9% of $5,000, or a total of $650. Write an application (using an
     * array of counters) that determines how many of the salespeople earned
     * salaries in each of the following ranges (assume that each salesperson’s
     * salary is truncated to an integer amount):
     * 
     * $200–299
     * 
     * $300–399
     * 
     * $400–499
     * 
     * $500–599
     * 
     * $600–699
     * 
     * $700–799
     * 
     * $800–899
     * 
     * $900–999
     * 
     * $1,000 and over
     * 
     * Summarize the results in tabular format.
     */

    public static void main(String[] args) {
        final int CATEGORIES = 9;
        final int BASE_COMMISSION = 200;
        final double PERCENT_COMMISSION = 0.09;
        
        Scanner in = new Scanner(System.in);
        
        int[] counters = new int[CATEGORIES];
        
        int weeklyGross = 0;
        int weeklyTotal = 0;
        while(weeklyGross >= 0) {
            System.out.println("Enter the weekly gross sales for the next employee (-1 to quit): ");
            weeklyGross = in.nextInt();
            weeklyTotal = (int) (BASE_COMMISSION + PERCENT_COMMISSION * weeklyGross);
            
            if(weeklyTotal >= 200 && weeklyTotal < 300) {
                counters[0]++;
            } else if(weeklyTotal >= 300 && weeklyTotal < 400) {
                counters[1]++;
            } else if(weeklyTotal >= 400 && weeklyTotal < 500) {
                counters[2]++;
            } else if(weeklyTotal >= 500 && weeklyTotal < 600) {
                counters[3]++;
            } else if(weeklyTotal >= 600 && weeklyTotal < 700) {
                counters[4]++;
            } else if(weeklyTotal >= 700 && weeklyTotal < 800) {
                counters[5]++;
            } else if(weeklyTotal >= 800 && weeklyTotal < 900) {
                counters[6]++;
            } else if(weeklyTotal >= 900 && weeklyTotal < 1000) {
                counters[7]++;
            } else if(weeklyTotal >= 1000) {
                counters[8]++;
            }
        }
        
        System.out.println("Pay summary for the week:\n");
        System.out.printf("%10s%5d", "200-299", counters[0]);
        for(int i = 0; i < counters[0]; i++) {
        	System.out.print("*");
        }
        System.out.println();
        System.out.printf("%10s%5d\n", "300-399", counters[1]);
        System.out.printf("%10s%5d\n", "400-499", counters[2]);
        System.out.printf("%10s%5d\n", "500-599", counters[3]);
        System.out.printf("%10s%5d\n", "600-699", counters[4]);
        System.out.printf("%10s%5d\n", "700-799", counters[5]);
        System.out.printf("%10s%5d\n", "800-899", counters[6]);
        System.out.printf("%10s%5d\n", "900-999", counters[7]);
        System.out.printf("%10s%5d\n", "1000+", counters[8]);
    }

}
