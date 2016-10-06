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
 * This class represents a platform.  A piece of solid ground that will prevent dynamic bodies, such as the {@link Farmer}
 * and {@link PotatoMan} from falling.  The platform can move between two points.
 * @author ajcra
 *
 */
public class Platform {
	/**
	 * This field represents the horizontal velocity of the {@link Platform}.  The value is set in {@link #Platform(float, float, float, float, float)} to a value that will lead from x1 to x2 based on the speed.  The method {@link #move()} will add this value
	 * to {@link #x} and it will be added {@link #dis} to keep track of how far the {@link Platform} has moved.  {@link #move()} will multiply {@link #vX} by {@code -1} when {@link #dis} is greater than {@link #maxDis}.
	 */
	private float vX;
	
	/**
	 * This field represents the vertical velocity of the {@link Platform}.  The value is set in {@link #Platform(float, float, float, float, float)} to a value that will lead from y1 to y2 based on the speedThe method {@link #move()} will add this value
	 * to {@link #y} and it will be added {@link #dis} to keep track of how far the {@link Platform} has moved.  {@link #move()} will multiply {@link #vX} by {@code -1} when {@link #dis} is greater than {@link #maxDis}.
	 */
	private float vY;
	
	/**
	 * This field keeps track of how far the {@link Platform} has moved since it last reached its {@link #maxDis}.  Initially set to {@code 0}.
	 * The method {@link #move()} adds {@link vX} and {@link vY} to this variable and will set this to zero if it is greater than {@link #maxDis}.
	 */
	private float dis;
	
	/**
	 * This field is initialized in {@link #Platform(float, float, float, float, float)} by taking the distance formula between the coordinates specified.
	 * It is used in {@link #move()} by checking if {@link #dis} is greater than it, if this is true, the velocities are multiplied by {@code -1} and {@link dis} is set to {@code 0}.
	 */
	private float maxDis;
	
	/**
	 *This field keeps track of the horizontal position of the {@link Platform}.  Initialized in {@link #Platform(float, float, float, float, float)} and is set to x1. The {@link #move()} method adds {@link #vX} to it.  Used in {@link #draw(float, float)} to determine the position of the image.
	 */
	private float x;
	
	/**
	 *This field keeps track of the vertical position of the {@link Platform}.  Initialized in {@link #Platform(float, float, float, float, float)} and is set to y1.  The {@link #move()} method adds {@link #vX} to it.  Used in {@link #draw(float, float)} to determine the position of the image.
	 */
	private float y;
	
	/**
	 * Stores the width of the platform. Initialized in {@link #Platform(float, float, float, float, float, float, float)} and is set to the w parameter and is never changed.  Used in {@link #draw(float, float)} to determine the size of the image.
	 */
	private float width;
	
	/**
	 * Stores the height of the platform. Initialized in {@link #Platform(float, float, float, float, float, float, float)} and is set to the h parameter and is never changed.  Used in {@link #draw(float, float)} to determine the size of the image.
	 */
	private float height;
	
	/**
	 * This field represents all of the {@link Spike}s sitting on the platform.  The ArrayList will be initialized in the constructor but will not be populated unless
	 * calls to the {@link #addSpike(Spike)}.
	 */ 
	private ArrayList<Spike> spikes;
	
	/**
	 * This field represents all of the {@link DigSite}s sitting on the platform.  The ArrayList will be initialized in the constructor but will not be populated unless
	 * calls to the {@link #addDigSite}.
	 */
	private ArrayList<DigSite> digSites;
	
	/**
	 * Uses trigonometry to set {@link vX} and {@link vY}.  The {@link #maxDis} is also calculated by using the distance formula.
	 * {@link #dis} is initialized to 0.  {@link #x} is set to x1 and {@link #y} is set to y1.
	 * @param x1 The starting x coordinate for the {@link Platform} and {@link #x} is set to this value.
	 * @param y1 The starting y coordinate for the {@link Platform} and {@link #y} is set to this value.
	 * @param x2 The ending x coordinate for the {@link Platform}.
	 * @param y2 The ending y coordinate for the {@link Platform}.
	 * @param width The width of the {@link Platform} and {@link #width} is set to this parameter.
	 * @param height The height of the {@link Platform} and {@link #height} is set to this parameter.
	 * @param speed Determines how fast the Platform travels to its endpoints.
	 */
	public Platform(float x1, float y1, float x2, float y2, float width, float height, float speed)
	{
		
	}
	
	/**
	 * Performs the graphical drawing operation for {@link Platform} using wX and wY to determine where the world view is to adjust the drawing position.
	 * Calls to {@link DigSite#draw(float, float)} to all of the {@link #digSites} and {@link Spike#draw(float, float)} are made to all of the {@link #spikes}.
	 * @param worldX The horizontal position of the view. {@link #x} - wX will draw in the correct position.
	 * @param worldY The vertical position of the view. {@link #y} - wY will draw in the correct position.
	 */
	public void draw(float worldX, float worldY)
	{
		
	}
	
	/**
	 * Adds a {@link Spike} to the {@link #spikes} array to be drawn and bound to the platform, so it can travel along with it as the platform moves.
	 * @param spike {@link Spike} to be added to {@link #spikes} array.
	 */
	public void addSpike(Spike spike)
	{
		
	}
	
	/**
	 * Adds a {@link DigSite} to the {@link #digSites} array to be drawn in the {@link #draw} method.  The {@link DigSite} will travel along with the platform.
	 * @param digSite to be added to the {@link #digSites}.
	 */
	public void addDigSite(DigSite digSite)
	{
		
	}
	
	/**
	* Iterates over all of the {@link #spikes} and calls the {@link Spike#checkDamage(Farmer, float)} method on each element.
	* @param farmer The {@link Farmer} which represents the player from the {@link World}.
	*/
	public void checkDamage(Farmer farmer)
	{
		
	}
	
	/**
	* Iterates over all of the {@link #digSites} and calls the {@link DigSite#checkDig(float, float)} method on each {@link DigSite} object.
	* @param x1 Position to check if a {@link DigSite} is in range of.
	* @return The {@link Item} returned by {@link DigSite#checkDig(float, float)}. May be {@code null}.
	*/
	public Item checkDig(float x1)
	{
		
	}
	
	/**
	 * Adds {@link #vX} to {@link #x} and adds {@link #vY} to {@link #y} to move the position of the {@link Platform}.  {@link #dis} is 
	 * incremented to keep track of when the {@link Platform} needs to go in the opposite direction.  This direction switch happens when 
	 * {@link #dis} is greater than {@link #maxDis}.
	 */
	public void move()
	{
		
	}
	
	/**
	 * Returns {@code true} if the bodyX and bodyY coordinates are inside of {@code this} {@link Platform}.  Done by checking if the parameter coordinates are greater than {@link #x} and {@link #y}.  But are within the {@link #width} and {@link #height}.
	 * @param bodyX The x coordinate to check if it is inside {@code this} {@link Platform}.
	 * @param bodyY The y coordinate to check if it is inside {@code this} {@link Platform}
	 * @return {@code true} if the coordinates are inside the {@code Platform} bounds, {@code} false otherwise.
	 */
	public boolean isColliding(float bodyX, float bodyY)
	{
		
	}
}
