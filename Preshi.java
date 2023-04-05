
public class Preshi extends MainCharacter{
	/**
	 * This is the class Preshi, one of the three dragons you can use. This subclass extends the Maincharacter and holds the methods for leaderskill and his skill
	 * @param name
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param fullhp
	 */
	
	public Preshi(String name, int hp, double attack, int heal, int fullhp) {//Preshi's stats are the same as MainCharracter's stats
		super(name, hp, attack, heal, fullhp);
	}

	public boolean leaderSkill(int combonum) {
		/**
		 * This is a method returns whether Preshi's leaderskill activates or not depending on the combo amount
		 */
		if(combonum >= 3) {//if you made 3 or more combos, then leader skill activates
			return true;
		}
		else return false;//if not return false
	}

	public void skill(Enemies x) {
		/**
		 * This method hold's preshi's skill, healing 100HP, it will set his hp 100 higher
		 * 
		 */
		System.out.println("\nPreshi uses his skill!");//informs user their character is using their skill
		if(this.getHp()==this.getFullHp()) {//if preshi is already at full HP, then the heal will not happen
			System.out.println("You are at max health!\n");}//tells user you cannot heal when full hp
		
		else if (this.getHp()+100>this.getFullHp()) {//if healing 100hp goes above Preshi's max health, then the hp weill be set tp full hp
			this.setHp(this.getFullHp());
			System.out.println("Your HP is now " +this.getHp()+ "!\n");}//informs user of what their current HP is
		
		else {
			this.setHp(this.getHp()+100);//if not a special circumstance simply heal 100hp
			System.out.println("Your HP is now " +this.getHp()+ "!\n");//informs user on HP
		}		
	}
	
}
