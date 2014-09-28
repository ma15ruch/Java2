import zen.core.Zen;

public class BouncingBalls {

	public static void main(String[] args) {
		Zen.create(500, 500);
		
		Ball[] list = new Ball[100];
		
		int index = 0;
		while (index < 100){
			list[index] = new Ball();
			list[index].create();
			index = index + 1;
		}
		
		//setup things in game
		
		while (true) {
		Zen.setBackground("white");
		
		index = 0;
		while (index< 100){
			list[index].move();
			list[index].draw();
			index = index +1;
		}
		
		Zen.buffer(30);
		}
	}
}
