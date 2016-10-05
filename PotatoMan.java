package edu.cpp.cs.cs141.prog_assgmnt_1;

/**
 * This class represents an enemy called PotatoMan and contains the attributes
 * that affect the gameplay.
 * @author Francisco
 *
 */
public class PotatoMan {

	/**
	 * This field represents the amount of health the PotatoMan has. Once it reached '0' it is considered to be dead. 
	 * Initially {@code 100} , only decreases when PotatoMan is shot by Farmer.
	 */
	private int health;
	/**
	 * This field represents the location of the PotatoMan horizontally. It affects the {@link #speed}
	 */
	private float x;
	/**
	 * This field represents the location of the PotatoMan horizontally. It affects the {@link #speed}
	 */
	private float y;
	/**
	 * This field represents the speed of the PotatoMan. It will determine the rate of change and position.
	 */
	private float speed;
	/**
	 * This field declares world to pass on its variables to it.
	 */
	private World world;
	/**
	 * This field declared shotgun to pass on its variables to it.
	 */
	private Shotgun shotgun;
	
	/**
	 * The default contructor for the class {@link PotatoMan}. Will have {@link #world}, an initial {@link #x}, and an initial {@link #y}.
	 * 
	 */
	public PotatoMan(World, x, y) {
		
	}
	
	/**
	 * This method draws the PotatoMan using {@link #x},{@link #y}, and {@link #speed}.
	 */
	private void draw() {
		
	}
	
	/**
	 * This method uses {@link #shotgun} to attack the Farmer. (X match here or Shotgun?)
	 */
	private void attack() {
		
	}
	
	/**
	 * This method modifies the {@link #health} of the PotatoMan. It can only decrease and is called by Shotgun?
	 * @param damage
	 */
	private void takeDamage(int damage) {
		
	}
	
	/**
	 * This method checks if {@link #health} of PotatoMan <= 0. Returns true/false and is called by {@link #takeDamage(int)}
	 */
	private boolean isDead() {
		
	}

}
