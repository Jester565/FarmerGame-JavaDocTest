package edu.cpp.cs.cs141.prog_assgmnt_1;

/**
 * The {@link Item} class is used to store the item ID and a description of the item. It will also be 
 * able to use the item.
 * @author Jessica Castron
 *
 */
public class Item {
	
	/**
	 * This is a special number assigned to each item to identify it. Each item has a different
	 * number.
	 */
	private int id;
	
	/**
	 * The description is an explanation of what the item does; weather it can heal the {@link Farmer}
	 * or speed it up.
	 */
	private String description;
	
	/**
	 * This field stores weather the item will restore health and if so how much.
	 */
	private int healthRestored;
	
	/**
	 * This field stores weather the item will speed the {@link Farmer} up and if so by how much.
	 */
	private int speedGained;
	
	/**
	 * This field allows the item class to access {@link Farmer} class so that the
	 * so that the items can effect the {@link Farmer}.
	 */
	private Farmer farmerInItem;
		
	/**
	 * This allows the item to see the {@link Farmer}'s health and speed.
	 */
	public Item( Farmer Farmer ){
		
	}
	
	/**
	 * This will call the {@link Item} into the {@link HUD} when an item is found.
	 * @param x X-coordinates of the item inside the HUD
	 * @param y Y-coordinates of the item inside the HUD
	 */
	public void draw( float x, float y ){
		
	}
	
	/**
	 * This will use the items; changing the {@link Farmer}'s health or speed accordingly.
	 */
	public void use(){
		
	}

}