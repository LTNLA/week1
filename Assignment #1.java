package Assignment1;

public class Human {
	private String name;
	private String job;
	
	//Constructor #1
	public Human (String name, String job) {
		this.name = name;
		this.job = job;
	}

	//Constructor #2
	public Human() {
		this.name = "You should give a name.";
		this.job = "You should choose a job.";
	}

	//Method 1: return the name
	public String getName() {
		return name;
	}
	//Method 2: return the job	
	public String getJob() {
		return job;
	}	
	
	//Method...... void no return.
	public void attack () {
	System.out.println( "Fist Attack!" ) ;
	}

}


class Hunter extends Human {

	private String skill; 
	public final static int DEFAULT_BOW = 0x00 ;  //Don't know how to apply these int.
	public final static int FIRE_BOW = 0x01 ;
	public final static int ICE_BOW = 0x02 ;

		//Constructor #1
	public Hunter (String name, String job, int weapon, String skill) {
		super(name, job);
		this.weapon = weapon;
		this.skill = skill;
		;
	}
	//Constructor #2
	public Hunter () {
		this.weapon = DEFAULT_BOW;
		this.skill = "Arrow"; 		
	}

	public int getWeapon() {
		return weapon;
	}
	
	public void attack (String newSkill) {
		skill = newSkill;
		System.out.printf("%s attack! %n", skill) ;
	}
}