package exp1;

public class Weapon {
	private double strengthW; 
	private String name;
	
	public double getStrengthW() {
		return strengthW;
	}
	public void setStrengthW(double strengthW) {
		this.strengthW = strengthW;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Weapon() {
		this.strengthW = 1;
		this.name = "Wooden Katana";
	}
	public String getWeapon() {
		return name;
	}
	
	public Weapon(int num) {
		this.strengthW = num * .8;
		if(num == 3)
		this.setName(NameGen.randNameW3() + " Katana");
		else if(num == 2)
		this.setName(NameGen.randNameW2() + " Katana");
		else
		this.setName(NameGen.randNameW1() + " Katana");
	}
}
