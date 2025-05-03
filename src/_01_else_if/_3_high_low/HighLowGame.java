package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		
			int random = new Random().nextInt(100)+1;
	
			// 2. Print out the random variable above
			//System.out.println(random);
			
					// 11. Repeat steps 1 to 10 ten times
	
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			for(int i=1;i<=10;i++) {
			String userAnswer = JOptionPane.showInputDialog("guess a number 1-100.  u are on guess # "+i+" of 10");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int numAnswer = Integer.parseInt(userAnswer.trim());
			// 5. if the guess is correct
			if(numAnswer==random) {
			// 6. Win
				runInternationalMode();
				System.exit(0);
			}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(numAnswer>random) {
			// 8. Tell them it's too high
			JOptionPane.showMessageDialog(null, "too high guess again");
			}
			// 9. if the guess is low
			if(numAnswer<random) {
			// 10. Tell them it's too low
			JOptionPane.showMessageDialog(null, "too low guess again");
			}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "L BOZO U STINK YOU LOST");

	}

	private static void runInternationalMode() {
		//enter int mode?
		// exit or whatever
		String inter = JOptionPane.showInputDialog("u r correct. do you want to got to internationals");
		if(inter.equalsIgnoreCase("yes")) {
			int random = new Random().nextInt(1000)+1;
			
			// 2. Print out the random variable above
			//System.out.println(random);
			
					// 11. Repeat steps 1 to 10 ten times
	
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			for(int i=1;i<=15;i++) {
			String userAnswer = JOptionPane.showInputDialog("guess a number 1-1000.  u are on guess # "+i+"of 15");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int numAnswer = Integer.parseInt(userAnswer.trim());
			// 5. if the guess is correct
			if(numAnswer==random) {
			// 6. Win
				JOptionPane.showMessageDialog(null, "u r correct.  u win the whole thing, u will recieve ur moolah prize shortly.");
			//	runInternationalMode();
				System.exit(0);
			}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(numAnswer>random) {
			// 8. Tell them it's too high
			JOptionPane.showMessageDialog(null, "too high guess again");
			}
			// 9. if the guess is low
			if(numAnswer<random) {
			// 10. Tell them it's too low
			JOptionPane.showMessageDialog(null, "too low guess again");
			}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "L BOZO U STINK YOU LOST");

		}
		
	}

}


