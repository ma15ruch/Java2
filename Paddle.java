package BrickBreaker;

import zen.core.Zen;

public class Paddle {
	int x;
	int y;
	
	public Paddle() {
		x = 250;
		y = 760;
	}

	public void draw() {
		Zen.setColor("red");
		Zen.fillRect(x - 50, y, 100, 20);
	}

	public void move() {
		if (Zen.isKeyPressed("right")) {
			x = x + 10;
		}
		if (Zen.isKeyPressed("left")) {
			x = x - 10;
		}
		
		if (x > 450) {
			x = 450;
		}
		if (x < 50) {
			x = 50;
		}
	}
}
