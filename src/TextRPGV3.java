import java.net.URI;
import java.util.Scanner;

public class TextRPGV3 {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		text("Are you ready to enter a world of magical creatures and enemies everywhere? yes or no");
		String answer = hi.nextLine();
		if(answer.equalsIgnoreCase("no")){
			text("TOO BAD!!!");
		}
		text("What is your name?");
		String name = hi.nextLine();
		text("Are you Human or Elvish?");
		String race = hi.nextLine();
		text(" Are you a swordfighter or an archer?");
		String specialty = hi.nextLine();
		text("Are you a boy, or are you a gril?");
		String gender = hi.nextLine();
		text(" You wake up, everything is burning. bells are ringing, people are running, and everything is on fire what do you do? Do you run or die?");
		answer = hi.nextLine();
		if(answer.equalsIgnoreCase("die")){
			text("The End");
			for(;true;){
				
			}
		}else{
			text("you escape the village, but you don't have a weapon. You are lost in a forest a miniute later and have no idea where to go. you decide to make one with the resources around you.");
			text("You make a weapon out of the sticks and march on back to the villiage. Do you SAVE the people or KILL King Caramel, the one doing all this?");
			answer = hi.nextLine();
			if(answer.equalsIgnoreCase("save")){
				text("Too late. They are dead...");
			}else{
				text(" You use your weapon to kill King caramel and his army runs away... You also saved about 100... er 99 people. Good job, heres a gift.");
				playVideo("https://scratch.mit.edu/projects/79242946/");
			}
		}
		
		
		
	}
	static void text(String derr){
		System.out.println(derr);
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
