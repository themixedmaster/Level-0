import java.io.File;


import javax.sound.sampled.AudioInputStream;

import javax.sound.sampled.AudioSystem;

import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class shinyObjects {


    public static void main(String[] args) {


        
    	String times = JOptionPane.showInputDialog("How many shiny cowards?");
    	int rtimes = Integer.parseInt(times);
        // 3. Play the sound that many times


    	playMisterZee();

    }


    public static void playMisterZee() {

        try {

            File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();

            clip.open(audioInputStream);

            clip.start();

            Thread.sleep(3400);

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }


}


