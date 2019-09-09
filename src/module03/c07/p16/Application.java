package module03.c07.p16;

public class Application {
    /*
     * (Turtle Graphics) The Logo language made the concept of turtle graphics
     * famous. Imagine a mechanical turtle that walks around the room under the
     * control of a Java application. The turtle holds a pen in one of two
     * positions, up or down. While the pen is down, the turtle traces out shapes as
     * it moves, and while the pen is up, the turtle moves about freely without
     * writing anything. In this problem, you’ll simulate the operation of the
     * turtle and create a computerized sketchpad.
     * 
     * Use a 20-by-20 array floor that’s initialized to zeros. Read commands from an
     * array that contains them. Keep track of the current position of the turtle at
     * all times and whether the pen is currently up or down. Assume that the turtle
     * always starts at position (0, 0) of the floor with its pen up. The set of
     * turtle commands your application must process are:
     * 
     * Command Meaning 
     * 1       Pen up 
     * 2       Pen down 
     * 3       Turn right 
     * 4       Turn left 
     * 5,10    Move forward 10 spaces (replace 10 for a different number of spaces) 
     * 6       Display the 20-by-20 array 
     * 9       End of data (sentinel) 
     * 
     * Suppose that the turtle is somewhere* near the center of the floor. The 
     * following “program” would draw and display a 12-by-12 square, leaving the pen 
     * in the up position:
     * 
     * 2 
     * 5,12 
     * 3 
     * 5,12 
     * 3 
     * 5,12 
     * 3 
     * 5,12 
     * 1 
     * 6 
     * 9
     * 
     * As the turtle moves with the pen down, set the appropriate elements of array
     * floor to 1s. When the 6 command (display the array) is given, wherever
     * there’s a 1 in the array, display an asterisk or any character you choose.
     * Wherever there’s a 0, display a blank.
     * 
     * Write an application to implement the turtle graphics capabilities discussed
     * here. Write several turtle graphics programs to draw interesting shapes. Add
     * other commands to increase the power of your turtle graphics language.
     */
    
    // NOTE: You really don't want to do this problem without methods.

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
