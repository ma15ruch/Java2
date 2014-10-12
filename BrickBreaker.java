package BrickBreaker;

import java.util.ArrayList;

import zen.core.Zen;

public class BrickBreaker {

	public static void main(String[] args) {
		Zen.create(500, 800);

		Paddle p = new Paddle();
		Ball b = new Ball();
		ArrayList<Brick> bricks = new ArrayList<Brick>();

		int brickX = 50;
		while (brickX < 500) {
			Brick br = new Brick(brickX, 300);
			bricks.add(br);
			brickX = brickX + 50;
		}

		int tBrickX = 50;
		while (tBrickX < 500) {
			toughBrick tbr = new toughBrick(tBrickX, 100);
			bricks.add(tbr);
			tBrickX = tBrickX + 50;
		}

		int mBrickX = 50;
		while (mBrickX < 500) {
			movingBrick mbr = new movingBrick(mBrickX, 200);
			bricks.add(mbr);
			mBrickX = mBrickX + 100;
		}

		while (true) {
			drawBackground();

			p.draw();
			b.draw();
			p.move();
			b.move();

			// draw every brick

			for (int i = 0; i < bricks.size(); i++) {

				if (bricks.get(i).isTouching(b) && bricks.get(i).health <= 0) {
					bricks.remove(i);
					b.dy = -b.dy;

					i--;
				}
				else if (bricks.get(i).isTouching(b)){
					b.dy = -b.dy;
				}
				else {
					bricks.get(i).draw();
					bricks.get(i).move();
				}
			}

			if (p.isTouching(b)) {
				b.dy = -b.dy;
			}

			Zen.buffer(33);
		}

	}

	private static void drawBackground() {
		Zen.setBackground("white");
	}

}
