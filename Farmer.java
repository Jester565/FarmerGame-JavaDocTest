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
	 * Field that stores the horizontal position of the {@link Farmer}.  Initialized by constructor and is set to the x parameter.  This variable is incremented or decremented by {@link #SPEED} in the {@link #move()}.
	 */
	private float x;
	
	/**
	 * Field that stores the vertical position of the {@link Farmer}.  Initialized by constructor and is set to the y parameter. This variable is incremented or decremented by {@link #SPEED} in the {@link #move()}.
	 */
	private float y;
	
	/**
	 * Field that stores the name for the Farmer.  This text is displayed above the farmer image in the {@link #draw()}.  The value will not change.  Initialized by the constructor to the parameter name.
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
	 * 
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
	 * by calling the {@link World#getWorldX()} and {@link World#getWorldY()} accessors from the {@link #world} data member.  Will also call {@link Shotgun#draw}.
	 */
	public void draw()
	{
		
	}
	
	/**
	 * Looks at user input to determine if {@link #x} or {@link #y} should have {@link #SPEED} added to them or not.
	 * When movement occurs {@link World#translate(float, float)} is called with the change in the player's position as parameters.
	 * This allows the World's camera to follow the player.
	 */
	public void move()
	{
		
	}
	
	/**
	 * Looks at user input to determine if the {@link Shotgun::shoot(float, float, float)} method should be called on the {@link #gun} attribute.
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
	 * Resets {@link #health} to {@link #MAX_HEALTH}.  The position of the {@link Farmer} is set to the last checkpoint by setting {@link #x} to checkPointX and {@link #y} to checkPointY.
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
}
