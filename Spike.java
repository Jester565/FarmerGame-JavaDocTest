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
	 * @param offPlatX {@link #offPlatX} is set to this value to keep the x position
	 * @param spikeHeight {@link #spikeHeight} is set to this value to keep the height
	 * @param spikeWidth {@link #spikeWidth} is set to this value to keep the width
	 */
	public Spike(float offPlatX, int spikeHeight, int spikeWidth){
		
	}
	/**
	 * Draws the Spike at platformX {@code +} {@link #offPlatX} and platformY location along with its height, represented by
	 * {@link #spikeHeight}, and width, represented by {@link #spikeWidth}.
	 * @param platformX - Horizontal position for the spike to be drawn at
	 * @param platformY - Vertical position for the spike to the drawn at
	 */
	public void draw(float platformX, float platformY){
		
	}
	/**
	 * Checks if the {@link Farmer} is in range by comparing the spikes coordinates (which are calculated by adding {@link #offPlatX} to the platformX parameter, and the y coordinate is not needed because it is already assumed that the {@link Farmer} and {@link Platform} are colliding)
	 * to the {@link Farmer}'s position, found by using {@link Farmer#getX()} and {@link Farmer#getY()}.  If in range, call {@link #dealDamage(Farmer)} passing in the farmer as a parameter.  Otherwise do nothing.
	 * @param farmer the {@link Farmer} to compare coordinates to and to be damaged if in range.
	 * @param platformX the horizontal position of the platform so the coordinate of {@code this} {@link Spike} could be calculated.
	 */
	public void checkDamage(Farmer farmer, float platformX){
		
	}
	/**
	 * Reduces {@link Farmer#health} by {@link #DAMAGE}
	 * by calling {@link Farmer#takeDamage(int)}
	 * @param {@link Farmer} object which will have its {@link Farmer#health} reduced
	 */
	public void dealDamage(Farmer farmer){
		
	}
}
