import zen.core.Zen;

public class Ball {
	int x;
	int y;
	int dx;
	int dy;
	int color;

	// actions
	public void create() {
		x = Zen.dice(400) + 50;
		y = Zen.dice(400) + 50;
		dx = Zen.getRandomNumber(-5, 15);
		dy = Zen.getRandomNumber(-5, 15);
		color = Zen.dice(10);
	}

	public void move() {
		x = x + dx;
		y = y + dy;

		if (x > 490 || x < 10) {
			dx = -dx;
		}

		if (y > 490 || y < 10) {
			dy = -dy;
		}
	}

	public void draw() {
		// draw stuff

		if (color == 1) {
			Zen.setColor("red");
		}

		if (color == 2) {
			Zen.setColor("orange");
		}

		if (color == 3) {
			Zen.setColor("yellow");
		}

		if (color == 4) {
			Zen.setColor("light green");
		}

		if (color == 5) {
			Zen.setColor("teal");
		}
		
		if (color == 6) {
			Zen.setColor("green");
		}
		if (color == 7) {
			Zen.setColor("light blue");
		}
		if (color == 8) {
			Zen.setColor("lime");
		}
		if (color == 9) {
			Zen.setColor("pink");
		}
		if (color == 10) {
			Zen.setColor("gray");
		}
		Zen.fillOval(x - 10, y - 10, 20, 20);
	}
}
