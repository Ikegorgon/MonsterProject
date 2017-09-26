package monster.controller;

import monster.model.Monster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController {
	private MonsterDisplay popup;
	public MonsterController () {
		popup = new MonsterDisplay();
	}
	public void create() {
//		System.out.println("Create a Monster!");
		popup.displayText("Create A Monster!");
		
//		Scanner nameScanner = new Scanner(System.in);
//		System.out.println("What is your monsters name? (String)");
		String nameS = popup.getResponse("What is your monsters name? (String)");
//		String name = nameScanner.nextLine();
		String name = nameS;
		
//		Scanner bellyScanner = new Scanner(System.in);
//		System.out.println("True/False: Your monster has a belly button? (true or false)");
		boolean belly = false;
		String bellyS = popup.getResponse("True/False: Your monster has a belly button? (true or false)");
//		boolean belly = bellyScanner.nextBoolean();
		while (isValidBoolean(bellyS)) {
			belly = Boolean.parseBoolean(bellyS);
			break;
		}
		
//		Scanner legScanner = new Scanner(System.in);
//		System.out.println("How many legs does your monster have? (Number)");
		double legs = 0;
		String legsS = popup.getResponse("How many legs does your monster have? (Number)");
//		double legs = legScanner.nextDouble();
		while (isValidDouble(legsS)) {
			legs = Double.parseDouble(legsS);
			break;
		}
		
//		Scanner nosesScanner = new Scanner(System.in);
//		System.out.println("How many noses does your monster have? (Number)");
		int noses = 0;
		String nosesS = popup.getResponse("How many noses does your monster have? (Number)");
//		int noses = nosesScanner.nextInt();
		while (isValidInteger(nosesS)) {
			noses = Integer.parseInt(nosesS);
			break;
		}
		
//		Scanner eyesScanner = new Scanner(System.in);
//		System.out.println("How many eyes does your monster have? (Number)");
		int eyes = 0;
		String eyesS = popup.getResponse("How many eyes does your monster have? (Number)");
//		int eyes = eyesScanner.nextInt();
		while (isValidInteger(eyesS)) {
			eyes = Integer.parseInt(eyesS);
			break;
		}
		
//		Scanner armsScanner = new Scanner(System.in);
//		System.out.println("How many arms does your monster have? (Number)");
		int arms = 0;
		String armsS = popup.getResponse("How many arms does your monster have? (Number)");
//		int arms = armsScanner.nextInt();
		while (isValidInteger(armsS)) {
			arms = Integer.parseInt(armsS);
			break;
		}
		
		Monster myMonster = new Monster(name, belly, legs, noses, eyes, arms);
		
//		System.out.println(myMonster);
		popup.displayText(myMonster.toString());
//		nameScanner.close();
//		bellyScanner.close();
//		legScanner.close();
//		nosesScanner.close();
//		eyesScanner.close();
//		armsScanner.close();
	}
	public void start() {
//		Monster monster = new Monster();
//		Monster newMonster = new Monster("Juble", false, 4, 7, 1, 34);
//		popup.displayText(monster.toString());
//		System.out.println(monster);
//		System.out.println(newMonster);
//		System.out.println("Juble was attacked and lost a few arms.");
//		newMonster.setarm(newMonster.getarm() - 3);
//		System.out.println(newMonster);
//		popup.displayText("Ready to play?");
//		String answer = popup.getResponse("How's it going?");
//		System.out.println(answer);
		while (ask()) {
			create();
		}
	}
	public boolean ask () {
		boolean valid = false;
		String ans = popup.getResponse("Want to make a monster? (yes/no)");
		if (ans.toLowerCase().equals("yes") || ans.toLowerCase().equals("y")) {
			valid = true;
		} else if (ans.toLowerCase().equals("no") || ans.toLowerCase().equals("n")){
			valid = false;
		} else {
			ask();
		}
		return valid;
	}
	private boolean isValidInteger(String sample) {
		boolean valid = false;
		try {
			Integer.parseInt(sample);
			valid = true;
		} catch (NumberFormatException error) {
			popup.displayText("You need to enter a valid integer. " + sample + " is not a valid integer.");
		}
		return valid;
	}
	private boolean isValidDouble(String sampleDouble) {
		boolean valid = false;
		try {
			Double.parseDouble(sampleDouble);
			valid = true;
		} catch (NumberFormatException error) {
			popup.displayText("You need to enter a valid double. " + sampleDouble + " is not a valid double.");
		}
		return valid;
	}
	private boolean isValidBoolean(String sampleBoolean) {
		boolean valid = false;
		try {
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		} catch (NumberFormatException error) {
			popup.displayText("You need to enter a valid boolean(true/false) " + sampleBoolean + " is not a valid boolean.");
		}
		return valid;
	}
}
