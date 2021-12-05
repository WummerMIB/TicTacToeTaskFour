import java.util.Scanner;

public class Human extends Player {

	public int play() {
		// Variable for loop to look if user makes the right Input
				boolean rightInput = false;
				int change = 9;
				// while loop to continue if user makes wrong input
				while (rightInput == false) {
					// Scanner for number Input from User
					Scanner sc = new Scanner(System.in);
					// look if Input from User is a number
					if (sc.hasNextInt()) {
						// sets Variable change to number from User Input
						change = sc.nextInt();
						int x = 9;
						// if number is smaller than 9 and bigger than 0 than return number from User
						// Input
						if (change <= x  && !(change <= 0)) {
							return change;
						}
						// if number is bigger than 9 or smaller or equal to 0 Print this message
						else {
							System.out.println("Bitte geben sie ein Zahl eine Zahl zwischen 1 und " + x +" ein");
						}
					}
					// if Input is a double number then print this message
					else if (sc.hasNextDouble()) {
						System.out.println("Bitte geben sie keine Kommazahl ein");
					}
					// if Input is a latter than Print this message
					else {
						System.out.println("Bitte geben sie eine Zahl ein");
					}

				}
				// method needs to return an int number and if it return it in if condition than
				// you get an error
				return change;
			}
	}


