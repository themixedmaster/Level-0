import javax.swing.JOptionPane;

public class measurer {
	public static void main(String[] args) {
		String rulez = question(" How many inches to ride???");
		int daRulez = Integer.parseInt(rulez);
		String feet = question("Feet?");
		int feet2 = Integer.parseInt(feet);
		String inches = question("inches?");
		int inches2 = Integer.parseInt(inches);
		int trueInch = measures(feet2, inches2);
		String trueTrueInch = Integer.toString(trueInch);
		trueTrueInch = "You are " + trueTrueInch + " inches tall.";
		text(trueTrueInch);
		if (trueInch >= daRulez) {
			text("You can go in!!!");
		} else {
			text("YOU SHALL NOT PASS!!!");
			text("You still need to grow " + (daRulez - trueInch) + " inches");
		}
	}

	static int measures(int feet, int inches) {
		inches = inches + (feet * 12);
		return (inches);

	}

	static String question(String text) {
		String answer = JOptionPane.showInputDialog(text);
		return (answer);
	}

	static void text(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
}
