import java.util.*;
import java.io.*;

/** A 2 player game that involves the spinning of a dreidel, a holiday favourite in Jewish 
 * households, during Hannukah. The game rules, with slight modifications from the original 
 * "Spin the Dreidel" game, as issued by Mr. Vojnov, are described within the program.
 *  @author arsharma 
 **/

public class spinTheDreidel2P {
		
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Arjun's Spin The Dreidel Game!");
		
		String nun = "    ()\n"
				+ " ___||____\n"
				+ "|   __    |\n"
				+ "|     |   |\n"
				+ "|     |   |\n"
				+ "|   __|   |\n"
				+ "|	  |\n"
				+ " \\_   ___/\n"
				+ "    \\/\n";
		String gimel = "    ()\n"
				+ " ___||____\n"
				+ "|  __     |\n"
				+ "|    |    |\n"
				+ "|    |    |\n"
				+ "|  _/ \\   |\n"
				+ "|	  |\n"
				+ " \\_   ___/\n"
				+ "    \\/\n";
		String hei = "    ()\n"
				+ " ___||____\n"
				+ "|         |\n"
				+ "|   ____  |\n"
				+ "|      |  |\n"
				+ "|   |  |  |\n"
				+ "|	  |\n"
				+ " \\_   ___/\n"
				+ "    \\/\n";
		String shin = "    ()\n"
				+ " ___||____\n"
				+ "|         |\n"
				+ "| |  |  | |\n"
				+ "| |__|  | |\n"
				+ "| |_____/ |\n"
				+ "|	  |\n"
				+ " \\_   ___/\n"
				+ "    \\/\n";
		
		boolean correctInput = false;
		int showRules = 0;
		
		/*asks the user to input 1 or 2 to indicate if they would like to see the rules; asks again
		 *if incorrect input is received*/
		while (correctInput == false) {
			System.out.print("\nWould you like to see the rules of 'Spin The Dreidel' (1 = yes, 2 = no)?");
			showRules = in.nextInt();
			//if user input is correct, continue to the rest of the code, otherwise repeat the loop
			if (showRules == 1 || showRules == 2) {
				correctInput = true;
			}
		}
		
		//if the user inputted 1, the rules of the game are shown
		if (showRules == 1) {
			System.out.println("\nEach player starts with 10 chips. Each player puts a chip into the pot. The dreidel has 4 sides. "
					+ "\nOn each round, a player spins the dreidel, and the outcome of the spin decides what happens. "
					+ "\nThe players go back and forth until only one player remains that hasn't lost all of their chips!\n"
					+ "\nEach spin is random, with the following outcomes:\n"
					+ "If nun is facing up, the player does nothing.\n"
					+ "When nun faces up, the dreidel looks like this: \n"
					+ nun
					+ "\nIf gimel is facing up, the player gets everything in the pot.\n"
					+ "Each player then puts a chip in and the game continues.\n"
					+ "When gimel faces up, the dreidel looks like this: \n"
					+ gimel
					+ "\nIf hei is facing up, the player gets half of the chips in the pot.\n"
					+ "If there are an odd number of chips in the pot, the player takes half the pot rounded up to the nearest whole number.\n"
					+ "When hei faces up, the dreidel looks like this: \n"
					+ hei
					+ "\nIf shin is facing up, the player adds 2 chips to the pot.\n"
					+ "When shin faces up, the dreidel looks like this: \n"
					+ shin
					+ "\nPlay goes back and forth between all players until only one player remains that hasn't lost all their chips.\n"
					+ "Once the game is over, the user of the program is able to play again or terminate the program.");
		}

		String[] names = new String[2];
		Arrays.fill(names, "");
		correctInput = false;
		
		System.out.println("");

		/*asks for the user to input each player's name, stored in the array 'names', accounting for 
		 *incorrect user input*/
		for (int i = 0; i < 2; i++) {
			//prompts the user to enter each participating player's first name throughout loop iterations
			System.out.print("Player " + (i + 1) + "'s First Name: ");
			String input = in.next();
			//repeat the current iteration of the loop if user input is more than one word
			if (input.contains(" ")) {
				i--;
			} else {
				names[i] += input;
			}
		}
		
		int playAgain = 1;
		
		/*the contents of the loop make up the program's gameplay function; if the user indicates they
		 * want to play again, the program will re-iterate the contents of this loop*/
		do {
		
		int [] numChips = new int [2];
		Arrays.fill(numChips, 9);

		int potChips = 2;
		int playerTurn = 0;
		
		System.out.print("\nInput the return/enter key for both players to start the game by putting 1 chip in the pot.");
		System.in.read();
		
		//the contents of this loop make up the actions performed during each player's turn
		for (int i = 2; numChips[0] > 0 && numChips[1] > 0; i++) {
			
			playerTurn = (i % 2);
			
			System.out.println("");
			
			//outputs the amount of chips that both players have
			System.out.println(names[0] + " has " + numChips[0] + " chips.");
			System.out.println(names[1] + " has " + numChips[1] + " chips.");
			
			//outputs the current amount of chips in the pot; the output statement is made grammatically correct through this if statement for all values of the amount of chips in the pot
			if (potChips == 1) {
				System.out.println("There is " + potChips + " chip in the pot.");

			} else {
				System.out.println("There are " + potChips + " chips in the pot.");
			}
			
				System.out.print("\nIt is now " + names[playerTurn] + "'s turn. ");
				System.out.print(names[playerTurn] + ", spin the dreidel by inputting the enter/return key.");
				System.in.read();
				
				/*dreidel rolling animation after each player spins the dreidel by 
				*inputting enter*/
				for (int j = 0; j < 8; j++) {
					System.out.print(gimel);
					Thread.sleep(50);
					System.out.print(nun);
					Thread.sleep(50);
					System.out.print(hei);
					Thread.sleep(50);
					System.out.print(shin);
					Thread.sleep(50);
				}
			
				//stores a random number from 1-4
				int spinValue = (int)(Math.random()*(4)+1);
				
				switch (spinValue) {
				  //if the random number was one, nothing changes
				  case 1:
					  System.out.print(nun);
					  Thread.sleep(750);
					  System.out.println("\nNun (נ) faces up; nothing happens.");
					  break;
				  /*if the random number was two, the current player gains all of the chips in the pot
				   *and all players deposit one chip into the pot. */
				  case 2:
					  System.out.print(gimel);
					  Thread.sleep(750);
					  System.out.println("\nGimel (ג) faces up; " + names[playerTurn] + " gets everything in the pot."
					  		+ "\nAll players put an additional chip into the pot.");
					  //the chip amount of the player who rolled the dreidel is updated
					  numChips[playerTurn] += potChips;
					  //the pot chip amount is updated
					  potChips = 2;
					  //all players' chip amounts are updated through this loop
					  numChips[0] --;
					  numChips[1] --;
					  break;
				  //if the random number was three, the current player gains half of the pot's chips, rounded up
				  case 3:
					  System.out.print(hei);
					  Thread.sleep(750);
					  System.out.println("\nHei (ה) faces up; " + names[playerTurn] + " gets half of the chips in the pot.");
					  //the chip amount of the player who rolled the dreidel is updated
					  numChips[playerTurn] += ( (potChips + 1) / 2);
					  //the pot chip amount is updated
					  potChips -= ( (potChips + 1) / 2);
					  break;
				  //if the random number was four, the player who just rolled the dreidel adds 1 or 2 chips to the pot
				  case 4:
					  System.out.print(shin);
					  Thread.sleep(750);
					  System.out.print("\nShin (ש) faces up; " + names[playerTurn]);
					  //if the player that just rolled the dreidel only has one chip remaining, they only add 1 chip to the pot, otherwise they add two
					  if (numChips[playerTurn] == 1) {
						  //the pot chip amount is updated
						  potChips += 1;
						  //the chip amount of the player who rolled the dreidel is updated
						  numChips[playerTurn] -= 1;
						  System.out.println(" adds 1 chip to the pot.");
					  } else {
						  //the pot chip amount is updated
						  potChips += 2;
						  //the chip amount of the player who rolled the dreidel is updated
						  numChips[playerTurn] -= 2;
						  System.out.println(" adds 2 chips to the pot.");
					  }
					  break;
			}	
		}
		
		int winnerIndex = 0;
		
		/*Once only one player remains, stores the index within the 'names' and 'numChips' arrays
		 *that correspond to the winning player*/
		if (numChips[0] > 0) {
			winnerIndex = 0;
		} else {
			winnerIndex = 1;
		}
		
		System.out.println("\nThe game is over. " + names[winnerIndex] + " has won the game with " 
		+ numChips[winnerIndex] + " chips and " + potChips + " chips left in the pot.");
		
		System.out.println("");
		
		correctInput = false;
		
		/*asks the player if they would like to play again: if 2 is inputted, the program ends; if 1 is
		 *inputted, the program re-iterates the do-while loop containing the program's gameplay function.*/
		while (correctInput == false) {
			System.out.print("Would you like to play again? 1 = Yes, 2 = No: ");
			playAgain = in.nextInt();
			//if user input is correct, continue to the rest of the code, otherwise repeat the loop
			if (playAgain == 1 || playAgain == 2) {
				correctInput = true;
			}
		}
		
		}
		while (playAgain != 2);
		
		System.out.print("\nThanks for playing!");
	}
	
}