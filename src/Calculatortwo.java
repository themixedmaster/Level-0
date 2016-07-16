import javax.swing.JOptionPane;

public class Calculatortwo {
	public static void main(String[] args) {
		String math = JOptionPane.showInputDialog(null, " Choose your type of math, +, -, *, /, or %.");
		String number1 = JOptionPane.showInputDialog(null, " Pick a number.");
		int num1 = Integer.parseInt(number1);
		if( math.equals ("+")){
			printadd();
		
		if( math.equals ("-")){
			
		}
		if( math.equals ("*")){
			
		}
		if( math.equals ("/")){
			
		}
		if( math.equals ("%")){
			
		}
		}

	}

	static void printadd(int a, int b) {
		int answer = a - b;
		System.out.println(a + " + " + b + " = " + a + b);
	}

	static void printsubtract(int a, int b) {
		int answer = a - b;
		System.out.println(a + " - " + b + " = " + answer);
	}

	static void printmultiply(int a, int b) {
		System.out.println(a + " * " + b + " = " + a * b);
	}

	static void printdivide(int a, int b) {
		System.out.println(a + " / " + b + " = " + a / b);
	}

	static void printmodulo(int a, int b) {
		System.out.println(a + " % " + b + " = " + a % b);
	}
}
