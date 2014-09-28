import zen.core.Zen;

public class Frog {
	int x;
	int y;
	boolean upKeyPressed = false;
	boolean downKeyPressed = false;
	
	public void setup() {
		x = 400;
		y = 500;
	}

	public void draw() {
		Zen.setColor("red");
		Zen.fillOval(x - 15, y - 15, 30, 30);
	}

	public void move() {
		if (Zen.isKeyPressed("right")) {
			x = x + 3;
		}

		if (Zen.isKeyPressed("left")) {
			x = x - 3;
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
	}

}
