package week02.p26;

import java.util.Scanner;

public class Problem26 {
    /*
     * (Negative, Positive and Zero Values) Write a program that inputs five numbers
     * and determines and prints the number of negative numbers input, the number of
     * positive numbers input and the number of zeros input.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers: ");
        
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();
        
        in.close();
        
        int numPositive = 0;
        int numNegative = 0;
        int numZero = 0;
        
        if(n1 > 0) {
            numPositive++;
        } else if(n1 < 0) {
            numNegative++;
        } else {
            numZero++;
        }
        
        if(n2 > 0) {
            numPositive++;
        } else if(n2 < 0) {
            numNegative++;
        } else {
            numZero++;
        }
        
        if(n3 > 0) {
            numPositive++;
        } else if(n3 < 0) {
            numNegative++;
        } else {
            numZero++;
        }
        
        if(n4 > 0) {
            numPositive++;
        } else if(n4 < 0) {
            numNegative++;
        } else {
            numZero++;
        }
        
        if(n5 > 0) {
            numPositive++;
        } else if(n5 < 0) {
            numNegative++;
        } else {
            numZero++;
        }
        
        System.out.println("Positive numbers: " + numPositive);
        System.out.println("Negative numbers: " + numNegative);
        System.out.println("Zeroes: " + numZero);
    }

}
