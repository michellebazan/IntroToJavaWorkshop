package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		JOptionPane.showMessageDialog(null, "Who do you dislike or hate?");
		  String input = JOptionPane.showInputDialog(null, "Tell me");
		  System.out.println(input);
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + input);
		// 3. Ask the user for the name of their best friend
		JOptionPane.showMessageDialog(null, "Who is your best friend?");
		  String input1 = JOptionPane.showInputDialog(null, "...");
		  System.out.println(input1);
		// 4. Tell them their best friend is as sweet as candy
		  JOptionPane.showMessageDialog(null, "Your best friend is as sweet as candy ");
	} 
}



