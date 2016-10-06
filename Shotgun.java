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

import java.util.ArrayList;

/**
 * Shotgun class represents a shotgun in the game which fires an infinite amount of bullets but shots are delayed
 * using a timer
 * 
 * @author James Taracevicz
 * 
 */
public class Shotgun {
	
	/**
	 * This field represents the minimum value of {@link #shotTimer} before {@link #shoot()} can create another 
	 * bullet.  This variable cannot be reassigned.
	 */
	private static final int RATE_OF_FIRE = 0;
	
	/**
	 * The amount of damage done by the {@link Bullet}s created by the {@link #shoot(float, float, float)} method.
	 */
	private static final int BULLET_DAMAGE = 0;
	
	/**
	 * The speed multiplier fore the {@link Bullet}s created by the {@link #shoot(float, float, float)} method.
	 */
	private static final float BULLET_SPEED_MULTIPLIER = 0;
       
    /**
     * This field controls the guns fire rate.  Initially set to the value of {@link #RATE_OF_FIRE}.  
     * {@link #shoot()} checks if this value is greater than {@link #RATE_OF_FIRE}.  When the gun creates 
     * a bullet, this field is set to {@code 0}.
     */
    private int shotTimer;
    
    /**
     * This field contains all of the active {@link Bullet}s shot.  Initialized in constructor and populated by the
     * {@link #shoot(float, float, float) method}.
     */
    private ArrayList <Bullet> bullets;
    
    /**
     * Construct a {@link Shotgun} object without parameters. Initializes {@link #shotTimer} to {@code 0}.
     */
    public Shotgun()
    {
        
    }
       
    /**
     * Adds {@link Bullet} to the {@link #bullets} array at the trajectory and position specified by the parameters
     * and specifies the {@link Bullet}'s speed multiplier and damage using {@link #BULLET_DAMAGE}  and {@link #BULLET_SPEED_MULTIPLIER}
     * if {@link #shotTimer} is greater than {@link #RATE_OF_FIRE}.
     * @param x The horizontal position of the gun
     * @param y The vertical position of the gun
     * @param angle The angle that the bullet is being shot at
     * @return {@link Bullet} object that has been created and shot.
     */
    public Bullet shoot(float x, float y, float angle)
    {
        
    }
        
    /**
     * Draw the gun on the game canvas to display graphically.
     * This can be called when the player has the
     * gun equipped, or when the gun is sitting in the {@link World}.
     * Will iterate over the {@link #bullets} array and call {@link Bullet#draw()} and {@link Bullet#move()} on
     * each element.
     * Calls {@link #updateTimer()}.
     * @param x The horizontal coordinates to draw the image of the gun.
     * @param y The vertical coordinates to draw the image of the gun.
     * @param angle The radians which the gun image will be rotated around at the origin.
     */
    public void draw(float x, float y, float angle)
    {
        
    }
    
    /**
     * Increments the {@link #shotTimer} by {@code 1}.
     */
    private void updateTimer()
    {
    	
    }
}
