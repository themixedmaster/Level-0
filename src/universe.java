import javax.swing.JOptionPane;

public class universe {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null,"Are y0u Pr0 1337 c0derz?");
		if(answer.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null,"Y0u is Pr0 1337 K1ng/Queen!!!");
		}else{
			JOptionPane.showMessageDialog(null,"Get REKT scrub!");
		}
	}
}
