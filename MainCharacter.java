
public abstract class MainCharacter implements MainInt{
	/**
	 * This is the abstract class main chracter, which holds the constructor for the main characters the user uses and most of its methods
	 */

	private double attack;//variable to hold attack
	private int hp;//holds hp
	private String name;//holds name
	private int heal;//holds heal
	private int fullhp;//holds full hp value for calculating purposes
	
	public MainCharacter (String name, int hp, double attack, int heal, int fullhp) {
		this.hp = hp;
		this.attack = attack;
		this.name = name;
		this.heal = heal;
		this.fullhp = fullhp;
	}
	

	
	public void attack(Enemies other, int combonum, int multi) {
		/**
		 * this method recieves the enemy the main character is fighting then attacks it
		 */
		int x = (int)(this.getAttack()*combonum*multi);//int x holds the damage which will be dealt to the enemy
		other.setHp(other.getHp()-x);//damage is dealt to the enemy
		System.out.println((this.getName()) + " dealt " + (x) + " damage to " + (other.getName()) + "!\n");//outputs damage to the user
	}
	
	public abstract void skill(Enemies x);
	/**
	 * This is an abstract method used by the dragons to define their skills as it is different for each dragon
	 */
	
	
	public void heal() {
		/**
		 * This method allows the dragon to heal and regain its hp
		 */
		if(this.getHp()==this.getFullHp()) {//if the dragon is already at full hp
			System.out.println("You are at max health!\n");}//informs user you cannot heal at full hp
		else if (this.getHp()+this.getHeal()>this.getFullHp()) {//if healing makes hp go over max hp
			this.setHp(this.getFullHp());//sets hp at max hp
			System.out.println("Your HP is now " +this.getHp()+ "!\n");//outputs hp for user
		}
		else {//otherwise
			this.setHp(this.getHp()+this.getHeal());//heals the heal amount 
			System.out.println("Your HP is now " +this.getHp()+ "!\n");//outputs results to user
		}
	}

	public void DragonBreath(Enemies other) {
		/**
		 * This method holds the commands for when the user cals the dragon breath method
		 */
		int x = (int)this.getAttack()*20;//damage being dealt is saved to int x
		System.out.println((this.getName()) + " uses Dragon Breath!\n");//outputs to user
		other.setHp(other.getHp()-x);//x damage is dealt to the enemy
		System.out.println((this.getName()) + " dealt " + x + "damage to " + (other.getName()) + "!\n");//outputs result of attack to user

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public double getAttack() {
		return attack;
	}
	public int getFullHp() {
		return fullhp;
	}

	public void setFullHp(int fullhp) {
		this.fullhp = fullhp;
	}
}
