package module03.c07.p12;

import java.util.Random;

public class Application {
    /*
     * (Dice Rolling) Write an application to simulate the rolling of two dice. The
     * application should use an object of class Random once to roll the first die
     * and again to roll the second die. The sum of the two values should then be
     * calculated. Each die can show an integer value from 1 to 6, so the sum of the
     * values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and
     * 12 the least frequent. Your application should roll the dice 36,000,000
     * times. Use a one-dimensional array to tally the number of times each possible
     * sum appears. Display the results in tabular format.
     */

    public static void main(String[] args) {
        Random gen = new Random();
        
        int[] results = new int[11];  // index 0 represents a roll of 2
        int dice1, dice2;
        int roll;
        
        for(int i = 0; i < 36000000; i++) {
            dice1 = gen.nextInt(6) + 1; // roll is 1, 2, 3, 4, 5, or 6
            dice2 = gen.nextInt(6) + 1; // roll is 1, 2, 3, 4, 5, or 6
            roll = dice1 + dice2;
            
            results[roll - 2]++;
        }
        
        System.out.printf("%-8s%8s%8s\n", "Roll", "Count", "Freq");
        for(int i = 0; i < results.length; i++) {
            System.out.printf("%-8d%8d%8.2f\n", i+2, results[i], results[i] / 36000000.0);
        }
    }
}