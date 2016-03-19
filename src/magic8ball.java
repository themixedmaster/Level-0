// Copyright Wintriss Technical Schools 2013

import java.util.Random;

import javax.swing.JOptionPane;


public class magic8ball {


    // 1. Make a main method that includes all the steps below….
 public static void main(String[] args) {
	


    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
 int RANDO_NUMBER = new Random().nextInt(4);

    // 3. Print out this variable
 System.out.println( RANDO_NUMBER);

    // 4. Get the user to enter a question for the 8 ball
 		JOptionPane.showInputDialog(" What is your \"YES OR NO\" question");

    // 5. If the random number is 0
 if( RANDO_NUMBER == 0){
	 
	 	
	 


    // -- tell the user "Yes"
JOptionPane.showInputDialog(" NO!"); 
 }
    // 6. If the random number is 1
 if( RANDO_NUMBER == 1){

    // -- tell the user "No"
	 JOptionPane.showInputDialog(" I hate you!");
 }
    // 7. If the random number is 2
 if( RANDO_NUMBER == 2){

    // -- tell the user "Maybe you should ask Google?"
	 JOptionPane.showInputDialog(" The password is 2003");
 }
    // 8. If the random number is 3
 if( RANDO_NUMBER == 3){

    // -- write your own answer

	 JOptionPane.showInputDialog(" What's the password?!");
	 
	 
}
}
}

