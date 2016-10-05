/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #N
 *
 * Assignment 1
 *
 * Team Random 6
 *   Hao Zheng
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
	 * This field represents the 10 items HUD can hold.
	 */
	private Item[] items;
	
	/**
	 * This filed represents which player(farmer) the HUD belongs.
	 */
	private Farmer farmer;
	
	/**
	 * 	This method add a item to Item[]
	 * @param item
	 * 				The item which will be added	  	 	
	 */
	public void addItem(Item item) {
		
	}
	
	/**
	 * 	This method use the item.
	 * @param id 
	 * 		The ID of the item HUD want to use.
	 * @param count	
	 * 		The numbers of the items HUD want to use.
	 */
	public void useItem(int id, int count) {
		
	}
	
	/**
	 * 	This method show the items and show farmer's health.
	 */
	public void draw() {
	}
}
