
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(50);

		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		while(true) {
			String userColor = JOptionPane.showInputDialog("choose a color(cyan, red, yellow, pink, orange, blue, green, gray, black, and quit if you want to quit.)");
			//5. Use an if/else statement to set the pen color that the user requested
			if(userColor.equalsIgnoreCase("cyan")) {
				rob.setPenColor(Color.CYAN);
			}
			else if(userColor.equalsIgnoreCase("red")) {
				rob.setPenColor(Color.RED);
			}
			else if(userColor.equalsIgnoreCase("yellow")) {
				rob.setPenColor(Color.YELLOW);
			}
			else if(userColor.equalsIgnoreCase("pink")) {
				rob.setPenColor(Color.PINK);
			}
			else if(userColor.equalsIgnoreCase("orange")) {
				rob.setPenColor(Color.ORANGE);
			}
			else if(userColor.equalsIgnoreCase("blue")) {
				rob.setPenColor(Color.BLUE);
			}
			else if(userColor.equalsIgnoreCase("green")) {
				rob.setPenColor(Color.GREEN);
			}
			else if(userColor.equalsIgnoreCase("gray")) {
				rob.setPenColor(Color.GRAY);
			}
			else if(userColor.equalsIgnoreCase("black")) {
				rob.setPenColor(Color.BLACK);
			}
			else if(userColor.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			else {
				rob.setRandomPenColor();
			}
			for(int i=1; i<4;i++) {
				rob.move(100);
				rob.turn(120);
			}

		}
		//6. If the user doesn't enter anything, choose a random color
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	}
}
