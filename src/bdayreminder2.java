import javax.swing.JOptionPane;

public class bdayreminder2 {

	public static void main(String[] args) {

	    

        // 1. correct the birthdays for your family below

        String momsBirthday = "April 26th";

        String dadsBirthday = "March 30th";

        String myBirthday = "December 22nd";
        
        String dogsBirthday = "November I think";
        
        String owensBirthday = "May 28th";
        
        String dylansBirthday = "December 7th";
        
        String grandpasBirthday = "November 28th";

        String grandmasBirthday = "September 8th";
        
        String papasBirthday = "November 26th";


        // 2. Find out which birthday the user wants and and store their response in a variable
        String familymember = JOptionPane.showInputDialog(" Who's birthday do you want to remember?");
    

        // 3. Print out what the user typed
      
        System.out.print( familymember );
        
        // 4. if user asked for "mom"
        	if( familymember.equals("Gavin")){
        	System.out.print("'s birthday is " + myBirthday + ".");	
        	}
            //print mom's birthday
        	else if( familymember.equals("Dad")){
            	System.out.print("'s birthday is " + dadsBirthday + ".");	
            	}
        // 5. if user asked for "dad"
        	else if( familymember.equals("Mom")){
            	System.out.print("'s birthday is " + momsBirthday + ".");	
            	}
            // print dad's birthday
        	else if( familymember.equals("Baloo")){
            	System.out.print("'s birthday is " + dogsBirthday + ".");	
            	}
        // 6. if user asked for your name
        	else if( familymember.equals("Owen")){
            	System.out.print("'s birthday is " + owensBirthday + ".");	
            	}
            // print myBirthday
        	else if( familymember.equals("Dylan")){
            	System.out.print("'s birthday is " + dylansBirthday + ".");	
            	}
        	else if( familymember.equals("Grandpa")){
            	System.out.print("'s birthday is " + grandpasBirthday + ".");	
            	}
        	else if( familymember.equals("Grandma")){
            	System.out.print("'s birthday is " + grandmasBirthday + ".");	
            	}
        	else if( familymember.equals("Candas")){
            	System.out.print("'s birthday is " + grandmasBirthday + ".");	
            	}
        	else if( familymember.equals("Papa")){
            	System.out.print("'s birthday is " + papasBirthday + ".");	
            	}
        //7. otherwise print "Sorry, i don't remember that person's birthday!"
        	else{
            	System.out.print(", who's " + familymember + "?");	
            	}
    } 
	
}
