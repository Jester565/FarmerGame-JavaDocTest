package edu.cpp.cs.cs141.prog_assgmnt_1;

/*
 * This class holds information about "Spike" objects. Information such as position, spike height and width, and how much damage will do to the player.
 */

public class Spike {
	/**
	 * This field represents the horizontal position of the Spike. Initially {@code 0}, 
	 * this field will be changed upon creation of the Spike. After its first reassignment, 
	 * the field will not be reassigned.
	 */
	private float OffPlatX;
	/**
	 * This field represents the vertical position of the Spike. Initially {@code 0}, 
	 * this field will be changed upon creation of the Spike. After its first reassignment, 
	 * the field will not be reassigned.
	 */
	private float OffPlatY;
	/**
	 * This field represents the height of the spike. Initially {@code 0}, this field will be changed upon creation of the Spike.
	 * After its first reassignment, the field will not be reassigned.
	 */
	private int SpikeHeight;
	/**
	 * This field represents the width of the spike. Initially {@code 0}, the field will be changed upon creation of the Spike.
	 * After its first reassignment, the field will not be reassigned.
	 */
	private int SpikeWidth;
	/**
	 * This field represents the damage the player will take upon contact with the spike. This field cannot be modified.
	 */
	private const DAMAGE;
	/**
	 * This is the constructor for the Spike. Will have {@link OffPlatX}. {@link SpikeHeight}, and {@link SpikeWidth}
	 */
	public Spike(float OffPlatX, int SpikeHeight, int SpikeWidth){
		
	}
	/**
	 * Draws the Spike at platformX and platformY location along with its height and width.
	 */
	public void draw(float platformX, float platformY){
		
	}
	/**
	 * This method calculates damage against the Farmer
	 * @param Farmer health value is reduced by {@link #Damage}
	 */
	public void checkDamage(Farmer float hp){
		
	}
}
