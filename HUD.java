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
 * This class represents a HUD and the attributes/behaviors normally 
 * associated with a HUD. A HUD is the class which hold game items.
 * Players can add items, and use items in HUD.
 * @author haozheng
 *
 */

public class HUD {
	
	/**
	 * This field represents the 10 {@link Item}s HUD can hold.
	 */
	private Item[] items;
	
	/**
	 * This filed represents the player, which is represented as a {@link Farmer} the HUD belongs.
	 */
	private Farmer farmer;
	
	/**
	 * 	This method add a {@link Item} to {@link #items}
	 * @param item The item which will be added
	 */
	public void addItem(Item item) {
		
	}
	
	/**
	 * 	This method uses an {@link Item} from the {@link #items} with the same id.  If the element was used, it will be removed from the {@link #items} array.
	 * @param id The id of the {@link Item} from the {@link #items} list to be used.
	 * @param count	The numbers of the {@link Item}s HUD want to use.
	 */
	public void useItem(int id, int count) {
		
	}
	
	/**
	 * 	This method show the items and show {@link Farmer}'s health.  It will also call {@link #useItem(int, int)} when 
	 * certain input is entered by the player.
	 */
	public void draw() {
		
	}
}
