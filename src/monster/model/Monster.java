package monster.model;

public class Monster {
	private String name;
	private boolean belly;
	private double leg;
	private int noses;
	private int eyes;
	private int arm;
	
	public Monster() {
		this.name = "Wraith";
		this.belly = true;
		this.leg = 4;
		this.noses = 2;
		this.eyes = 18;
		this.arm = 8;
	}
	
	public Monster(String name,boolean belly,double leg,int noses,int eyes,int arm) {
		this.name = name;
		this.belly = belly;
		this.leg = leg;
		this.noses = noses;
		this.eyes = eyes;
		this.arm = arm;
	}
	
	public String getname() {
		return name;
	}
	public boolean belly() {
		return belly;
	}
	public double getleg() {
		return leg;
	}
	public int getnoses() {
		return noses;
	}
	public int geteyes() {
		return eyes;
	}
	public int getarm() {
		return arm;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setbelly(boolean belly) {
		this.belly = belly;
	}
	public void setleg(int leg) {
		this.leg = leg;
	}
	public void setnoses(int noses) {
		this.noses = noses;
	}
	public void seteyes(int eyes) {
		this.eyes = eyes;
	}
	public void setarm(int arm) {
		this.arm = arm;
	}
	
	public String toString() {
		String description;
		if (belly) {
			description = name + " is a monster with a belly button, " + leg + " legs, ";
			description += noses + " noses, " + eyes + " eyes, and " + arm+ " arms.";
		} else {
			description = name + " is a monster without a belly button, " + leg + " legs, ";
			description += noses + " noses, " + eyes + " eyes, and " + arm+ " arms.";
		}
		return description;
	}
}
