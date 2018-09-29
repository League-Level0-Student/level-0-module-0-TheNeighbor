package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MorningZombie {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "I eat breakfast.");
	JOptionPane.showMessageDialog(null, "I go to school.");
	String poem = JOptionPane.showInputDialog("Thou did giveth Mr. Tim a hearty meal, but unfortunately what he englut did maketh him kicketh the bucket.");
	JOptionPane.showMessageDialog(null, "HeeHooHeeHoo!");
	String color = JOptionPane.showInputDialog("What is your favorite color.");
	JOptionPane.showMessageDialog(null, color+" is also my favorite color!");
	Robot Shakespeare = new Robot();
	Shakespeare.penDown();
	Shakespeare.move(100);
	Shakespeare.turn(120);
	Shakespeare.move(100);
	Shakespeare.turn(120);
	Shakespeare.move(100);
	
		
		
	}
	
	
	
}

