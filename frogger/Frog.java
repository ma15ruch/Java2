vimport zen.core.Zen;

public class Frog {
	int x;
	int y;
	boolean upKeyPressed = false;
	boolean downKeyPressed = false;
	boolean leftKeyPressed = false;
	boolean rightKeyPressed = false;

	public void setup() {
		x = 400;
		y = 500;
	}

	public void draw() {
		Zen.setColor("light green");
		Zen.fillOval(x - 15, y - 15, 30, 30);
	}

	public void move() {
		if (Zen.isKeyPressed("right") && rightKeyPressed == false) {
			x = x + 30;
			rightKeyPressed = true;
		}
		if (Zen.isKeyPressed("right") == false){
			rightKeyPressed = false;
		}
		if (Zen.isKeyPressed("left") && leftKeyPressed == false) {
			x = x - 30;
			leftKeyPressed = true;
		}
		if (Zen.isKeyPressed("left") == false){
			leftKeyPressed = false;
		}
		if (Zen.isKeyPressed("up") && upKeyPressed == false) {
			y = y - 50;
			upKeyPressed = true;
		}
		if (Zen.isKeyPressed("up") == false){
			upKeyPressed = false;
		}

		if (Zen.isKeyPressed("down") && downKeyPressed == false) {
			y = y + 50;
			downKeyPressed = true;
		}
		if (Zen.isKeyPressed("down") == false){
			downKeyPressed = false;
		}
		
		if (x > 800) {
			setup();
		}
		if (x < 0) {
			setup();
		}
		if (y > 500) {
			setup();
		}
		if (y < 0) {
			setup();
		}
	}

}
