package exp1;

import java.util.Random;
import java.util.Scanner;

public class GameFunctions {
	
	public static boolean fight = false;
	public static void askFight() {
		System.out.print("Do you wish to fight? (y/n): ");
		Scanner scanner = new Scanner(System.in);
		
		char answer = 'x';
		answer = scanner.next().charAt(0);
		if( Character.toLowerCase(answer) == 'y') fight = true;
		else fight = false;
		
				
	}
	
	public static void Battle(Person p, Enemy e) throws InterruptedException {
		double healthP = p.getHealth();
		double healthE = e.getHealth();
		
		int count = 1;
		while(healthP > 0 && healthE > 0) {
			Random rand = new Random();
			double randInt = rand.nextInt(9) + 1; 
			
			double strengthP = p.getStrength() * randInt * .1;
			double strengthE = e.getStrength() * randInt * .1;
			healthE -= strengthP;
			healthP -= strengthE;
			printMe("Round " + count + " \n"
					+ p.getName() + "'s health: " + (String.format("%.2f", healthP)) +
					"\n" + e.getName() + "'s health: " + (String.format("%.2f", healthE)), 3);
			count ++;
			Thread.sleep(200);
			
		}
		if(healthP < 0) {
			printMe("\n\nYou Lose!\nGAMEOVER!");
			Thread.sleep(200);
			System.exit(0);
		}
		else {
			printMe("\n\nYou Win!");
			printMe("Gold +" + e.getGold());
			p.setGold(p.getGold() + e.getGold());
			printMe("Exp +" + e.getExp());
			p.setExp(p.getExp() + e.getExp());
			printMe("Total Gold: " + p.getGold());
			printMe("Total EXP: " + p.getExp() + " / " + p.getExpBar() + "\n");
			Thread.sleep(200);
		}
	}
	
	
	public static void printMe(String x, int s) throws InterruptedException{
		System.out.println("\n");
		for(int i = 0; i < x.length(); i ++ ) {
			System.out.print(x.charAt(i));
			Thread.sleep(s);
		}
	}
	
	public static void printMe(String x) throws InterruptedException{
		System.out.println("\n");
		for(int i = 0; i < x.length(); i ++ ) {
			System.out.print(x.charAt(i));
			Thread.sleep(40);
		}
	}

}
