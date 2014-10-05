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
		dx = Zen.getRandomNumber(-5, 5);
		dy = Zen.getRandomNumber(-8, -5);
	}
	public void draw() {
		Zen.setColor("black");
		Zen.fillOval(x, y, 30, 30);
	}

	public void move() {
		x = x + dx;
		y = y + dy;

		if (x > 470) {
			x = 470;
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
	public boolean isTouching(Paddle p) {
		if (Math.abs(p.x - x) < 50 && Math.abs(p.y - y) < 30) {
			return true;
		}
		return false;
	}

}
