//Copyright Wintriss Technical Schools 2014

import javax.swing.JOptionPane;


public class candy_crush {


    public static void main(String[] args) {

        // 1. Using a pop-up, ask the user who they don't like
    	String person = JOptionPane.showInputDialog(null, " What don't you like?");

        // 2. Change the next line so that the pop-up will tell them they have a crush on that person

        JOptionPane.showMessageDialog(null, "You totally have a crush on " + person + ".");

        // 3. Ask the user for the name of their best friend
       person = JOptionPane.showInputDialog(null, " Who is your best freind?");

        // 4. Tell them their best friend is as sweet as candy
        JOptionPane.showMessageDialog(null, person + " is as sweet as candy.");

    } 

}

