import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class StarTurtle2 {
	public static void main(String[] args) {
		Tortoise.setX(0);
		Tortoise.setY(1000);
		Tortoise.setSpeed(10);
		superStaryu(20);
	}

	static void staryu(int size) {
		for (int i = 1; i <= 5; i++) {
			Tortoise.penDown();
			Tortoise.move(size + 30);
			Tortoise.turn(144);
			Tortoise.turn(90);
			Tortoise.move(size + 30);
			Tortoise.turn(-90);
			Tortoise.penUp();
		}
	}

	static void staryuLine(int size) {
		for (; true;) {
			staryu(size - 40);
			Tortoise.turn(90);
			Tortoise.move(size);
			Tortoise.turn(-90);
		}
	}
	static void staryuLineDiagonal(int size) {
		for (; true;) {
			staryu(size - 40);
			Tortoise.turn(90);
			Tortoise.move(size);
			Tortoise.turn(-90);
			Tortoise.move(size);
		}
	}
	static void superStaryu(int size) {
		for (; true;size = size + 10) {
			Tortoise.setPenColor(Colors.getRandomColor());
			staryu(size - 40);
			Tortoise.turn(90);
			Tortoise.move(size);
			Tortoise.turn(-90);
			Tortoise.move(size);
		}
	}
}
