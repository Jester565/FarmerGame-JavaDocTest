package edu.cpp.cs.cs141.prog_assgmnt_1;

/*
 * This class holds information about "Spike" objects. Information such as position, spike height and width, and how much damage will do to the player.
 */

public class Spike {
	/**
	 * This field represents the damage the player will take upon contact with the spike. This field cannot be modified.
	 */
	private static final int DAMAGE;
	/**
	 * This field represents the horizontal position of the Spike. Initially {@code 0}, 
	 * this field will be changed upon creation of the Spike. After its first reassignment, 
	 * the field will not be reassigned.
	 */
	private float offPlatX;
	/**
	 * This field represents the height of the spike. Initially {@code 0}, this field will be changed upon creation of the Spike.
	 * After its first reassignment, the field will not be reassigned.
	 */
	private int spikeHeight;
	/**
	 * This field represents the width of the spike. Initially {@code 0}, the field will be changed upon creation of the Spike.
	 * After its first reassignment, the field will not be reassigned.
	 */
	private int spikeWidth;
	/**
	 * This is the constructor for the Spike. Will have {@link offPlatX}. {@link spikeHeight}, and {@link spikeWidth}
	 */
	public Spike(float offPlatX, int spikeHeight, int spikeWidth){
		
	}
	/**
	 * Draws the Spike at platformX {@code +} {@link #offPlatX} and platformY location along with its height, represented by
	 {@link #spikeHeight}, and width, represented by {@link #spikeWidth}.
	 */
	public void draw(float platformX, float platformY){
		
	}
	/**
	 * This method calculates damage against the {@link Farmer}
	 * @param farmer calls {@link Farmer#takeDamage(int) with {@link #Damage} as the damage parameter.
	 */
	public void checkDamage(Farmer farmer){
		
	}
}
