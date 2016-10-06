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
 * Class that is used to store the item ID and a description of the item. It will also be 
 * able to use the item.
 * @author Jessica Castron
 *
 */
public class Item {
	
	/**
	 * This is a special number assigned to each type of {@link Item} to identify it. Each {@link Item} type has a different
	 * number associated with it.  This value is set from the constructor and will not changed afterwards.
	 */
	private int id;
	
	/**
	 * The description is an explanation of what the {@link Item} does; whether it can heal the {@link Farmer}
	 * or speed it up.
	 */
	private String description;
	
	/**
	 * This field stores whether the item will restore health and if so how much.
	 */
	private int healthRestored;
	
	/**
	 * This field stores how much the item will speed the {@link Farmer} up and if so by how much.
	 */
	private float speedMultiplier;
	
	/**
	 * This field allows the item class to access {@link Farmer} class so that the
	 * items can effect the {@link Farmer}.
	 */
	private Farmer farmer;
		
	/**
	 * This is the default contructor for the class {@link Item}. It will contain {@link Farmer} as
	 * well as default conditions for the {@link #speedGained}, {@link #healthRestored} and {@link #ID}.
	 * @param farmer The farmer that the item effects will apply to.
	 * @param speedMultiplier How much the item will increase the speed of the player by.  Set to {@code 1} for no effect.
	 * @param healthRestored How much the item will increase the players health by.  Set to {@code 0} for no effect.
	 * @param id The id number of the Item.
	 */
	public Item( Farmer farmer, float speedMultiplier, int healthRestored, int id ){
		
	}
	
	/**
	 * This will call the {@link Item} into the {@link HUD} when an item is found.
	 * @param x X-coordinates of the item inside the HUD
	 * @param y Y-coordinates of the item inside the HUD
	 */
	public void draw( float x, float y ){
		
	}
	
	/**
	 * This will use the {@link Item}; changing the {@link Farmer}'s health or speed accordingly.
	 */
	public void use(){
		
	}
	
	/**
	 * Accessor for the {@link #id}.  Which tells what type of {@link Item} {@code this} is.
	 * @return The value of {@link #id} which specifies the item type.
	 */
	public int getID()
	{
		
	}

}
