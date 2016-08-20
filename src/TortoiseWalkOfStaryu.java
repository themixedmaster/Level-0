
import org.teachingextensions.logo.Tortoise;

public class TortoiseWalkOfStaryu {

	public static void main(String[] args) {
		int x = 200;
		Tortoise.setX(900);
		Tortoise.setY(500);
		starmie();

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

	static void starmie() {
		Tortoise.setSpeed(10);
		int size = 1;
		for (; true;) {
			// 1. Set the X position of the Tortoise so that it starts on the
			// left. You also need to show the Tortoise to see the result of
			// this line.

			// 2. Make the Tortoise draw a star shape. Hint: 144.
			Tortoise.penDown();
			staryu(size);
			Tortoise.penUp();
			Tortoise.move(size + 50);
			size = size + 1;
		}
	}
	static void staryu(int size){
		for (int i = 1; i <= 6; i++) {
			Tortoise.move(size + 30);
			Tortoise.turn(144);
		}
	}
}
