
public abstract class Enemies implements EnemiesInt{

	/**
	 * This abstract class lays the foundation for the enemies in the game
	 */
	private double attack;//int to hold attack
	private int hp;//int to hold hp
	private String name;//string to hold name
	private int attackturn;//string to hold turns until attack

	public Enemies (String name, int hp, double attack, int attackturn) {
		/**
		 * this constructs the way enemies should be declared
		 */
		this.hp = hp;
		this.attack = attack;
		this.name = name;
		this.attackturn = attackturn;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void attack(MainCharacter other) {
		/**
		 * This method recieves the maincharacter and the enemy attacks the main character
		 */
		int x = (int)((this.getAttack()*(1+Math.random())));//int x holds the damage being dealt
		other.setHp(other.getHp()-x);//damage is dealt to main character
		
		System.out.println((this.getName()) + " dealt " + (x-other.getHp()) + " damage to " + (other.getName()) + "!\n"); }//result is outputted for user	
	
	public abstract void skill(MainCharacter other);//abstract method for skill which will be declared by subclasses
	
	public double getAttack() {
		return attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackturn() {
		return attackturn;
	}

	public void setAttackturn(int attackturn) {
		this.attackturn = attackturn;
	}
}
