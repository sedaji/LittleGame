package exp1;
import java.util.Random;

public class NameGen {
	static String[] names = {"Ronnie", "Bob", "Wanda", "Thanos", "Captain Marvel",
			"Stan Lee", "Iron Man", "Arabel", "Groot", "Black Panther", "Eric", "Sedaji", "Alex",
			"Hulk", "Kevin"};
	
	public static int nameLen = names.length;
	
	static String[] names1 = {"Wooden", "Broad", "Meek", "Frail", "Cracked"};
	public static int nameLen1 = names1.length;
	
	static String [] names2 = {"Steel", "Rigid", "Strong", "Hardened", "Iron"};
	public static int nameLen2 = names2.length;
	
	static String [] names3 = {"HellFire", "Death-Bringer", "Legendary", "Void", "Dark-Matter"};
	public static int nameLen3 = names3.length;
	
	public static String randName() {
		Random rand = new Random();
		int randInt = rand.nextInt(nameLen);
		return names[randInt];
		
	}
	
	public static String randNameW1() {
		Random rand = new Random();
		int randInt = rand.nextInt(nameLen1);
		return names1[randInt];
	}
	public static String randNameW2() {
		Random rand = new Random();
		int randInt = rand.nextInt(nameLen2);
		return names2[randInt];
	}
	public static String randNameW3() {
		Random rand = new Random();
		int randInt = rand.nextInt(nameLen3);
		return names3[randInt];
	}
	
	
}
