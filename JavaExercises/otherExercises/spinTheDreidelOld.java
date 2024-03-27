import java.util.*;
import java.io.*;

public class spinTheDreidelOld {
		
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Arjun's 2-Player Spin The Dreidel!");
		
		System.out.print("Player One's Name: ");
		String p1Name= in.nextLine();
		
		System.out.print("Player Two's Name: ");
		String p2Name= in.nextLine();
		
		int playAgain = 1;
		
		do {
		
		int p1NumChips = 9;
		int p2NumChips = 9;
		int potChips = 2;
		int playerTurn = 1;
		
		boolean correctStartInput = false;
		
		while (correctStartInput == false) {
			String inputChecker = "";
			System.out.print("Input 'S' (without the quotation marks) for both players to start the game by putting 1 chip in the pot: ");
			inputChecker = in.nextLine();
			
			if (inputChecker.equals("S") || inputChecker.equals(" S") || inputChecker.equals("s") || inputChecker.equals(" s")) {
				correctStartInput = true;
			}
		}
		
		for (int i = 2; p1NumChips > 0 && p2NumChips > 0; i++) {
			
			playerTurn = (i % 2) + 1;
			
			int currentPChipEffects = 0;
			String currentPlayerName = "";
			boolean sInputted = false;
			
			if (playerTurn == 1) {
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
		
		}
		while (playAgain != 2);
	}

}
