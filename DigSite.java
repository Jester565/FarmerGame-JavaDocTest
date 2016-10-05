package game;

/**
 * This class holds information about the "DigSite" such as where it exists in the world, what item it holds, and whether or not its been dug up.
 * 
 *
 */
public class DigSite {
	/**
	 * This field represents the item that the DigSite holds upon creation. Initially {@code null}, this field will be changed upon creation of the DigSite. 
	 * After its first reassignment, the field will not be reassigned.
	 */
	private Item item;
	/**
	 * This field represents the horizontal position of the DigSite. Initially {@code 0}, this field will be changed upon creation of the DigSite. 
	 * After its first reassignment, the field will not be reassigned.
	 */
	private float OffPlatX;
	/**
	 * This field represents the vertical position of the DigSite. Initially {@code 0}, this field will be changed upon creation of the DigSite. 
	 * After its first reassignment, the field will not be reassigned.
	 */
	private float OffPlatY;
	/**
	 * This field holds information on the state of the DigSite. Initially {@code false}, the boolean 
	 * is changed to {@code true} after a call to {@link #Dig()}
	 */
	private boolean dug;
	/**
	 * Default Constructor for the DigSite. Will have no {@link worldX}, 
	 * has {@link dug} {@code false}, and no {@link Item}.
	 */
	public DigSite(float OffPlatX, Item Item){
		
	}
	
	/**
	 * Checks if isDug() is false and if so will return an item to the player.
	 * @return {@link #Item}
	 */
	public Item Dig(){
		
	}
	
	/**
	 * This method returns {@link #dug} to see if the DigSite is still available to dig up.
	 * @return {@link #dug}
	 */
	public boolean isDug(){
		
	}
	
	/**
	 * Draws the DigSite at the platform x and y. 
	 */
	public void draw(float platformX, float platformY){
		
	}
}
