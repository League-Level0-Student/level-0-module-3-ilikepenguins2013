package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {

	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("are you happy");
		String something = "keep doing whatever you're doing";
		if(happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, something);
		}
		else if(happy.equalsIgnoreCase("no")) {
			String wHappy = JOptionPane.showInputDialog("do you want to be happy");
			if(wHappy.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			}
			else if(wHappy.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, something);
			}
		}
	}
}

