package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot soul = new Robot();
	soul.setSpeed(100);
	soul.penDown();
	soul.setPenWidth(10);
	soul.setRandomPenColor();/// can't choose color
soul.sparkle();
Robot.setWindowColor(20, 0, 0);

for(int i = 0; i < 4; i++) {
		soul.move(250);
		soul.turn(90);
}
	soul.setPenColor(Color.orange);///can choose color
	soul.turn(90);
soul.move(250);
	}
}
