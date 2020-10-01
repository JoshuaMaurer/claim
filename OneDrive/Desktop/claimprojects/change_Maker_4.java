package Change_Maker;

import java.util.Scanner;

/**
 * The changeMaker is a simple program. It implements an application that when given a whole number by the user, from 1-99,
 * will give a return in US coin currency. Ie.. quarters(25), dimes(10), nickels(5) and pennies(1). 
 * If there is a "0" for a specific denomination, it will not be displayed.
 * 
 * 
 * @author Josh Maurer
 * @version 1.0
 * @since 2020-09-29
 *
 */

public class change_Maker_4 {
	
/**
 * This is the main method which makes use of changeMaker method.
 * 
 */

	public static void main(String[] args) {
		
		System.out.println("Please enter a number from 1 to 99 and then press enter.");
		System.out.println("It must be a whole number.");
		System.out.println("This program will return your change in USD coins.");
	     
		Scanner input = new Scanner (System.in);
		
		int change = input.nextInt();
		
		changeMaker(change);
	     
     	input.close();
		
	}
	
	/**
	 * This method is uses a progression using multiple if statements starting with the larger coin denomination 
	 * and ending with the smallest.
	 * The else/if statement limits the external input to no more than 99.
	 * @param change
	 * @return change
	 */
		public static int changeMaker(int change) {
			
			int Quarter = 0;
			int Dime = 0;
			int Nickel = 0;
			int Penny = 0;			
			int comp = change;
			
			if (change >= 25 && change <= 99) {
				Quarter = change / 25;
				System.out.println("You will recieve " + Quarter + " Quarter(s).");
				comp = change - (25 * Quarter);
		}
			if (comp >= 10 && change <= 99) {
				Dime = comp / 10;
				System.out.println("You will recieve " + Dime + " Dime(s).");
				comp = comp - (10 * Dime);
		}
			if (comp >= 5 && change <= 99) {
				Nickel = comp / 5;
				System.out.println("You will recieve " + Nickel + " Nickel(s).");
				comp = comp - (5 * Nickel);
		}
			if (comp >= 1 && change <= 99) {
				Penny = comp / 1;
				System.out.println("You will recieve " + Penny + " Penny(ies).");
		}
			else if (change >= 99) {
			System.out.println("This value is WAY more than I can handle right now...");
		}
			return change;

	}

}
