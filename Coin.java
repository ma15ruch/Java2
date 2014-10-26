package FallingCoins;

import zen.core.Zen;

public class Coin {
	public boolean isBrick;
	
	int x, y, speed, value;

	public Coin() {
		x = Zen.getRandomNumber(20, 595);
		y = 5;
		speed = 5;
		value = 1;
		isBrick = false;
	}

	public void draw() {
		Zen.setColor("brown");
		Zen.fillOval(x, y, 10, 10);
	}

	public void move() {
		y += speed;
	}
}
