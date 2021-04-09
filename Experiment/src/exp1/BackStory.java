package exp1;

import java.util.Scanner;

public class BackStory {
	public static void Intro(Person p) throws InterruptedException{
		GameFunctions.printMe("You find yourself in a forest dark...\n"
				+ "Midway upon the journey of life...\n" +
				"And you realize, you must fight to survive!\n", 10);
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name? ");
		p.setName(scanner.nextLine());
		System.out.print("\nWelcome: " + p.getName() + "\n");
		System.out.println("Power Level: " + p.getStrength());
		System.out.println("Health: [ " + p.getHealth()+ " ]");
	}
	
	public static void Intro(Enemy p){
//		Scanner scanner = new Scanner(System.in);
//		System.out.print( p.getName() + "\n");
		System.out.println("Power Level: " + p.getStrength());
		System.out.println("Health: [ " + p.getHealth() + " ]");
	}
	
	public static void update(Person p){
//		Scanner scanner = new Scanner(System.in);
//		System.out.print( p.getName() + "\n");
		System.out.println("Power Level: " + p.getStrength());
		System.out.println("Health: [ " + p.getHealth()+ " ]");
	}
	


	public static void Encounter(Person p, Enemy e) {
		System.out.println("\nA wild " + e.getName() + " has appeared!");
		BackStory.Intro(e);
	}
}
