package exp1;

import java.util.Random;

public class Enemy extends Person{
	
	private Weapon weapon;
	
	public Enemy(int x) {
		Random rand = new Random();
		double randInt = rand.nextInt(x+4); // between 0 and 5 for (x=1)
		double randInt2 = rand.nextInt(6);
		
		double randIntH = rand.nextInt(40);
		double randFinal = x * 10 - (randInt + 1); // between 10 and 5 (1)
		
		this.setLvl(x);
		this.setStrength(((x-1) * 5) + (rand.nextInt(5) + 1));
		
		this.setHealth((5 * x) + (60 - (randIntH)));
		
		this.setGold((int) (9 * randInt+1));
		this.setExp (x * (rand.nextInt(5)) + 3);
		this.setName(NameGen.randName());
//		this.setExp(x * randInt * 4);
	}
	
	
}
