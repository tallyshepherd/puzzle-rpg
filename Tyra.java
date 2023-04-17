
public class Tyra extends MainCharacter{
	/**
	 * This is the class Tyra, a fire class dragon one of the three dragons you can use. This subclass extends the Maincharacter and holds the methods for leaderskill and his skill
	 * @param name
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param fullhp
	 */
	
	public Tyra(String name, int hp, double attack, int heal, int fullhp) {//Tyra's stats are the same as MainCharracter's stats
		super(name, hp, attack, heal, fullhp);
	}

	public boolean leaderSkill(int combonum) {
		/**
		 * This method returns whether Brachi's leaderskill activates or not depending on the combo amount
		 */
		if(combonum >= 6) {//if user performed 6 combos or more leaderskill activates, returns true
			return true;
		}
		else return false;//other wise returns false
	}

	public void skill(Enemies x) {
		System.out.println("\nTyra uses his skill!");//informs user their character is using their skill
		int dmg = (int)(this.getAttack()*10);//int dmg is saved as tyra's 10x of his base dmg
		x.setHp(x.getHp()-dmg );//sets enemy's health lower by x amount
		System.out.println("Tyra dealt " + dmg +" damage to " + x.getName()+ "!\n" );//informs user of the damage

	}
	


}
