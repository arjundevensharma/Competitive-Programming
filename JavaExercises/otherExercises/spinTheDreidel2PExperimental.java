import java.util.*;
import java.io.*;

/** A 2-4 player game that involves the spinning of a dreidel, a holiday favourite in Jewish 
 * households, during Hannukah. The game rules, with slight modifications from the original 
 * "Spin the Dreidel" game, as issued by Mr. Vojnov, are described within the program.
 *  @author arsharma 
 **/

public class spinTheDreidel2PExperimental {
		
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
					+ "Once the game is over, the user of the program is asked if they want to play again.");
		}

		correctInput = false;
		String[] names = new String[2];

		/*asks for the user to input each player's name, stored in the array 'names', accounting for 
		 *incorrect user input*/
		for (int i = 1; i <= 2; i++) {
			//prompts the user to enter each participating player's first name throughout loop iterations
			System.out.print("Player " + i + "'s First Name: ");
			String input = in.next();
			//repeat the current iteration of the loop if user input is more than one word
			if (input.contains(" ")) {
				i--;
			} else {
				names[i] += input;
			}
		}
		
		int playAgain = 1;
		
		do {
		
		int [] numChips = new int [2];
		Arrays.fill(numChips, 9);
		int potChips = 2;
		int playerTurn;
		
		boolean correctStartInput = false;
		
		while (correctStartInput == false) {
			String inputChecker = "";
			System.out.print("Input 'S' (without the quotation marks) for both players to start the game by putting 1 chip in the pot: ");
			inputChecker = in.nextLine();
			
			if (inputChecker.equals("S") || inputChecker.equals(" S") || inputChecker.equals("s") || inputChecker.equals(" s")) {
				correctStartInput = true;
			}
		}
		
		/*	for (int i = 2; numChips[0] > 0 && numChips[1] > 0; i++) {
		
			playerTurn = (i % 2);
			
			int currentPChipEffects = 0;
			String currentPlayerName = "";
			boolean sInputted = false;
			
			if (playerTurn == 0) {
				  currentPlayerName += p1Name;
			} else {
				  currentPlayerName += p2Name;
			}
			
			System.out.println("\n" + p1Name + " has " + p1NumChips + " chips.");
			System.out.println(p2Name + " has " + p2NumChips + " chips.");
			
			if (potChips == 1) {
				System.out.println("There is " + potChips + " chip in the pot.");

			} else {
				System.out.println("There are " + potChips + " chips in the pot.");
			}

			while (sInputted == false) {
				System.out.print("It is now " + currentPlayerName + "'s turn.");
				System.out.print("\n" + currentPlayerName + ", spin the dreidel by inputting '" + currentPlayerName.substring(0,1) + "' (without the quotation marks):");
				String inputChecker = in.nextLine();
				
				if (inputChecker.equals(currentPlayerName.substring(0,1)) || inputChecker.equals(" " + currentPlayerName.substring(0,1))) {
					sInputted = true;
				}
			}
			
			System.out.print("");
			
				int spinValue = (int)(Math.random()*(4)+1);
				
				switch (spinValue) {
				  case 1:
					  System.out.println("\nNun faces up; nothing happens.");
					  break;
				  case 2:
					  System.out.println("\nGimel faces up; " + currentPlayerName + " gets everything in the pot.");
					  currentPChipEffects += potChips;
					  potChips = 0;
					  break;
				  case 3:
					  System.out.println("\nHei faces up; " + currentPlayerName + " gets half of the chips in the pot.");
					  currentPChipEffects += ( (potChips + 1) / 2);
					  potChips -= ( (potChips + 1) / 2);
					  break;
				  case 4:
					  System.out.println("\nShin faces up; " + currentPlayerName + " adds 2 chips to the pot.");
					  currentPChipEffects -= 2;
					  potChips += 2;
					  break;
			}
				
			if (playerTurn == 1) {
				  p1NumChips += currentPChipEffects;
			} else {
				  p2NumChips += currentPChipEffects;

			}
			
		}
		
		String winner = "";
		int winnerChipAmount = p1NumChips;
		
		if (p1NumChips < 1) {
			winner += p2Name;
			winnerChipAmount = p2NumChips;
		} else {
			winner += p1Name;
		}
		
		System.out.println("\nThe game is over. " + winner + " has won the game with " 
		+ winnerChipAmount + " chips and " + potChips + " chips left in the pot.");
		
		System.out.println("");
		
		boolean correctPlayAgainInput = false;
		
		while (correctPlayAgainInput == false) {
			System.out.print("Would you like to play again? 1 = Yes, 2 = No: ");
			playAgain = in.nextInt();
			
			if (playAgain == 2 || playAgain == 1) {
				correctPlayAgainInput = true;
			}
		}

		System.out.println("");
		*/
		}
		while (playAgain != 2); 
		
		}

}
