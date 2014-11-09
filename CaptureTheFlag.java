package CTF;

import zen.core.Zen;

public class CpatureTheFlag {

	public static void main(String[] args) {
		Zen.connect("capture the flag");
		
		Zen.write("ruchix", 250);
		Zen.write("ruchiy", 250);
		Zen.write("ruchiteam", "red");
		
		Zen.create(1000, 500);
		Player me = new Player("ruchi");
		
		Game g = new Game();
		
		Team redTeam = new Team ("red");
		redTeam.addPlayer(me);
		redTeam.addPlayer(new Player("divya"));
		redTeam.addPlayer(new Player("alejandro"));
		redTeam.addPlayer(new Player("nathan"));
		redTeam.addPlayer(new Player("aakash"));
		redTeam.addPlayer(new Player("keshav"));
		g.addTeam(redTeam);
		
		Team blueTeam = new Team ("blue");
		blueTeam.addPlayer(new Player("nicolas"));
		blueTeam.addPlayer(new Player("anoop"));
		blueTeam.addPlayer(new Player("amogh"));
		blueTeam.addPlayer(new Player("rishi"));
		blueTeam.addPlayer(new Player("rohan"));
		g.addTeam(blueTeam);

		while(true){
			Zen.setBackground("green");
			Zen.setColor("white");
			Zen.drawLine(500, 0,500,500);
			
			if (Zen.isKeyPressed("left") && getX() > 0 ){
				Zen.write("ruchix", getX() - 10);
			}
			
			if (Zen.isKeyPressed("right") && getX() < 1000 ){
				Zen.write("ruchix", getX() + 10);
			}
			
			if (Zen.isKeyPressed("up") && getY() > 0 ){
				Zen.write("ruchiy", getY() - 10);
			}
			
			if (Zen.isKeyPressed("down") && getY() < 500 ){
				Zen.write("ruchiy", getY() + 10);
			}
			
			if (getX() > 500 && blueTeam.isTouching(me)){
				Zen.write("ruchix", 250);
				Zen.write("ruchiy", 250);
			}
			
			g.draw();
			g.move();
			Zen.buffer(33);
		}
	}

	private static int getY() {
		return Zen.readInt("ruchiy");
	}

	private static int getX() {
		return Zen.readInt("ruchix");
	}

}
