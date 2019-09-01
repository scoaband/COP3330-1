package week02.p19;

import java.util.Scanner;

public class Problem19 {
    /*
     * (Odd or Even) Write an application that reads an integer and determines and prints whether 
     * it’s odd or even
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer and I'll tell you if its even or odd: ");
        int n = in.nextInt();
        
        if(n % 2 == 0) {
            System.out.println(n + " is even!");
        } else {
            System.out.println(n + " is odd!");
        }
    }

}
