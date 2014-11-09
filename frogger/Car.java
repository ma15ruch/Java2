import zen.core.Zen;

public class Car {
	int x;
	int speed;
	int lane;

	public boolean isKilling(Frog target) {
		int y = 190 + 50 * lane;

		if (Math.abs(target.x - (x + 60)) < 30 && Math.abs(target.y - y) < 30) {
			return true;
		} else {
			return false;
		}
	}

	// Actions
	public void setup() {
		x = Zen.getRandomNumber(-500, -100);
		speed = Zen.getRandomNumber(3, 5);
		lane = Zen.getRandomNumber(0, 5);
	}

	public void draw() {
		int y = 185 + 50 * lane;
		Zen.setColor("red");
		Zen.fillRect(x, y, 60, 30);
	}

	public void move() {
		x = x + speed;
		if (x > 800) {
			setup();
		}
	}
}
