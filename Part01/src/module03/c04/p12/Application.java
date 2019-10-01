package module03.c04.p12;

import java.util.Scanner;

public class Application {
    /*
     * (Find the Largest Number) The process of finding the largest value is used
     * frequently in computer applications. For example, a program that determines
     * the winner of a sales contest would input the number of units sold by each
     * salesperson. The salesperson who sells the most units wins the contest. Write
     * a Java application that inputs a series of 10 integers and determines and
     * prints the largest integer. Your program should use at least the following
     * three variables:
     * 
     * 1. counter: A counter to count to 10 (i.e., to keep track of how many numbers
     *    have been input and to determine when all 10 numbers have been processed).
     * 
     * 2. number: The integer most recently input by the user.
     * 
     * 3. largest: The largest number found so far.
     */

    public static void main(String[] args) {
        final int MAX_NUMBERS = 10;

        Scanner in = new Scanner(System.in);
        int number;
        int largest;
        
        System.out.println("Enter an integer: ");
        number = in.nextInt();
        largest = number;
        
        for(int counter = 0; counter < MAX_NUMBERS-1; counter++) {
            System.out.print("Enter an integer: ");
            number = in.nextInt();
            if(number > largest) {
                largest = number;
            }
        }
        
        System.out.println("The largest number was " + largest);
    }

}
