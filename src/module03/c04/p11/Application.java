package module03.c04.p11;

import java.util.Scanner;

public class Application {
    /*
     * (Salary Calculator) Develop a Java application that determines the gross pay
     * for each of three employees. The company pays straight time for the first 40
     * hours worked by each employee and time and a half for all hours worked in
     * excess of 40. Imagine that you’re given a list of the employees, their number
     * of hours worked last week and their hourly rates. Your program should input
     * this information for each employee, then determine and display the employee’s
     * gross pay. Use class Scanner to input the data. Assume the hours worked and
     * hourly rate are integer values.
     */

    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 3;
        
        Scanner in = new Scanner(System.in);
        
        int rate = 0;
        int hours = 0;
        double totalPay = 0;
        
        for(int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Enter the hours worked for employee %d: ", i);
            hours = in.nextInt();
            System.out.printf("Enter the hourly rate for employee %d: ", i);
            rate = in.nextInt();
            
            if(hours <= 40) {
                totalPay = rate * hours;
            } else {
                hours = hours - 40;
                totalPay = rate * 40 + rate * 1.5 * hours;
            }
            
            System.out.printf("The gross pay for employee %d is $%.2f\n", i, totalPay);
        }
    }
}
