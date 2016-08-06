import javax.swing.JOptionPane;

public class speakandspell {

	public static void main(String[] args) {

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String answer  = JOptionPane.showInputDialog("Spell qazwsxedcrfvtbgynhujmikolp");
		

		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals("qazwsxedcrfvtbgynhujmikolp")){
			JOptionPane.showInputDialog(null, "U tuk 2 longs!");
		}else{
			JOptionPane.showInputDialog(null, "Ufail n00b!");
		}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	}

	static void speak(String words) {

		try {

			Runtime.getRuntime().exec("say " + words).waitFor();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
