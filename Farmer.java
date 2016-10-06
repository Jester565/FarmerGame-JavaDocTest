/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #1
 *
 * Create a platformer without any code in the methods to practice working in a group, class design, and
 * utilizing the javadoc utility.
 *
 * Team #3 (Random Six):
 * Hao Zheng (Group Leader)
 * Alex Craig
 * Fransisco Rodriguez
 * Jessica Castron
 * Jason Kwok
 * James Taracevicz
 */

package edu.cpp.cs.cs141.prog_assgmnt_1;

/**
 * Represents the player.  Has a position and can move through user input.  The Farmer can also take damage and
 * will die if health runs out.  A Shotgun is also an attribute of the farmer.
 * @author ajcra
 *
 */
public class Farmer {
	/**
	 * Field that represents how fast that player can change the {@link #x} or the {@link #y} attribute in the {@link #move()} function.  Cannot be modified.
	 */
	private static final int SPEED;
	/**
	 * Field that represents the maximum and initial value for the {@link #health} attribute.  Cannot be modified.
	 */
	private static final int MAX_HEALTH;
	
	/**
	 * The width of the farmer character.  Used in drawing and collision checking operations.  Cannot be modified.
	 */
	private static final int FARMER_WIDTH;
	
	/**
	 * The height of the farmer character.  Used in drawing and collision checking operations.  Cannot be modified.
	 */
	private static final int FARMER_HEIGHT;
	/**
	 * Field that stores the health of the player.  Initialized to value of {@link #MAX_HEALTH}.  Used in the function {@link #isDead()}.  When the value is {@code <= 0} the farmer is considered dead.
	 */
	private int health;
	
	/**
	* Multiplied to {@link #SPEED} in the {@link #move()} method to determine how fast {@code this} {@link Farmer} moves.
	*/
	private float speedMultiplier;
	
	/**
	 * Field that stores the horizontal position of {@code this} {@link Farmer}.  Initialized by constructor and is set to the x parameter.  This variable is incremented or decremented by {@link #SPEED} multiplied by {@link #speedMultiplier} in the method {@link #move()}.
	 */
	private float x;
	
	/**
	 * Field that stores the vertical position of {@code this} {@link Farmer}.  Initialized by constructor and is set to the y parameter. This variable is incremented or decremented by {@link #SPEED} multiplied by {@link #speedMultiplier} in the method {@link #move()}.
	 */
	private float y;
	
	/**
	 * Field that stores the name of the {@code this} {@link Farmer}.  This text is displayed above the image in the {@link #draw()}.  The value will not change.  Initialized by the constructor to the parameter name.
	 */
	private String name;
	
	/**
	 * The {@link Farmer}'s primary weapon.  Initialized by the constructor and is only called by the {@link #checkShoot()} method.
	 */
	private Shotgun gun;
	
	/**
	 * Stores a reference the {@link World} that created the parameter.  Assigned by the constructor and will not be reassinged.  Provides access to terrain objects for collision checking.
	 */
	private World world;
	
	/**
	 * Creates a farmer and provides a reference to {@link World}, so environment and enemy information could be accessed.  The spawn position is also specified by
	 * the x and y parameters.  The name is also copied to the {@link #name} variable.
	 * @param world {@link #world} will store this parameter as a data member for future reference by the {@link #draw()} method.
	 * @param name {@link #name} is set to the value of this parameter so that the text can be displayed in the {@link #draw()} method.
	 * @param x {@link #x} is set to this value to keep the horizontal drawing position.
	 * @param y {@link #y} is set to this value to keep the vertical drawing position.
	 */
	public Farmer(World world, String name, float x, float y)
	{
		
	}
	
	/**
	 * Draws the image and {@link #name} value to the screen using the {@link #x} and {@link #y} coordinates which are adjusted to the world view
	 * by calling the {@link World#getWorldX()} and {@link World#getWorldY()} accessors from the {@link #world} data member.  Will also call {@link Shotgun#draw(float, float, float)}.
	 */
	public void draw()
	{
		
	}
	
	/**
	* Set the {@link #speedMultiplier} to the value speedMult.  So the movement speed can be increased or decreased.
	* @param speedMult value to set {@link #speedMultiplier} to.
	*/
	public void setSpeedMultiplier(float speedMult)
	{
		
	}
	
	/**
	 * Looks at user input to determine if {@link #x} or {@link #y} should have {@link #SPEED} added to them or not.
	 * When movement occurs {@link World#translate(float, float)} is called with the change in the player's position as parameters.
	 * This allows the World's camera to follow the player.  Calls {@link #dig()} if a certain user input is entered.
	 * Movement may be blocked if when iterating through the {@link Platform}s returned by {@link World#getPlatforms()}, {@link Platform#isColliding(float, float)} returns {@code true}.
	 * If a {@link Platform} is colliding with a player, {@link Platform#checkDamage(Farmer)} will be called passing {@link this} as a parameter.
	 */
	public void move()
	{
		
	}
	
	/**
	 * Looks at user input to determine if the {@link Shotgun#shoot(float, float, float)} method should be called on the {@link #gun} attribute.
	 * If the return of the shoot method is not {@code null}, it is added to the {@link World} using the {@link World#addBullet(Bullet)} method.
	 */
	public void checkShoot()
	{
		
	}
	
	/**
	 * When {@link #health} is {@code <= 0}, return {@code true}.
	 * @return If {@link Farmer} is dead due to running out of {@link #health}.
	 */
	public boolean isDead()
	{
		
	}
	
	/**
	 * Decrements the attribute {@link #health} by the damage parameter.
	 * @param damage Value to reduce {@link #health} by.
	 */
	public void takeDamage(int damage)
	{
		
	}
	
	/**
	 * Increments the attribute {@link #health} by the hp parameter.  Will not work if {@link Farmer} {@link #isDead()}.  {@link #health} cannot exceed {@link #MAX_HEALTH}.
	 * @param health, value to increase {@link #health} by.
	 */
	public void restoreHealth(int hp)
	{
		
	}
	
	/**
	 * Resets {@link #health} to {@link #MAX_HEALTH}.  The position of {@code this} {@link Farmer} is set to the last checkpoint by setting {@link #x} to checkPointX and {@link #y} to checkPointY.
	 * @param checkPointX Horizontal coordinate to set {@link #x} to.
	 * @param checkPointY Vertical coordinate to set {@link #y} to.
	 */
	public void revive(float checkPointX, float checkPointY)
	{
		
	}
	
	/**
	 * Accessor for the {@link #health} attribute.
	 * @return The value of {@link #health}. Which represents how close the {@link Farmer} is to death.
	 */
	public int getHealth()
	{
		return health;
	}
	
	/**
	* Accessor for the {@link #x} attribute.  Which represents the horizontal position of the Farmer.
	* @return The value of {@link #x}.  Representing the horizontal position of the Farmer.
	*/
	public float getX()
	{
		return x;
	}
	
	/**
	* Accessor for the {@link #y} attribute.  Which represents the vertical position of the Farmer.
	* @return The value of {@link #y}.  Representing the vertical position of the Farmer.
	*/
	public float getY()
	{
		return y;
	}
	
	/**
	 * Iterates through all of the {@link Platform}s from {@link World#getPlatforms()} and calls {@link Platform#checkDig(float)} on each one.
	 * If an {@link Item} is returned, it is added to the {@link HUD} using the method {@link HUD#addItem(Item)}.  The HUD object
	 * is acquired by using {@link World#getHUD()} accessor.
	 */
	private void dig()
	{
		
	}
}
