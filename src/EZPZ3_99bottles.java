import javax.swing.JOptionPane;

public class EZPZ3_99bottles {

	public static void main(String[] args) {
		for(int i = 99; i > 0; i--){
			if(i == 1){
				int j = i - 1;
				System.out.println( i + " bottle of penguin blood on the wall, " + i + " bottle of penquin blood! Take one down, pass it around, no more bottles of penguin blood on the wall!");
			}else if(i == 2){
				int j = i - 1;
				System.out.println( i + " bottles of penguin blood on the wall, " + i + " bottles of penquin blood! Take one down, pass it around," + j + " bottle of penguin blood on the wall!");
				}else{
				int j = i - 1;
				System.out.println( i + " bottles of penguin blood on the wall, " + i + " bottles of penquin blood! Take one down, pass it around," + j + " bottles of penguin blood on the wall!");
			}
		}
	}
}
