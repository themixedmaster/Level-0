import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class dizzyTortoise {


    public static void main(String[] args) {

        String dizzy = JOptionPane.showInputDialog("How dizzy is turtle?");
        int times = Integer.parseInt(dizzy);
    	dance(times);
          


         


    }


    static void dance(int numberOfSpins) {

        for (int i = 0; i < numberOfSpins; i++) {

            Tortoise.turn(360);

        }

    }

}
