package BrickBreaker;

import zen.core.Zen;

public class Ball {

	int x;
	int y;
	int dx;
	int dy;
	
	public Ball(){
		x = 250;
		y = 700;
		dx = Zen.getRandomNumber(-8, 8);
		dy = Zen.getRandomNumber(-10, -8);
	}
	public void draw() {
		Zen.setColor("black");
		Zen.fillOval(x-10, y-10, 20, 20);
	}

	public void move() {
		x = x + dx;
		y = y + dy;

		if (x > 490) {
			x = 490;
			dx = -dx;
		}

		if (x < 0) {
			x = 0;
			dx = -dx;
		}
		
		if (y < 0) {
			y = 0;
			dy = -dy;
		}
	}
}
