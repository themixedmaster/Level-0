import org.jointheleague.graphical.robot.Robot;

public class robuttGrafphiti {

	public static void main(String[] args) {
		Robot gavin = new Robot();
		gavin.setSpeed(10);
		gavin.penDown();
		gavin.turn(90);
		gavin.move(270);
		gavin.turn(90);
		for (int i = 315; i > 0; i--) {
			gavin.move(5);
			gavin.turn(1);
		}
		gavin.hide();
	}
}
