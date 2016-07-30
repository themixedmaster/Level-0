import java.util.Random;

import javax.swing.JOptionPane;

public class DiceGenerator {
	public static void main(String[] args) {
		String diceAmount = JOptionPane.showInputDialog(null, "how many sides are on your 8loi dice?");
		int dice = Integer.parseInt(diceAmount);
		int rolled = new Random().nextInt(dice) + 1;
		if (rolled == 8) {
			JOptionPane.showMessageDialog(null, "8loi!!!");
		}else if(rolled == dice){
			JOptionPane.showMessageDialog(null, " You rolled " + rolled + "! You Win 8loi!!!");
		}else {
			JOptionPane.showMessageDialog(null, " You rolled " + rolled + "!");
		}
	}
}