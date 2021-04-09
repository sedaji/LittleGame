package exp1;

import java.util.Random;

public class Person {
	private String name;
	private double strength;
	private double health;
	private int lvl;
	private Weapon weapon;
	private boolean auto = false;
	private int gold;
	private double exp;
	private double expBar;
	
	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public double getExpBar() {
		return expBar;
	}

	public void setExpBar(double expBar) {
		this.expBar += expBar;
	}
	
	public double getHealth() {
		return health;
	}
	
	public void setHealth(double health) {
		this.health = health;
	}
	
	public int getGold() {
		return gold;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	public double getStrength() {
		return strength + weapon.getStrengthW();
	}
	
	public void setStrength(double strength) {
		this.strength = strength;
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public void increaseLvl() {
		this.lvl += 1;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setWeapon(int x) {
		this.weapon = new Weapon(x);
	}
	
	
	public Weapon getWeapon() {
		return this.weapon;
	}
	
	
	public Person() { // Default
		this.exp = 0;
		this.expBar = 10;
		this.weapon = new Weapon();
		this.health = 50.0;
		this.strength = 5;
		this.lvl = 1;
		this.gold = 10;
		this.setName(NameGen.randName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void levelUp() throws InterruptedException{		
		Random rand = new Random();
		this.setStrength(((this.getLvl() * 5) + (rand.nextInt(5) + 8)));
		GameFunctions.printMe("What's this...? " + this.getName() + " is leveling up!\n");
		this.health = health + 20;
		this.exp = 0;
		this.increaseLvl();
		this.setExpBar(10);
		Thread.sleep(300);
		BackStory.update(this);
	}
	
//	public void update() throws InterruptedException{
//		GameFunctions.printMe(p.get);
//	}
//	
}

//	public Person(String n) {
//		this.setName(n);
//		this.weapon = new Weapon();
//	}