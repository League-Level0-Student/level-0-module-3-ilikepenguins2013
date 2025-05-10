package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class IDKWhatRootBeerTastesLike {

	public static void main(String[] args) {
		String s = "s";
		String beer = "";
		for(int bottles = 99; bottles>0;bottles--) {
			if(bottles == 1) {
				s = "";
				beer = "no more";
			}
			else {
			beer = String.valueOf(bottles-1);
			}
			
				System.out.println(bottles+" bottle"+s+" of beer on the wall, "+bottles+" bottle"+s+ " of beer.");
				System.out.println("Take one down, pass it around, "+beer+" bottles of beer on the wall.");
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"
				+ "Go to the store and buy some more, 99 bottles of beer on the wall.");

	}

}
