import javax.swing.JOptionPane;

public class cowevolutioncalculator {
	public static void main(String[] args) {
		double cps = 1;
		for(int universe = 1; true; universe++ ){
			JOptionPane.showMessageDialog(null, "Universe #" + universe + ", CPS: " + cps);
			cps = cps + (cps / 10);
		}
	}
}
