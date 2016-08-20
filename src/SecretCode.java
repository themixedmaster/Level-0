import java.util.Random;

import javax.swing.JOptionPane;

public class SecretCode {
	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {

		// 1. Set the passcode in a String variable
		String password = "Snarf";
		// 2. Using a pop-up, ask for a secret message and store it in a
		// variable
		String attempt = JOptionPane.showInputDialog("Insert Password... Hint: To eat or drink very quickly.");
		// 3. Ask your friend for the passcode and store it in a variable
		if(attempt.equals(password)){
			JOptionPane.showMessageDialog(null,"They Snarfed up that frozen yogurt!");
		}else{
			JOptionPane.showMessageDialog(null,"You Fail!");
		}
		// 4. If the passcode matches, show the secret message

		// 5. If the passcode does not match, pop-up "INTRUDER!!"
	}
}


























































