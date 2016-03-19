import javax.swing.JOptionPane;
public class unbirthday {

	public static void main(String[] args) {
		
		
		String today = "03/12";
		String birthday = JOptionPane.showInputDialog(null, "What's your birthday? Ex.01/01");
		if(birthday.equals (today)){
			
		JOptionPane.showMessageDialog(null, " No, it's not your birthday, YOU CHEATER!!!");
			
		}else{
			
			
			JOptionPane.showMessageDialog(null, " It's not your birthday. Well that sucks...");	
			
			
		}
		
		
		
		
		
		
	}
	
}
