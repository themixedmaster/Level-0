import javax.swing.JOptionPane;

public class KnockKnockJoke {
	public static void main(String[] args) {
		int doU = JOptionPane.showConfirmDialog(null, "Do you want to hear a joke?");
		if (doU == 0) {
			telljoke();
			String derp = JOptionPane.showInputDialog("On a scale from 1 to 10, how annoying was that?");
			int derplol = Integer.parseInt(derp);
			if (derplol > 0 && derplol < 11) {
				for (int i = 0; i < derplol; i++) {
					telljoke();
				}
			} else {
				for (; true;) {
					telljoke();
				}
			}
		}
	}

	static void telljoke() {
		String why = JOptionPane.showInputDialog("Why did the chicken cross the road?");
		int answer = JOptionPane.showConfirmDialog(null, "To get to the other side!!! Was that joke funny?");
		if (answer == 0) {
			JOptionPane.showMessageDialog(null, "YAY!");
		} else {
			JOptionPane.showMessageDialog(null, "WAAAAAAAHHHHHH!!!");
		}

	}
}
