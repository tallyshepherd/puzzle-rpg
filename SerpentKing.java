
public class SerpentKing extends Serpent {
	//this method declares what a serpent king is which is a child of the class seprent
	private int venomstr;//int to hold venom strength
	private int maxHP;//int to hold max hp, needed when healing
	public SerpentKing(String name, int hp, double attack, int venomstr, int attackturn, int maxHP) {
		super(name, hp, attack, venomstr, attackturn);//variables are called from parent
		this.venomstr = venomstr;//other private variables are saved
		this.maxHP = maxHP;
	}
	
	
	public void VenomAttack(MainCharacter other) {
		/**
		 * This method allows the serpent to execute venom attack which attacks the main character and heals itself
		 */
		super.VenomAttack(other);//venom attack is same as parent
		if (this.getHp()+venomstr<=this.getMaxHp()) {//if the venomstrength allows the serpent king to heal tbelow its maxhealth
			this.setHp(this.getHp()+venomstr);//enemy heals venom attack worth
			System.out.println( this.getName() + " uses Venom Attack! Hero -" + this.getVenomStr()+ "hp!");//outputs attack result
			System.out.println( this.getName() + " heals from the Venom Attack!" + this.getName() + " + " + this.getVenomStr()+ "hp!");//outputs heal result

		}
		
		else if(this.getHp()+venomstr>=maxHP)//if the heal goes above max health
			this.setHp(this.getMaxHp());//venom recovers to full health
		System.out.println( this.getName() + "uses Venom Attack! Hero -" + this.getVenomStr()+ "hp!");//outputs attack result
		System.out.println( this.getName() + "heals from the Venom Attack!" + this.getName() + " + " + this.getVenomStr()+ "hp!");//outputs heal result


	}
	
	public int getMaxHp() {
		return maxHP;
	}

	public void setHp(int maxHP) {
		this.maxHP = maxHP;
	}
	
}
