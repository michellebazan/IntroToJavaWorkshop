package day3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	// 1. make a main method and put steps 2, 3 & 4 inside it

public static void main(String[] args){
	String y = "some text";
	printStuff(y);
	String sentence = JOptionPane.showInputDialog(null, "Give me a sentence");
}


static void printStuff(String x){
	System.out.println("stuff");
}

	// 2. ask the user for a sentence


	// 3. call the speak method below and send it the sentence

	// 4. repeat steps 2 and 3 a lot of times

	
	
	

	
	
	
	/* Don’t change this…. */
	static void speak(String sentence) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
		voice.deallocate();
	}

}
