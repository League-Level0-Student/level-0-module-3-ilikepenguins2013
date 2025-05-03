package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story_of_doom {

	public static void main(String[] args) {
		String userAnswer = JOptionPane.showInputDialog("u r in a jungle.  u are starving.  u hear crackling leaves.  what do u do.  run, hide or stay put");
		if(userAnswer.equalsIgnoreCase("run")) {
			JOptionPane.showMessageDialog(null, "u died, it was a jaguar and it trampled u 2 death and ate u for dinner");
			System.exit(0);
		}
		else if(userAnswer.equalsIgnoreCase("hide")) {
			JOptionPane.showMessageDialog(null, "u survived. it was a jaguar and it did not see u.");
		}
		else if(userAnswer.equalsIgnoreCase("stay put")) {
			JOptionPane.showMessageDialog(null, "u died in 2 seconds and became jaguar food");
			System.exit(0);
		}
		String userAnswer2 = JOptionPane.showInputDialog("a tree starts 2 fall towards u. do u run or try 2 stop it from falling");
		if(userAnswer2.equalsIgnoreCase("run")) {
			JOptionPane.showMessageDialog(null, "u died, another tree fell on u");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "u died, ur efforts were pathetic and u died");
			System.exit(0);
		}
	}

}
