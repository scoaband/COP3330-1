package module04.ch06.p23;

import java.util.Scanner;

public class Application {
    /*
     * (Coin Tossing) Write an application that simulates coin tossing. Let the
     * program toss a coin each time the user chooses the "Toss Coin" menu option.
     * Count the number of times each side of the coin appears. Display the results.
     * The program should call a separate method flip that takes no arguments and
     * returns a value from a Coin enum (HEADS and TAILS). [Note:If the program
     * realistically simulates coin tossing, each side of the coin should appear
     * approximately half the time.]
     */

    static enum Coin { HEADS, TAILS };
    
    static Coin flip() {
        if(Math.random() > 0.5) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // flip the coin until the user says quit
        // - track each Head or Tail
        // print the totals
    }

}
