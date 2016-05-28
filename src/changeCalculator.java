// Copyright The League of Amazing Programmers 2014

import javax.swing.JOptionPane;


/*

 * I have a pocket full of change. I hate doing math. Make me a program that

 * will calculate how much money I have without me having to use my brain. Then

 * make me a sandwich.

 */

public class changeCalculator {


    public static void main(String[] args) {


       int quarters = quarters();
       int nickels = nickels();
       int dimes = dimes();
        // Calculate how much money the user has and save it in an int variable 
    	int mooney = nickels + dimes + quarters;
    	
        // Tell the user how much money they have
    	int yesno = JOptionPane.showConfirmDialog(null, " You have " + mooney + " cents. Do you want more?");

    	
    	if(yesno == 0){
    		JOptionPane.showMessageDialog(null, " You now have 3 milion dollars.");
    	}
    	
    	
    }
static int quarters(){
	String twentyfivecents = JOptionPane.showInputDialog(" How many quarters do you have?");
	int quarters = Integer.parseInt(twentyfivecents);
	quarters = quarters * 25;
	return quarters;
	}
static int nickels(){
	String fivecents = JOptionPane.showInputDialog(" How many nickels do you have?");
    // Convert their answer to an int using Integer.parseInt()
	int nickels = Integer.parseInt(fivecents);
	nickels = nickels * 5;
	return nickels;
	}
static int dimes(){
	String tencents = JOptionPane.showInputDialog(" How many dimes do you have?");
	int dimes = Integer.parseInt(tencents);
	dimes = dimes * 10;
	return dimes;
	}
}

	
