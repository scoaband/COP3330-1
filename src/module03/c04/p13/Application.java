package module03.c04.p13;

public class Application {
    /*
     * Write a Java application that uses looping to print the following table of values:

        N       10*N    100*N   1000*N
        1       10      100     1000
        2       20      200     2000
        3       30      300     3000
        4       40      400     4000
        5       50      500     5000
     */

    public static void main(String[] args) {
        System.out.printf("%-8s%-8s%-8s%-8s\n", "N", "10*N", "100*N", "1000*N");
        for(int n = 1; n <= 5; n++) {
            System.out.printf("%-8s%-8s%-8s%-8s\n", n, 10*n, 100*n, 1000*n);
        }
    }

}
