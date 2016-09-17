import javax.swing.JOptionPane;

public class NasaCountdownz {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("NAMBERZ?!?!?!?!?");
		if (number.equals("8loi")) {
			text("AYY U MADE IT @TAHDX MOOOOOOOOOOOOOOOONNN!!! 8loi! 8loi! 8loi! GOODod JOUB U WINZZZ!!!");
		} else {
			int counter = Integer.parseInt(number);
			counter = counter * 1000;
			for (int o = counter; o > 0; o--) {
				if(o % 1000 == 0){
					System.out.println(o / 1000);
				}else{
					System.out.print("");
				}
			}
			text("BLAST OFD GOOOKD JOUB YOUIK GHOOYUT TO@ TEGH MOIOOOOOPOOONNNNBHBJNN!!!!!!!! NO 8loi 4 U! U FAIL, YORT SHIPPOOP EXPLOOPDODEDED!!!!!");
		}
	}
	static void text(String text){
		JOptionPane.showMessageDialog(null, text);
	}
}
