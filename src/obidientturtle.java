import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obidientturtle {

	// We are going to make an obedient tortoise that will obey our commands to
	// draw shapes. Please note that this is not a recipe, but a list
	// step-by-step instructions.

	// 1. Make a new class, create a main method, and show the tortoise.
	public static void main(String[] args) {

		Tortoise.show();

		int yesno = JOptionPane.showConfirmDialog(null, " Do you need proof of the illuminati?");
		if (yesno == 0) {
			drawilluminati();
		}else{
			JOptionPane.showInputDialog(null, " What shape do you want");
		}
	}

	// 3. Extract this code into a drawSquare() method.
	static void drawsquare() {
		Tortoise.setSpeed(1);
		Tortoise.penDown();
		for (int i = 1; i <= 4; i++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}

	static void drawilluminati() {
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.GREEN);
		for (int i = 1; i > 0; i++) {
			for (i = 1; i <= 3; i++){
			Tortoise.move(100);
			Tortoise.turn(120);
			}
			JOptionPane.showMessageDialog(null, " Illuminati confirmed!");
		}
	}

	static void drawtriangle() {
		Tortoise.setSpeed(1);
		Tortoise.penDown();
		for (int i = 1; i <= 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(120);
		}
	}

	static void drawcircle() {
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		for (int i = 1; i <= 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
	// 4. Have the Tortoise draw a triangle.

	// 5. Extract this code into a drawTriangle() method.

	// 6. Have the Tortoise draw a circle.

	// 7. Extract this code into a drawCircle() method.

	// 8. Ask the user which shape they want. Draw the appropriate shape
	// depending on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on
	// their answer.

}
