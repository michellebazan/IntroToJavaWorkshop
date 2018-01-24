package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {

	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to
		// do it...
		JOptionPane.showMessageDialog(null, "Do you love cheesy stories?");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog(null, "Enter an adjective");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog(null, "Enter a type of liquid");
		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog(null, "Enter a body part");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog(null, "Enter a verb");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog(null, "Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "There was a " + adjective + " hambuger. It drinks " + liquid + " and loves "
				+ bodyPart + ". Hamburgers will chase you if you " + verb + ". Hambugers live in " + place +".\n The End");
		// Make a pop-up for the final story. You can use \n to go to the next line
	
		/*NEW LINES*/
		///JOptionPane.showMessageDialog(null, "This is a really \n looooooooong message");
		///This will print:
		///This is a really
		///loooooooong message


	}
}
