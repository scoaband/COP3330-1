package module03.c04.p09;

import java.util.Scanner;

public class Application {
    /*
     * Develop a Java application that determines whether any of several
     * department-store customers has exceeded the credit limit on a charge account.
     * For each customer, the following facts are available:
     * 
     *   account number 
     *   balance at the beginning of the month 
     *   total of all items charged by the customer this month 
     *   total of all credits applied to the customer’s account this month 
     *   allowed credit limit.
     * 
     * The program should input all these facts as integers, calculate the new
     * balance (= beginning balance + charges – credits), display the new balance
     * and determine whether the new balance exceeds the customer’s credit limit.
     * For those customers whose credit limit is exceeded, the program should
     * display the message "Credit limit exceeded"
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int accountNumber = 0;
        int beginningBalance = 0;
        int totalCharges = 0;
        int totalCredits = 0;
        int creditLimit = 0;
        int endingBalance = 0;

        // read customer info
        System.out.println("Please enter the account number: ");
        accountNumber = in.nextInt();

        System.out.println("Please enter the balance at the beginning of the month: ");
        beginningBalance = in.nextInt();

        System.out.println("Please enter the total of all items charged this month: ");
        totalCharges = in.nextInt();

        System.out.println("Please enter the total of all credits applied this month: ");
        totalCredits = in.nextInt();

        System.out.println("Please enter the allowed credit limit: ");
        creditLimit = in.nextInt();
        
        in.close();

        endingBalance = beginningBalance + totalCharges - totalCredits;
        System.out.printf("Customer %d has an ending balance is $%d\n", accountNumber, endingBalance);

        if (endingBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
    }

    // What if wanted to allow the user to check the credit limit of multiple
    // customers?

}
