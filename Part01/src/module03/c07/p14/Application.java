package module03.c07.p14;

import java.util.Scanner;

public class Application {
	/*
	 * (Airline Reservations System) A small airline has just purchased a computer
	 * for its new automated reservations system. You’ve been asked to develop the
	 * new system. You’re to write an application to assign seats on each flight of
	 * the airline’s only plane (capacity: 10 seats).
	 * 
	 * Your application should display the following alternatives: Please type 1 for
	 * First Class and Please type 2 for Economy. If the user types 1, your
	 * application should assign a seat in the first-class section (seats 1–5). If
	 * the user types 2, your application should assign a seat in the economy
	 * section (seats 6–10). Your application should then display a boarding pass
	 * indicating the person’s seat number and whether it’s in the first-class or
	 * economy section of the plane.
	 * 
	 * Use a one-dimensional array of primitive type boolean to represent the
	 * seating chart of the plane. Initialize all the elements of the array to false
	 * to indicate that all the seats are empty. As each seat is assigned, set the
	 * corresponding element of the array to true to indicate that the seat is no
	 * longer available.
	 * 
	 * Your application should never assign a seat that has already been assigned.
	 * When the economy section is full, your application should ask the person if
	 * it’s acceptable to be placed in the first-class section (and vice versa). If
	 * yes, make the appropriate seat assignment. If no, display the message
	 * "Next flight leaves in 3 hours."
	 */

	public static void main(String[] args) {
	    final int CAPACITY = 10;
	    final int FIRST_CAPACITY = 5;
	    
	    Scanner in = new Scanner(System.in);
	    boolean[] seats = new boolean[CAPACITY];
	    
	    boolean done = false;
	    int currentFirstSeat = 0;
	    int currentEconSeat = FIRST_CAPACITY;
	    boolean firstFull = false;
	    boolean econFull = false;
	    
	    while(!done) {
    	    System.out.print("Please type 1 for First Class and Please type 2 for Economy (or 3 to quit): ");
    	    int choice = in.nextInt();
	    
    	    switch(choice) {
    	    case 1:
    	        if(currentFirstSeat < FIRST_CAPACITY) {
    	            seats[currentFirstSeat] = true;
    	            currentFirstSeat++;
    	        } else {
    	            firstFull = true;
    	        }
    	        break;
    	    case 2:
    	        if(currentEconSeat < CAPACITY) {
                    seats[currentEconSeat] = true;
                    currentEconSeat++;
                } else {
                    econFull = true;
                }
    	        break;
    	    default:
    	        // is this really a good idea? is the user expecting to quit if they enter 4?
    	        done = true;
    	        
    	        // what if we wanted to break the loop to quit instead of setting a flag? could we still use a switch statement?
    	    }
    	    
    	    if(!done) {
    	        if(firstFull && !econFull) {
    	            System.out.print("First class is full, please type 1 if you wish to be seated in economy (or 3 to return): ");
    	            choice = in.nextInt();
    	            if(choice == 1) {
    	                if(currentEconSeat < CAPACITY) {
    	                    seats[currentEconSeat] = true;
    	                    currentEconSeat++;
    	                } else {
    	                    econFull = true;
    	                }
    	            } else {
    	                continue;
    	            }
    	        }
    	        if(!firstFull && econFull) {
    	            System.out.print("Economy class is full, please type 1 if you wish to be seated in first class (or 3 to return): ");
                    choice = in.nextInt();
                    if(choice == 1) {
                        if(currentFirstSeat < CAPACITY) {
                            seats[currentFirstSeat] = true;
                            currentFirstSeat++;
                        } else {
                            firstFull = true;
                        }
                    } else {
                        continue;
                    }
    	        }
    	        if(firstFull && econFull) {
                    System.out.println("I'm sorry, but the flight is full. The next flight leaves in 3 hours.");
                    done = true;
    	        }
    	    }
	    }
	}
	
	// Notice that this code is very ugly. Methods would make a big step in making it more readable.
}
