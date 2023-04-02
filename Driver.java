import java.util.*;

public class Driver {
	/**
	 * Author Taliesin Shepherd 
	 * This is a game which involves dungeon crawling and puzzle solving. The user can clear dungeons by solving puzzles.
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException  {

		String input = "";//user input for the starting menu

		System.out.println("Welcome to Dragons and Puzzles! "//welcomes user to the video game, asks user if they want the tutorial or if they want to start the game
				+ "\nThis is a dungeon based puzzle game, and parody of the best selling game by Gunho studios, Puzzle and Dragons. "
				+ "\nIf it is your first time playing this game, refer to the explanation bookmarks below. "
				+ "\nOtherwise press “s” to start your adventure!\n");
		
		System.out.println("\n1. The main objective (click 1)\n2. How to play (click 2)\n");//outputs options for the tutorial
		input = in.next();//user inputs their choice
		
		while (!(input.equals("s"))) {//if they chose the tutorial, they will be stuck in the tutorial reading menu until they choose to start the game
						
		if (input.equals("1")) {//shows chapter one of tutorial
			System.out.println("\nThe main objective of the game is to clear the dungeon. To do this you must defeat all the monsters in the dungeon. "
					+ "\nYou can select the dungeon which you want to challenge from the mainmenu. \n"
					+"Each dungeon varies in difficulty, and some dragons may be better equipped for some dungeons."
					+ "\nIf your health hits 0 then its gameover! Be sure to look out for your health!");}
		
		else if (input.equals("2")){//shows chapter two of tutorial
			System.out.println(		"\n1. To attack the enemies you need to connect three blocks with the same shapes together like candy crush, simple as that. "
							+ "\nOne three shaped connection is a combo, the more combos you make, the higher your attack will be."
							+ "\nYou will be shown a puzzle when you enter a dungeon, you can move a block up,down,right or left three times!"
							+ "\n(IMPORTANT) The blocks can only be deleted when you connect them by three, this is meant to make the combo making more challenging. "
						        + "\n2. You can also use your monster’s skills! All monsters have one skill and one leader skill. Make sure to read the monster’s skills before using them. "
						        + "\nAll dragons have the skill 'dragon breath' this will allow your dragon to attack the enemy with 20 times its base damage!"
							+ "\nYour dragon can also heal! Be careful however, as each time you heal the enemy's attack turn decreases by one!"
							+ "\nTry to play around your monster’s leader skill as activating it will make the game progress smoothly.");}
		
		
		Thread.sleep(1500);//pause before next output
		System.out.println("\n1. The main objective (click 1)\n2. How to play (click 2)" + "\n3. Start the Game (click 's')");//outputs options for user again
		input = in.next();//user inputs their choice


		}
		
		System.out.println("\nWelcome to Dragons and Puzzles\n");//if user selected to start the game they are welcomed

		while(true) {//while the user chooses to stay in the game, the game keeps running
			
			int selection;//variable to hold user's selection
			
			Thread.sleep(1500);//pause before next output

			System.out.println("Main Menu"); //outputs the main menu, options of dungeons for the user to choose from
			System.out.println("Select the Dungeon to play!\n"); 

			System.out.println("The Beginning Tower 	(Difficulty:Easy) (Click 1)"); 
			System.out.println("The Dusk Valley 	(Difficulty:Medium) (Click 2)"); 
			System.out.println("The Demon Lord's Castle (Difficulty:Hard) (Click 3)"); 
			System.out.println("\nExit Game (Click 4)\n");

			selection = in.nextInt();//user choice is stored
			
			if (selection == 1) {//the appropriate dungeon is then called from the user's choice
				TheBeginning();
			}
			else if (selection == 2) {//the appropriate dungeon is then called from the user's choice
				DuskValley();
			}
			
			else if (selection == 3) {//the appropriate dungeon is then called from the user's choice
				DemonCastle();
			}
			
			else if (selection == 4) {//if the user chooses to leave the user leaves the game
				break;
			}
			
			else {
				System.out.println("You must choose a valid option!");
			}
				
		}
		System.out.println("\nThanks for playing Dragons and Puzzles!");//says farewell to the user 
		}

public static void TheBeginning () throws InterruptedException {
	/**
	 * This method creates the enemies for the begginner dungeon, then calls on other methods to finish the dungeon
	 */
	Enemies one = new Goblin ();//creates new monsters for each level of the dungeon
	Enemies two = new Goblin ("Lesser Goblin", 100, 50.0, 2);
	Enemies three = new Serpent ("Slitherus", 100, 100.0, 10, 3);
	Enemies four = new Goblin ("Goblin Leader", 100, 100.0, 2);
	Enemies five = new Serpent ("Cobra King", 100, 250.0, 100, 3);

	Enemies[] Beginner = new Enemies[]  {one, two, three, four, five};//saves the monsters of the dungeon into a enemies array

	System.out.println("\nThe Beginning Tower");//welcomes user to the beggining dungeon
	Thread.sleep(1500);//pause before next output

	pickDrag(Beginner);//calls on method for user to pick their dragon
	
}

public static void DuskValley () throws InterruptedException {
	/**
	 * This method creates the enemies for the begginner dungeon, then calls on other methods to finish the dungeon
	 */
	Enemies one = new Goblin ("Stronger Bob", 850, 50.0, 1);//creates new monsters for each level of the dungeon
	Enemies two = new Goblin ("Goblin Captain", 1000, 150.0, 1);
	Enemies three = new Serpent ("Kao-Ma", 1800, 150.0, 10, 1);
	Enemies four = new Goblin ("Fire Troll", 1600, 250.0, 1);
	Enemies five = new SerpentKing ("Ishtar", 2000, 200.0, 100, 3, 2000);

	Enemies[] Dusk = new Enemies[]  {one, two, three, four, five};//saves the monsters of the dungeon into a enemies array

	System.out.println("\nThe Dusk Valley");//welcomes user to the beggining dungeon
	Thread.sleep(1500);//pause before next output

	pickDrag(Dusk);//calls on method for user to pick their dragon
	
}
public static void DemonCastle () throws InterruptedException {
	/**
	 * This method creates the enemies for the begginner dungeon, then calls on other methods to finish the dungeon
	 */
	Enemies one = new Goblin ("Powerful Bob", 1500, 250.0, 1);//creates new monsters for each level of the dungeon
	Enemies two = new Goblin ("Goblin General", 2000, 400.0, 2);
	Enemies three = new Serpent ("Mr.Vojnov", 2000, 9999, 9999, 5);
	Enemies four = new Goblin ("Demon King", 3000, 300.0, 2);
	Enemies five = new SerpentKing ("This RPG Assignemtn", 9999, 450.0, 450, 3, 9999);

	Enemies[] Demon = new Enemies[]  {one, two, three, four, five};//saves the monsters of the dungeon into a enemies array

	System.out.println("\nThe Demon Lord's Castle");//welcomes user to the beggining dungeon
	Thread.sleep(1500);//pause before next output

	pickDrag(Demon);//calls on method for user to pick their dragon
	
}

	public static void pickDrag (Enemies [] A) throws InterruptedException {
		/**
		 * This method asks for the user to pick the dragon they will like to use, creates that monster, then moves onto the main dungeon
		 */
		int choice = 0;//variable to store user's choice
		MainCharacter x;//the object which will hold the info of the chosen dragon
		
	while(true) {//while the user doesn't choose a dragon the code will continue to ask for a user to choose
		
	System.out.println("\nChoose your dragon: ");//asks for user input
	Thread.sleep(1500);//pause before next output

	System.out.println("\n Tyra: (Click 1 to choose)"//outputs the available dragons to choose, including their stats and skills
						+ "\n Leader Skill: Attack triples when you make 6 or more combos"
						+ "\n Skill: Deals 10x your base damage to enemy"
						+ "\n Stats: HP: 500 Damage: 120 Heal: 30\n");
	Thread.sleep(1500);//pause before next output

	System.out.println("\n Preshi: (Click 2 to choose)"
						+ "\n Leader Skill: Attack dealt is 2x stronger when your health is above 50%"
						+ "\n Skill: Heal 100HP"
						+ "\n Stats: HP: 800 Damage: 80 Heal: 150\n");
	Thread.sleep(1500);//pause before next output

	System.out.println("\n Brachi: (Click 3 to choose)"
						+ "\n Leader Skill: Each time you perform 3 combos or more, heal 50HP"
						+ "\n Skill: Heals 50% of missing health"
						+ "\n Stats: HP: 1000 Damage: 50 Heal: 200\n");

	choice = in.nextInt();//user choice is stored in variable
	
	if (choice == 1) {//the object of the dragon which the user chose is then created
		x = new Tyra("Tyra", 500, 120, 30, 500);
		break;//breaks out of the loop as the user made a choice
	}
	
	else if (choice == 2) {//same as above
		x = new Preshi("Preshi", 800, 80, 150, 800);
		break;
	}
	
	else if (choice == 3) {//same as above
		x = new Brachi("Brachi", 1000, 50, 200, 1000);
		break;
	}
	
	else {
		System.out.println("That is not a valid number!");}//if user inputs number which is not valid, it will inform the user and the user will stay in the loop
}
	Dungeon(A,x);//calls on the dungeon method to start the dungeon

}

public static void Dungeon(Enemies [] A, MainCharacter x) throws InterruptedException {
	/**
	 * This method runs the dungeon which the player is in, it will output the puzzle, allow the user to fight enemies and etc.
	 */
	int floornum = 1;
	int enemynum = 0;//variable to keep track of which floor the user is in
	int moves = 3; //variable to keep track of how many times the user can move the puzzle
	int attackturn = A[enemynum].getAttackturn();
	String input = "";//saves input of the user 
	boolean skillused = false, Dragonused  = false;//booleans to tell if the user used their dragon skill or dragon breath (they can only be used once)
	int multi = 1;//the number which the attack will be multiplied by (some dragons have their attacks multiplied if they fullfill certain conditions
	String [][] puzzle = new String [5][6];//a 2D array to store the puzzle
	Puzzle(puzzle);//calls on method puzzle to create a randomly generated puzzle
	System.out.println("\nWelcome to the dungeon...\n");//welcomes user to the dungeon
	Thread.sleep(1500);//pause before next output

	while (true){//while the user does not clear the puzzle, or dies, the user is kept in the game
		System.out.println("Floor " + floornum);//displays the stats and the puzzles for the user 
		System.out.println("The Enemy: " + A[enemynum].getName() + "     HP: " + A[enemynum].getHp() + "     Turns until attack " + attackturn);
		System.out.println("Your Puzzle: \n "); OutputPuzz(puzzle);
		System.out.println("\nYour HP: " + x.getHp() + "	Your Base Damage: " + x.getAttack() + "		Your heal: " + x.getHeal());
		System.out.println("What would you like to do?");//outputs the choices the user can choose
		System.out.print("Move puzzle (Click 1)" +	"	Heal (Click 2)");

	if (!(skillused)) //if the user has not used the skill, it shows an option for them to use it
		System.out.print("	Use Skill (Click 3)");
	if(!(Dragonused)) //if the user has not used dragon breath it gives them the option to do so
		System.out.print("	Dragon Breath (Click 4)");
	
	System.out.print("\n");

	input = in.next();//user input is saved
	
	if (input.equals("1")) {//if the user chose to attack

			Solve(moves, puzzle);//calls on method for suer to solve their puzzle
			int combonum = DeleteComb(puzzle);//deletes the 3 long strings on the puzzle
			System.out.println(combonum + " combos!");//outputs how many combos the user made

			if (x.leaderSkill(combonum) && x.getName().equals("Tyra")) {//if the user chose tyra and their leader skill activates
				multi = 3;//multi is set to three
				x.attack(A[enemynum], combonum, multi);//their attack is tripled
				multi = 1;}//multiplier set back to one
			
			else if (x.leaderSkill(combonum) && x.getName().equals("Preshi")) {//if the user chose preshi and their leader skill activates
				multi = 2;//their multiplier is set to two
				x.attack(A[enemynum], combonum, multi);//attacks enemy with 2x attack dmg
				multi = 1;//multiplier is set back to one
			}
			
			else if (x.leaderSkill(combonum) && x.getName().equals("Brachi")){//if the user chose brachi and their leader skill activates
				if(x.getHp()+50<=x.getFullHp()){//they heal 50HP if it does not go above their max health
					x.setHp(x.getHp()+50);//hp is set 50 more
					x.attack(A[enemynum], combonum, multi);}//attacks enemy
				
			else {
					x.setHp(x.getFullHp());//if the heal goes above their max capacity, then their max health is returned
					x.attack(A[enemynum], combonum, multi);//attacks enemy with 2x attack dmg
				}}
	
			
		else {
			x.attack(A[enemynum], combonum, multi);//if the leader skill did not activate, then the dragon simply attacks the enemy with a multiplier of one
			Thread.sleep(1500);//pause before next output

		}
			attackturn--;//the enemy's attack turn goes down after they attack
			FillPuzz(puzzle);//the erased combos are filled back in by calling on a method
		}
		
		else if (input.equals("2")){//if the user decides to heal
			x.heal();//calls on the heal method
			Thread.sleep(1500);//pause before next output
			attackturn--;//the enemy's attack turn goes down

		}
	
		else if (input.equals("3")) {//if the user decides to use a skill
			x.skill(A[enemynum]);//the skill method for the dragon is called
			Thread.sleep(1500);//pause before next output
			skillused = true; //skillused is now true so they can't reuse their skill
			attackturn--;//the enemy's attack turn goes down after they attack
		}
	
		else if (input.equals("4")){//if the user chooses to use dragon breath
			x.DragonBreath(A[enemynum]);//calls on dragon breath method
			Thread.sleep(1500);//pause before next output
			Dragonused = true;//changes dragonsued to true so user cannot re use it
			attackturn--;//the enemy's attack turn goes down after they attack
		}
	
	if(A[enemynum].getHp()<=0 && enemynum == A.length-1) {//if the enemy's HP is zero or goes below it, and that was the last enemy in the dungeon
			System.out.println("You defeated " + (A[enemynum].getName())+ "!");//tells user they defeated the boss
			System.out.println("Congratulations you've cleared the dungeon!");//congratulates user for clearing the dungeon
			Thread.sleep(1500);//pause before next output
			break;
			}//returns to main menu by breaking out of loop
			
	else if(A[enemynum].getHp() <= 0) {//if the enemy is defeated and is not the boss
			System.out.println("You defeated " + A[enemynum].getName() + "!\n");//congratulates user on defeating the enemy
			Thread.sleep(1500);//pause before next output
			enemynum++;//enemynum counter moves up to next enemy in the array
			attackturn = A[enemynum].getAttackturn();//the attack turn is set to the next enemy's attackturn
			floornum++;//the floornumber the user is in increases
	}
	
		if(attackturn == 0) {//if the enemy's attack turn hits zero
			double g = Math.random();//sets a random number to choose if the enemy uses a special attack
			if (A[enemynum] instanceof Serpent && g >=0.9) { //if it is a serpent it will use their venom attack 10% of the time
				 ((Serpent) A[enemynum]).VenomAttack(x);//calls on venom attack method
					attackturn = A[enemynum].getAttackturn();//the attack turn is set back to the enemy's attackturn
					Thread.sleep(1500);//pause before next output
			}
			else if (A[enemynum] instanceof SerpentKing && g >=0.9){//if the objext is a serpent king
				((SerpentKing) A[enemynum]).VenomAttack(x);//call on serpent king's venom attack
				attackturn = A[enemynum].getAttackturn();//the attack turn is set to the next enemy's attackturn
				Thread.sleep(1500);//pause before next output
			}
	
			else if(g>=0.7) {//if it is not a serpent or serpent king, 
				A[enemynum].skill(x);//call on its skill
				attackturn = A[enemynum].getAttackturn();//the attack turn is set to the next enemy's attackturn
				Thread.sleep(1500);//pause before next output
			}
			else {
				A[enemynum].attack(x);//otherwise attack normally
				attackturn = A[enemynum].getAttackturn();//the attack turn is set to the next enemy's attackturn
				Thread.sleep(1500);//pause before next output

			}
		
			if(x.getHp()<=0) {//if the maincharacter's hp goes below 0
				System.out.println("You have been defeated... ");//inform user he/she has lost
				Thread.sleep(1500);//pause before next output
				break;//break out of the dungeon loop
		}}
	}

	}

public static void Solve (int moves, String[][] puzzle) {
	/**
	 * This method will allow the user to pick which blocks to move in the puzzle
	 */
	int xpos; int ypos;//positions to hold the user's moves
	int dir = 0;//variable to hold which directino the user moves the block
	while (true) {
	System.out.println("\nHere is what your puzzle looks like currently: 		Moves Left: " + moves+ "\n"); OutputPuzz(puzzle);//informs user of the puzzle and their moves left
	
	while (true) {//while the input is not valid
		System.out.println("\nEnter the x position of the block you will like to move (bottom left is 1,5 (input will be 1) top right is 6,1 (input will be 6))\n");//asks user for the xposition of the block it would like to move
		xpos = (in.nextInt()-1);//saves input (added -1) as the code tells the user the left most position is position one to avoid confusion
		
		if(!(xpos <= 5) && xpos>=0) {//if the xpos is not between 0 and 5
			System.out.println(xpos + " is not a valid input! (Choose a numberbetween 1 and 6)");//inform user their input is not valid
		}
		
		else break;//if input is valid break out of loop
	}
	
	while (true) {//same as xpos loop but for the yvalue
	System.out.println("\nEnter the y position of the block you will like to move. (bottom left is 1,5 (input will be 5) top right is 6,1 (input will be 1))\n");
	ypos = (in.nextInt()-1);//same as xvalue loop but now for the y valu
	
	if(!(ypos <= 5) && ypos>=0) {//same as xpos loop
		System.out.println(ypos + " is not a valid input! (Choose a numberbetween 1 and 5)");
	}
	else 
		break;//same as above
	}
	
	while (true) {
	System.out.println("Which direction would you like to move the block?\n"//asks user for the direction in which it will like to move the block
			+ "UP 	(Click 1)\n"
			+ "RIGHT 	(Clikc 2)\n"
			+ "DOWN 	(Click 3)\n"
			+ "LEFT 	(Click 4)\n");
		dir = in.nextInt();//user input is saved in dir
		
	if(!(dir <= 4) && dir >= 1) {//if the user input is not valid
		System.out.println(dir + " is not a valid input!");//informs user input is not valid
	}
	else if(ypos == 0 && dir ==1) {//if user tries to move block in upper row up, it informs them that is not possible
		System.out.println("You cannot move a block in the upper row up!");
	}
	else if(ypos == 4 && dir ==3) {//if user tries to move block in lowest row down, it informs them that is not possible
		System.out.println("You cannot move a block in the bottom row down!");
	}
	else if(xpos == 0 && dir ==4) {//if user tries to move block in rightmost column left, it informs them that is not possible
		System.out.println("You cannot move a block in the left-most column row left!");
	}
	else if(xpos == 5 && dir ==2) {//if user tries to move block in leftmost column right, it informs them that is not possible
		System.out.println("You cannot move a block in the right-most column row right!");
	}
	else {//if the input is valid
		PosChange(puzzle, xpos, ypos, dir);//changes teh position of the block by calling on PosChange method
		moves--;//moves goes down by one
		break;//breaks out of while loop
	}
	}
	if (moves == 0) {//if the user used up all moves, 
		break;//breaks out of while loop, and method ends
	}
	}
}

public static void PosChange (String [][] puzzle, int xpos, int ypos, int dir ){
	/**
	 * This method will recieve the puzzle array and the coordinates of the block which the user will like to move, and the direction
	 * it will be moved in, then will make those changes on the puzzle
	 */
	String temp = puzzle[ypos][xpos];//the value of the block it will be switched with is saved
	
	if(dir == 1) {//if user wants to move a block up
		puzzle [ypos][xpos] = puzzle[ypos-1][xpos];//original position is flipped with upper block
		puzzle[ypos-1][xpos] = temp;//upper block becomes original block the user selected
	}
	else if (dir == 2) {//same as above but for moving right
		puzzle [ypos][xpos] = puzzle[ypos][xpos+1];
		puzzle[ypos][xpos+1] = temp;
	}
	else if (dir == 3) {//same as above but for moving down
		puzzle [ypos][xpos] = puzzle[ypos+1][xpos];
		puzzle[ypos+1][xpos] = temp;
	}
	else if (dir == 4) {//same as above but for moving left
		puzzle [ypos][xpos] = puzzle[ypos][xpos-1];
		puzzle[ypos][xpos-1] = temp;
	}
	
}

public static int DeleteComb(String [] [] puzzle) {
	/**
	 * This method will recieve the puzzle which the user altered, look for combos in the puzzle, then delete them while returning the total amount of combos
	 */
	int combonum = 0, thread = 0;//combonum keeps track of # of combos, thread keep track of how many consecutive blocks there are
for (int i = 0; i <=4; i++) {//this loop loops through entire puzzle to lok for combos which are horizontally aligned
	thread=0;//thread is set to 0 on each new row
		for (int t = 0; t <= 4; t++) {//loop through the row, only up to 4 as the code below will check the block to its right, so code will fail if it reaches end of the row
			if (puzzle [i][t].equals(puzzle[i][t+1])) {//if the block on the right of the designated spot is the same block
				thread ++;//thread counter increases
				if (thread==2) {//if three identical blocks are placed next to eachother
					thread = 0;//thread is reverted back to zero
					for(int j = t+1; j>= t-1; j--) {//loops through those blocks and sets them to a dash
						puzzle [i][j] = "-";}
					combonum ++;//combonum count increases
					}}
			else {//if the block to the next is not the same, then thread is set to zero
				thread = 0;
			}
	
		}
}

for (int t = 0; t <=5; t++) {//same loop as above but now check for combos vertically
	thread=0;
	for (int i = 0; i <=3; i++) 
		if (puzzle [i][t].equals(puzzle[i+1][t])&&(!(puzzle [i][t].equals("-")))) {//this time must check that the combo will not count dashes, as those will not count as combos the user made
			thread ++;
			if (thread==2) {//same as above
				thread = 0;
				for(int j = i+1; j>= i-1; j--) {
					puzzle [j][t] = "-";
				}
				combonum ++;
			}}
		else {
			thread = 0;
		}
}
	return combonum;//returns the # of combos the user made

}

public static void Puzzle (String [] [] puzzle) {
	/**
	 * This method will recieve a string 2d array, and fill it with random blocks 
	 */
	
		for (int i = 0; i <=4; i++) {//the two loops will loop throught the array
			for (int t = 0; t <= 5; t++) {
				int x = (int) (Math.random()*(100-1)+1);//a random integer x is chosen, depending on the value of x, the block inputted changes
				
				if (x>=0 && 25>=x)//if x is 0 ~ 25, the block will be lower case x
					puzzle[i] [t]= ("x");

				else if (x>25 && 50>=x) //if 26~50, input will be a circle
					puzzle [i] [t] = ("○");
				
				else if (x> 50 && 75>=x) //if 50 ~ 75 input will be triangle
					puzzle [i] [t] = ("△");
				else //otherwise the input will be a square
					puzzle [i] [t] = ("■");
			}}
}

public static void OutputPuzz (String [][] puzzle) {
	/**
	 * This method will output the contents of the puzzle
	 */
		for (int i = 0; i < 5; i++) {//the two loops will loop through the 2d array and output its contents
			System.out.print("	");//have a space in front of each row to make the output look neat
			for (int t = 0; t < 6; t++) {
				System.out.print(puzzle [i] [t] + " ");//output the contents and a space after
			}
			System.out.print("\n ");//indent to next line if finished outputting a row
		}
}

public static void FillPuzz(String [][] puzzle) {
	/**
	 * This method will recieve a 2d array with missing spots then fill those spots in
	 */
	for (int i = 0; i <= 4; i++) {//the two loops below will loop through the array
		for (int t = 0; t <= 5; t++) {
			if(puzzle [i] [t].equals("-")) {//if the position in that array is not a block
				int x = (int) (Math.random()*(100-1)+1);//creates a random integer
				
				if (x>=0 && 25>=x)//if the random integer is 0~25
					puzzle[i] [t]= ("x");//input will be an x

				else if (x>25 && 50>=x) //if 26~50 
					puzzle [i] [t] = ("○");//input will be a circle
				
				else if (x> 50 && 75>=x) //if 51 ~ 75
					puzzle [i] [t] = ("△");//input will be triangle
				else //otherwise
					puzzle [i] [t] = ("■");//input is a square
			}}
	}
	
}

}

