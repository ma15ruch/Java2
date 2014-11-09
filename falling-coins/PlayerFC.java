package FallingCoins;

import zen.core.Zen;

public class Player {
	int x, y, dy;
	boolean jumping;

	public Player() {
		x = 300;
		y = 480;
		dy = 0;
	}

	public void draw() {
		Zen.setColor("black");
		Zen.fillOval(x - 20, y - 20, 40, 40);

	}

	public void move() {
		if (Zen.isKeyPressed("left")) {
			x -= 15;
		}
		if (Zen.isKeyPressed("right")) {
			x += 15;
		}
		if (Zen.isKeyPressed("up") && jumping == false) {
			dy = -25;
			jumping = true;
		}

		if (y > 480) {
			y = 480;
			dy = 0;
			jumping = false;
		} else {
			y += dy;
			dy++;
		}
	}

	public boolean collects(Coin coin) {
		if (Math.abs(x - coin.x) < 25 && Math.abs(y - coin.y) < 25) {
			return true;
		}
		return false;
	}
}
