
import org.teachingextensions.logo.Tortoise;

public class TortoiseWalkOfStaryu {

	public static void main(String[] args) {

		for (; true;) {
			// 1. Set the X position of the Tortoise so that it starts on the
			// left. You also need to show the Tortoise to see the result of
			// this line.
			int x = 0;
			Tortoise.setX(x);

			// 2. Make the Tortoise draw a star shape. Hint: 144.
			Tortoise.penDown();
			for (int i = 1; i <= 5; i++) {
				Tortoise.move(30);
				Tortoise.turn(144);
			}
			Tortoise.penUp();
			x = x + 50;
		}

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

}
