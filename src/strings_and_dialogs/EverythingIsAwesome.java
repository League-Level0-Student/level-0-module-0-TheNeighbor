package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
String Awesome = JOptionPane.showInputDialog("Type in a something.");
JOptionPane.showMessageDialog(null, Awesome + " is/are awesome!");
}
}
