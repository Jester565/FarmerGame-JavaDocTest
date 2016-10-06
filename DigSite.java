/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
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
 * This class holds information about the "DigSite" such as where it exists in the world, what item it holds, and whether or not its been dug up.
 */
public class DigSite {
	/**
	 * This field represents the {@link Item} that the DigSite holds upon creation.
	 * After the constructor is called, the field will not be reassigned.
	 */
	private Item item;
	
	/**
	 * This field represents the horizontal position of the DigSite. Initially {@code 0}, this field will be changed upon creation of the DigSite. 
	 * After its first reassignment, the field will not be reassigned.
	 */
	private float offPlatX;

	/**
	 * This field holds information on the state of the DigSite. Initially {@code false}, the boolean 
	 * is changed to {@code true} after a call to {@link #Dig()}
	 */
	private boolean dug;
	
	/**
	 * Default Constructor for the DigSite. Will have no {@link #offPlatX}, 
	 * has {@link dug} {@code false}, and no {@link #Item}.
	 * @param offPlatX {@link #offPlatX} is set to this value to keep the horizontal drawing position. 
	 * @param Item {@link #item} is set to this value to store the item that the digsite holds
	 */
	public DigSite(float offPlatX, Item Item){
		
	}
	
	/**
	 * This method returns {@link #dug} to see if the DigSite is still available to dig up.
	 * @return {@link #dug}
	 */
	public boolean isDug(){
		
	}
	
	/**
	 * Draws the {@code this} {@link #DigSite(float, Item)} at the platform x and y location.
	 * @param platformX - Horiztonal location of where to draw the Digsite
	 * @param platformY - Vertical location of where to draw the Digsite
	 */
	public void draw(float platformX, float platformY){
		
	}
	
	/**
	* Checks if the x1 parameter is near {@link #offPlatX} {@code +} {@link #platformX} and {@link #dug} is {@code false}, if so, then the {@link #item} is returned and {@link #dug} is set to {@code true}. 
	* @param platfromX position of the platform so that x1 can be compared
	* @param x1 horizontal position to check if it is close to the {@link DigSite}
	* @return The {@link #item} field is returned it if x1 is close to the {@link DigSite} x position.  If not, then {@code null} is returned.
	*/
	public Item checkDig(float platformX, float x1)
	{
		
	}
}
