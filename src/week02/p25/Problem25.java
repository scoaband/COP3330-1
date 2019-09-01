package week02.p25;

import java.util.Scanner;

public class Problem25 {
    /*
     * (Table of Squares and Cubes) Using only variables, basic arithmetic and 
     * relational operators,  console IO, and selection statements, write an
     * application that calculates the squares and cubes of the numbers from 
     * 0 to 10 and prints the resulting values in table format, as shown below.

        number   square   cube
        0        0        0
        1        1        1
        2        4        8
        3        9        27
        4        16       64
        5        25       125
        6        36       216
        7        49       343
        8        64       512
        9        81       729
        10       100      1000
     */

    public static void main(String[] args) {
        int n;
        
        System.out.printf("%-8s%-8s%-8s\n", "number", "square", "cube");
        n = 1;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 2;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 3;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 4;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 5;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 6;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 7;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 8;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 9;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        n = 10;
        System.out.printf("%-8d%-8d%-8d\n", n, n*n, n*n*n);
        
        // using a tab character or multiple spaces for alignment is also okay
    }

}
