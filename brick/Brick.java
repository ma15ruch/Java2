package BrickBreaker;

import zen.core.Zen;

public class Brick {

	int x;
	int y;
	int health;
	
	public Brick() {
		x = 200;
		y = 200;
		health = 1;
	}

	public Brick(int newX, int newY) {
		x = newX;
		y = newY;
	}

	public void draw() {
		Zen.setColor("purple");
		Zen.fillRect(x - 20, y - 10, 40, 20);
	}

	public void move(){
		
	}
	
	public boolean isTouching(Ball b) {
		if (Math.abs(x - b.x) < 25 && Math.abs(y - b.y) < 16) {

			health--;
			b.dx = Zen.getRandomNumber(-8, 8);
			return true;
		}
		return false;
	}
}
