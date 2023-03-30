
public class Serpent extends Enemies  {
	/**
	 * This is a class which extends from enemy and declares its abstract methods as well as adds new ones
	 */
	private int venomstr;//variable to hold venom strength
	public Serpent (String name, int hp, double attack, int venomstr, int attackturn) {//defines how a serpent is constructed
		super(name, hp, attack, attackturn);//variables called from parent class
		this.venomstr = venomstr;//venom strength is also added
	}
	
	public void VenomAttack(MainCharacter other) {
/**
 * This method allows the serpent to execute a command unique to itself which is the venom attack
 */
			other.setHp(other.getHp()-venomstr);//attacks the hero with the venomstrength amouont
			System.out.println("\nSerpent uses Venom Attack! Hero -" + this.getVenomStr()+ "hp!\n");//outputs result for user

		}

	
	public void skill(MainCharacter other) {
		/**
		 * THis method delares what the serpent's skill is
		 */
		int skillattck = (int)((this.getAttack()*2)*(1+Math.random()));//saves attack damage to skillattck
		other.setHp(other.getHp()-skillattck);//damage is dealt to hero
		System.out.println("\nSerpent uses Wrap Attack! Hero -" + skillattck+ "hp!\n");//outputs result for user
	}
	
	public double getVenomStr() {
		return venomstr;
	}
	
	public void  setVenomStr(int rangedstr) {
		this.venomstr = rangedstr;
	}
	
}
