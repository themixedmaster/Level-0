
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class TortoiseWalkOfStaryu {

	public static void main(String[] args) {
		int x = 200;
		Tortoise.setX(900);
		Tortoise.setY(500);
		int thing = new Random().nextInt(8) + 1;
		starmie(thing);

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/

		/*
		 * 
		 * Make the Tortoise draw a line of stars like this:
		 * 
		 * http://bit.ly/walk-of-fame
		 * 
		 * 
		 * 
		 * Hint: The distance between stars is 50.
		 * 
		 */

	}

	static void starmie(int thing) {
		Tortoise.setSpeed(10);
		int size = 1;
		for (; true;) {
			Tortoise.penDown();
			staryu(size, thing);
			Tortoise.penUp();
			Tortoise.move(size + 50);
			size = size + 1;
			thing = new Random().nextInt(8) + 1;
		}
	}
	static void staryu(int size, int thing){
		for (int i = 1; i <= thing; i++) {
			Tortoise.move(size + 30);
			Tortoise.turn(144);
		}
	}
}
