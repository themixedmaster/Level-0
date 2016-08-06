import java.util.Random;

import javax.swing.JOptionPane;

public class DiceGenerator2 {
	public static void main(String[] args) {
		String diceAmount = JOptionPane.showInputDialog(null, "how many sides are on your 8loi dice?");
		int dice = Integer.parseInt(diceAmount);
		int rolled = new Random().nextInt(dice) + 1;
		int rolled2 = new Random().nextInt(dice) + 1;
		int rolled3 = new Random().nextInt(dice) + 1;
		int rolled4 = new Random().nextInt(dice) + 1;
		int rolled5 = new Random().nextInt(dice) + 1;
		JOptionPane.showMessageDialog(null, " You rolled " + rolled + ", " + rolled2 + ", " + rolled3 + ", " + rolled4 + ", and " + rolled5 + "!");
		
	}
}