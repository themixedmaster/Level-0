import java.net.URI;

import javax.swing.JOptionPane;

public class riddlemethis {


    public static void main(String[] args) {


       
    	int score = 0;

        
    	String answer = JOptionPane.showInputDialog(null, "And his name is- ");

        
    	if( answer.equalsIgnoreCase("John Cena")  ){
    	JOptionPane.showMessageDialog(null, " Correct!");
    	score = score + 1;
   answer = JOptionPane.showInputDialog(null, "What will Michiyo give Gavin? ");

        
    	if( answer.equalsIgnoreCase("Joly Ranchers")  ){
    	JOptionPane.showMessageDialog(null, " Correct!");
    	score = score + 1;
    	}
        
    	else{
    		JOptionPane.showMessageDialog(null, " GIVE ME JOLLY RANCHERS, MICHIYO!!!!!!!");
    	}

       


       
    	JOptionPane.showMessageDialog(null, " Your score is " + score + ".");
       
    	}
        
    	else{
    		playVideo("https://www.youtube.com/watch?v=nP1tFvRfnFs");
    	}

       


       
    	JOptionPane.showMessageDialog(null, " Your score is " + score + ".");
       
    	
    	
    }
    static void playVideo(String videoURL) {

        try {

            URI uri = new URI(videoURL);

            java.awt.Desktop.getDesktop().browse(uri);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
