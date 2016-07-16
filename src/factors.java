import javax.swing.JOptionPane;

public class factors {
	public static void main(String[] args) {
		String numb = JOptionPane.showInputDialog("wat number?");
		int num = Integer.parseInt(numb);
		for(int i = 1; i <= num; i++){
			factor(num,i);
			for(int o = 1; o <= i; o++){
				factor(i,o);
			}
		}
	}
	
	static void factor(int big, int small){
		int factors = 0;
		if( big % small == 0){
			System.out.println(small + " is a factor of " + big + ".");
			factors = factors + 1;
		}
		if(factors == 2){
			System.out.println(big + " is a prime number.");
		}
	}
	
}
