import zen.core.Zen;


public class Log {
	int x;
	int speed;
	int lane;
	
	public boolean isFrogOnLog(Frog target) {
		int y = 35 + 50 * lane;

		if (Math.abs(target.x - x) < 50 && Math.abs(x - target.x) < 0 && Math.abs(target.y - y) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setup(){
		x = Zen.getRandomNumber(-500, -100);
		speed = Zen.getRandomNumber(2, 4);
		lane = Zen.getRandomNumber(0, 2);
	}
	
	public void draw(){
		int y =  35 + 50 * lane;
		Zen.setColor("brown");
		Zen.fillRect(x, y, 50, 30);
	}
	
	public void move(){
		x = x + speed;
		if (x > 800) {
			setup();
		}
	}
}
