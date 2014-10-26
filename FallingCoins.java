package FallingCoins;

import java.util.ArrayList;

import zen.core.Zen;

public class FallingCoins {

	public static void main(String[] args) {
		Zen.create(600, 600);

		int score = 0;

		
		Player p = new Player();

		ArrayList<Coin> coinList = new ArrayList<Coin>();

		Coin c = new Coin();

		coinList.add(c);

		while (true) {
			if(gameOver) {
				Zen.setColor("black");
				Zen.drawText("GAME OVER", 200, 200);
				Zen.drawText("press space to play again", 200, 220);
			}
			
			if (Zen.isKeyPressed("space")){
				gameOver = false;
				Zen.sleep(100);
			}
			else {
			Zen.setBackground("light blue");
			Zen.setColor("green");
			Zen.fillRect(0, 500, 600, 100);

			p.draw();
			p.move();

			if (coinList.get(coinList.size() - 1).y > 40) {
				spawnCoin(coinList);
			}

			for (int i = 0; i < coinList.size(); i++) {
				coinList.get(i).draw();
				coinList.get(i).move();

				if(coinList.get(i).isBrick){
					if(p.collects(coinList.get(i))){
						gameOver = true;
					}
				}
				
				if (i > -1 && p.collects(coinList.get(i))) {
					score += coinList.get(i).value;

					coinList.remove(coinList.get(i));
				}

				if (coinList.get(i).y > 495) {
					coinList.remove(i);
					i--;
				}
			}

			String scoreboard = "Score : " + score;
			Zen.setColor("white");
			Zen.drawText(scoreboard, 10, 580);

			Zen.buffer(33);
			}
		}
	}

	private static void spawnCoin(ArrayList<Coin> coinList) {
		int random = Zen.getRandomNumber(1, 10);

		if (random < 9) {
			Coin c = new Coin();
			coinList.add(c);
		} else {
			Brick b = new Brick();
			coinList.add(b);
		}
	}
}
