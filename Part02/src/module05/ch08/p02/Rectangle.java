package module05.ch08.p02;

/*
(Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. Provide
methods that calculate the rectangle’s perimeter and area. It has set and get methods for both length and width.
The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than
20.0.

Write a program to test class Rectangle.
 */

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }

    public double area() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double value) {
        if(value >= 0.0 && value <= 20.0) {
            length = value;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double value) {
        if(value >= 0.0 && value <= 20.0) {
            width = value;
        }
    }
}
