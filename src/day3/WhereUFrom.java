package day3;

import javax.swing.JOptionPane;

public class WhereUFrom {

	public static void main(String[] args){
		String home = JOptionPane.showInputDialog(null, "Where are you from?");
		
		if(home.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You have good tastes in living locations");
			
		}
		else if(home.equalsIgnoreCase("Oregon")) {
			JOptionPane.showMessageDialog(null, "Go DUCKS!!!");
			
		}
			
			else{JOptionPane.showMessageDialog(null, "You should move away from " + home);
		}
			
			
		
	}
}
