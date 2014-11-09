package CTF;

import zen.core.Zen;

public class Flag {
	
	int x;
	int y;
	String team;
	String owner;
	
	public Flag(String color){
		team = color;
		owner = Zen.read(team + "owner");
		
	}
	
	public void draw(){
		Zen.setColor(team);
		Zen.fillRect(x-15, y-15, 30, 30);
	}
	
	public void move(){
		x = Zen.readInt(team + "x");
		x = Zen.readInt(team + "y");
	}
}
