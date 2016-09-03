import org.teachingextensions.logo.Tortoise;

public class StarTurtle2 {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		staryuLineDiagonal(20);
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
		for (; true;) {
			staryu(size - 40);
			Tortoise.turn(90);
			Tortoise.move(size);
			Tortoise.turn(-90);
			Tortoise.move(size);
		}
	}
}
