
public class Brachi extends MainCharacter{
	/**
	 * This is the class Brachi, one of the three dragons you can use. This subclass extends the Maincharacter and holds the methods for leaderskill and his skill
	 * @param name
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param fullhp
	 */

	public Brachi(String name, int hp, double attack, int heal, int fullhp) {//Preshi's stats are the same as MainCharracter's stats
		super(name, hp, attack, heal, fullhp);

	}
	
	public void skill(Enemies x) {
		/**
		 * This method holds commands for Preshi's skill, healing 50% of the missing health
		 */
		System.out.println("\nBrachi uses his skill!");//informs user their character is using their skill
		double y = (this.getFullHp()-this.getHp()) * 0.5;//double y holds the heal amount for preshi
		if(y == 0) {//if y == 0 it means user is already at full health
			System.out.println("You are already at full health!\n");//informs user you cannot heal at full health
		}
		
		else if(y < 1) {//if y<1 it means user is one hp down from full health
			System.out.println("You cannot heal half a hit point!\n");//tells user you cannot heal half a health
		}
		else//otherwise simply sets brachi's hp to recover 50% of its missing health
			this.setHp((int)(this.getHp()+y));
		
	}

	
	public boolean leaderSkill(int combonum) {
		/**
		 * This method returns whether Brachi's leaderskill activates or not depending on the combo amount
		 */
		if (combonum >= 3) {//if user performed 3 combos or more leaderskill activates, returns true
			return true;
		}
		else
			return false;//other wise returns false
			
	}

}
