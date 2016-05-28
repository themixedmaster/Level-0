import javax.swing.JOptionPane;

public class calculator {
	public static void main(String[] args) {
		String math = JOptionPane.showInputDialog(null, " Choose your type of math, +, -, *, /, or %.");
		String number1 = JOptionPane.showInputDialog(null, " Pick a number.");
		String number2 = JOptionPane.showInputDialog(null, " Pick another number.");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		if( math.equals ("+")){
			int answer = num1 + num2;
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + answer + ".");
		}
		if( math.equals ("-")){
			int answer = num1 - num2;
			JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + answer + ".");
		}
		if( math.equals ("*")){
			int answer = num1 * num2;
			JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + answer + ".");
		}
		if( math.equals ("/")){
			int answer = num1 / num2;
			JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + answer + ".");
		}
		if( math.equals ("%")){
			int answer = num1 % num2;
			JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + answer + ".");
		}
	}
}
