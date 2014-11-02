package Snake;

import zen.core.Zen;

public class Snake {

	int x = 250;
	int y = 250;
	int direction = 0;
	Snake next;
	int message;

	public void grow() {
		if (next == null) {
			next = new Snake();
			next.x = x;
			next.y = y;
			next.direction = direction;

			if (direction == 0) {
				next.x = next.x - 10;
			}
			if (direction == 1) {
				next.y = next.y - 10;
			}
			if (direction == 2) {
				next.x = next.x + 10;
			}
			if (direction == 3) {
				next.y = next.y + 10;
			}
		}
		else{
			next.grow();
		}

	}

	public void draw() {
		Zen.setColor("light green");
		Zen.fillRect(x, y, 10, 10);
		if (next != null) {
			next.draw();
		}
	}

	public void move() {
		if (direction == 0) {
			x = x + 10;
		}
		if (direction == 1) {
			y = y - 10;
		}
		if (direction == 2) {
			x = x - 10;
		}
		if (direction == 3) {
			y = y + 10;
		}

		if (message>0){
			direction = message - 1; 
			
		}

		if (next != null){
			next.move();
			next.message = message;
		}
	}
	public void check(){
		if (Zen.isKeyPressed("up") && direction != 3) {
			message = 2;
		}
		if (Zen.isKeyPressed("down") && direction != 1) {
			message = 4;
		} 
		if (Zen.isKeyPressed("left") && direction != 0) {
			message = 3;
		}
		if (Zen.isKeyPressed("right") && direction != 2) {
			message = 1;
		}
	}

	public boolean isEating(food f) {
		if(f.x==x && f.y ==y){
			return true;
		}
		return false;
	}



}
