package BrickBreaker;

import zen.core.Zen;

public class Paddle {
	int x;
	int y;

	public Paddle() {
		x = 250;
		y = 750;
	}

	public void draw() {
		Zen.setColor("red");
		Zen.fillRect(x - 50, y, 100, 10);
	}

	public void move() {
		if (Zen.isKeyPressed("right")) {
			x = x + 10;
		}
		if (Zen.isKeyPressed("left")) {
			x = x - 10;
		}
	}

	public boolean isTouching(Ball b) {
		if (Math.abs(b.x - x) < 55 && Math.abs(b.y - y) < 15) {

			b.dx = Zen.getRandomNumber(-8, 8);
			return true;
		}
		return false;
	}
}
