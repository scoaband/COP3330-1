package module04.ch06.p26;

import java.util.Scanner;

public class Application {
    /*
     * (Distance Between Points) Write method distance to calculate the distance
     * between two points (x1, y1) and (x2, y2). All numbers and return values
     * should be of type double. Incorporate this method into an application that
     * enables the user to enter the coordinates of the points.
     */
    
    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the coordinates in the form of: x1 y1 x2 y2");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        
        System.out.printf("The distance from (%.2f, %.2f) to (%.2f, %.2f) is %.2f", x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }

}
