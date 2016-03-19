import java.net.URI;

import javax.swing.JOptionPane;


public class crazyCatLady {

    public static void main(String[] args) {

        // 1. Ask the user how many cats they have
 String Cats = JOptionPane.showInputDialog(null," How many cats do you have?");

        // 2. Convert their answer into an int
int deadpool = Integer.parseInt( Cats );

        // 3. If they have more than 3 cats, tell them they're a crazy cat lady
 		if( deadpool > 3 ){
 			
 		JOptionPane.showInputDialog(null," You have too many cats! here watch this video that has nothing to do with cats!");
 		playVideo("https://www.youtube.com/watch?v=Ntb5a3BBz2I");
 		}
 		else{
        // 4. If they have 3 or less, call the method below to show them a cat video
 			JOptionPane.showInputDialog(null," You're not that obsessed with cats so I'll let you atch this cat video. :3");
 			playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
        // 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human

 		}

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
