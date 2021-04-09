package exp1;

public class DriverMain {

	public static void main(String[] args) throws InterruptedException {
		Person Ronnie = new Person();
//		Ronnie.getWeapon();
		//System.out.println(Ronnie.getWeapon());
//		System.out.println(Ronnie.getName());
//		Ronnie.setName("Ronnie");
		
		BackStory.Intro(Ronnie);
		
//		Ronnie.levelUp();
//		System.out.println(Ronnie.getHealth());	
//		System.out.println(jon.getWeapon().getName());
//		System.out.println(jon.getHealth());
		while (Ronnie.getLvl() != 5){
	
			Enemy jon = new Enemy(Ronnie.getLvl());
			jon.setWeapon(Ronnie.getLvl());
			
			BackStory.Encounter(Ronnie,  jon);
			GameFunctions.askFight();
			if(GameFunctions.fight == true) {
				GameFunctions.Battle(Ronnie, jon);
			}
			if(Ronnie.getExp() >= Ronnie.getExpBar() ) {
				Ronnie.levelUp();
			}

		}
	}

}
