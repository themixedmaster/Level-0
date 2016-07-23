import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class najerster {

	public static void main(String[] args) {

		int baseSize = 300; // the size of the black part of the star

		int flameSize = 200; // the length of the flaming arms

		// 1. Make a new robot, and set it's pen down.
		Robot gavin = new Robot();
		Robot owen = new Robot();
		gavin.penDown();
		owen.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the
		// center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can
		// make.

		// 12. Set the robot speed to 10
		gavin.setSpeed(10);
		// 13. Make all the code below repeat 25 times
		for (int i = 0; i <= 25; i++) {
			// 2. Turn the robot 1/8 of a circle
			gavin.turn(45);
			// 3. Move the robot 64 pixels
			gavin.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will
			// turn
			// the robot counter-clockwise.)
			gavin.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			gavin.setPenColor(Color.red);
			gavin.move(flameSize);
			// 6. Turn the robot 170 degrees
			gavin.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			gavin.move(flameSize);
			gavin.setPenColor(0, 0, 0);
			// 8. Turn the robot 64 degrees to the right
			gavin.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			gavin.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one
			// arm of
			// the ninja star.
		}
		owen.setSpeed(10);
		owen.turn(120);
		// 13. Make all the code below repeat 25 times
		for (int i = 0; i <= 25; i++) {
			// 2. Turn the robot 1/8 of a circle
			owen.turn(45);
			// 3. Move the robot 64 pixels
			owen.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will
			// turn
			// the robot counter-clockwise.)
			owen.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			owen.setPenColor(Color.green);
			owen.move(flameSize);
			// 6. Turn the robot 170 degrees
			owen.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			owen.move(flameSize);
			owen.setPenColor(0, 0, 0);
			// 8. Turn the robot 64 degrees to the right
			owen.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			owen.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one
			// arm of
			// the ninja star.
		}
		// 11. Color your ninja star like Figure 2.

	}

}
