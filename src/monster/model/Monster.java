package monster.model;

public class Monster {
	private String name;
	private double leg;
	private boolean belly;
	private int noses;
	private int eyes;
	private int arm;
	
	public Monster() {
		this.name = "Wraith";
		this.leg = 4;
		this.belly = true;
		this.noses = 2;
		this.eyes = 18;
		this.arm = 8;
	}
	
	public Monster(String name,double leg,boolean belly,int noses,int eyes,int arm) {
		this.name = name;
		this.leg = leg;
		this.belly = belly;
		this.noses = noses;
		this.eyes = eyes;
		this.arm = arm;
	}
	
	public String toString() {
		String description;
		if (belly) {
			description = name + " is a monster with " + leg + " legs, a belly button, ";
			description += noses + " noses, " + eyes + " eyes, and " + arm+ " arms.";
		} else {
			description = name + " is a monster with " + leg + " legs, no belly button, ";
			description += noses + " noses, " + eyes + " eyes, and " + arm+ " arms.";
		}
		return description;
	}
}
