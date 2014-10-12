package BrickBreaker;

import zen.core.Zen;

public class toughBrick extends Brick{
	
	public toughBrick(int newX, int newY) {
		x = newX;
		y = newY;
		health = 2;
	}
	
	public void draw(){
		Zen.setColor("light blue");
		Zen.fillRect(x - 20,  y - 10, 40, 20);
	}
}
