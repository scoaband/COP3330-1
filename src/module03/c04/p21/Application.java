package week03.c04.p21;

import java.util.Scanner;

public class Application {
    /*
     * (Square of Asterisks) Write an application that prompts the user to enter the
     * size of the side of a square, then displays a hollow square of that size made
     * of asterisks. Your program should work for squares of all side lengths
     * between 1 and 20.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of the square: ");
        int size = in.nextInt();
        
        for(int i = 0; i < size; i++) {
            System.out.print('*');
        }
        System.out.println();
        
        
        for(int i = 0; i < size-2; i++) {
            System.out.print('*');
            for(int j = 0; j < size-2; j++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
        
        
        for(int i = 0; i < size; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
