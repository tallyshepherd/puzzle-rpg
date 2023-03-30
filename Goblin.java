public class Goblin extends Enemies{
/**
 * This subclass defines what a goblin's skill is and its construction
 * @param name
 * @param hp
 * @param attack
 * @param attackturn
 */
	public Goblin (String name, int hp, double attack, int attackturn) {
		super(name, hp, attack, attackturn);//recieves values from parent enemy
	}
	
	public void skill(MainCharacter other) {
		/**
		 * this method allows the goblin to use his skill and attack the main character
		 */
		int skillattack = (int)this.getAttack() * 2;//damage being dealt is saved into skillattack
		other.setHp(other.getHp()-skillattack);//damag is dealt to main character
		System.out.println("\nGoblin uses Strong Attack! Hero - " + skillattack + " hp!\n" );//result is outputted to user
	}
	
	
}
