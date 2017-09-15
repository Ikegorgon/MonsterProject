package monster.controller;

import monster.model.Monster;
import java.util.Scanner;

public class MonsterController {
	public MonsterController() {
		
	}
	
	public void start() {
		Monster monster = new Monster();
		Monster newMonster = new Monster("Juble", false, 4, 7, 1, 34);
		System.out.println(monster);
		System.out.println(newMonster);
		
		System.out.println("Create a Monster!");
		
		Scanner nameScanner = new Scanner(System.in);
		System.out.println("What is your monsters name? (String)");
		String name = nameScanner.nextLine();
		
		Scanner bellyScanner = new Scanner(System.in);
		System.out.println("True/False: Your monster has a belly button? (true or false)");
		boolean belly = bellyScanner.nextBoolean();
		
		Scanner legScanner = new Scanner(System.in);
		System.out.println("How many legs does your monster have? (Number)");
		double legs = legScanner.nextDouble();
		
		Scanner nosesScanner = new Scanner(System.in);
		System.out.println("How many noses does your monster have? (Number)");
		int noses = nosesScanner.nextInt();
		
		Scanner eyesScanner = new Scanner(System.in);
		System.out.println("How many eyes does your monster have? (Number)");
		int eyes = eyesScanner.nextInt();
		
		Scanner armsScanner = new Scanner(System.in);
		System.out.println("How many arms does your monster have? (Number)");
		int arms = armsScanner.nextInt();
		
		Monster myMonster = new Monster(name, belly, legs, noses, eyes, arms);
		
		System.out.println(myMonster);
		
	}
}
