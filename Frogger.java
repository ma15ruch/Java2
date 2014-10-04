import java.util.ArrayList;

import zen.core.Zen;

public class Frogger {

	public static void main(String[] args) {
		Zen.create(800, 500);

		Frog f = new Frog();
		f.setup();

		ArrayList<Truck> list = new ArrayList<Truck>();
		ArrayList<Car> list2 = new ArrayList<Car>();
		ArrayList<Log> list3 = new ArrayList<Log>();

		int count = 0;
		while (count < 20) {
			Truck t = new Truck();
			t.setup();
			list.add(t);

			count = count + 1;
		}

		int count2 = 0;
		while (count2 < 25) {
			Car c = new Car();
			c.setup();
			list2.add(c);

			count2 = count2 + 1;
		}

		int count3 = 0;
		while (count3 < 25) {
			Log l = new Log();
			l.setup();
			list3.add(l);

			count3 = count3 + 1;
		}
		
		while (true) {
			// draw stuff
			drawStuff();
			f.draw();
			f.move();

			for (Truck t : list) {
				t.draw();
				t.move();
				if ((t.isKilling(f))) {
					f.setup();
					/*for (Truck t1 : list) {
						t1.setup();
					}
					for (Car c1 : list2) {
						c1.setup();
					}*/
				}
			}

			for (Car c : list2) {
				c.draw();
				c.move();
				if ((c.isKilling(f))) {
					f.setup();
					/*for (Car c1 : list2) {
						c1.setup();
					}
					for (Truck t1 : list) {
						t1.setup();
					}*/
				}
			}
			
			for (Log l : list3) {
				l.draw();
				l.move();
				//while ((l.isFrogOnLog(f))) {
					// f has to move with log
					//f.x = f.x + l.speed;
				//}
				//if ((!l.isFrogOnLog(f))) {
					// f has to move with log
					//f.setup();
				//}
			}

			Zen.buffer(33);
		}
	}

	/*
	 * private static void drawFrog() {
	 * 
	 * }
	 */

	private static void drawStuff() {
		Zen.setBackground("gray");
		Zen.setColor("green");
		Zen.fillRect(0, 0, 800, 25);
		Zen.fillRect(0, 475, 800, 25);
		Zen.setColor("turquoise");
		Zen.fillRect(0, 25, 800, 150);

		Zen.setColor("yellow");
		int x;
		int y;

		y = 225;

		while (y < 450) {
			x = 10;
			while (x < 800) {
				Zen.fillRect(x, y, 10, 3);
				x = x + 20;
			}
			y = y + 50;
		}
	}
}
