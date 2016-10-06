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

import java.util.ArrayList;

/**
 * This class represents the world.  Therefore, objects that make up the environment, such as Platforms, are stored
 * here as ArrayLists.  The Farmer, which is treated as the player, is an attribute along with an ArrayList of enemies.
 * The HUD is also an attribute of this class.
 * @author ajcra
 *
 */
public class World {
	/**
	 * This field represents the horizontal position of the world's view.  Initially {@code 0}, this field can be incremented or decremented
	 * by the method {@link #translate(float, float)}.
	 */
	private float worldX;
	/**
	 * This field represents the vertical position of the world's view.  Initially {@code 0}, this field can be incremented or decremented
	 * by the method {@link #translate(float, float)}.
	 */
	private float worldY;
	
	/**
	 * This field represents the character that the player will be controlling.  The field will be initialized in the 
	 * {@link World}'s constructor.  The field will not be reassigned.
	 */
	private Farmer farmer;
	/**
	 * This field represents all of the {@link PotatoMan}s in the visible world.  The ArrayList will be initialized and partially populated in the {@link World}'s constructor.
	 * The field will not be reassigned but elements may be added by the method {@link #spawnPotatoMen(float, float)}, elements will be removed by
	 * the method {@link #draw()} when {@link PotatoMan#isDead} returns {@code true}.
	 */
	private ArrayList<PotatoMan> potatoMen;
	
	/**
	 * This field represents all of the {@link Platform}s in the world.  The ArrayList will be initialized and fully populated in the {@link World}'s constructor.
	 * After, the field will not be reassigned and no elements will be removed or added.
	 */ 
	private ArrayList<Platform> platforms;
	
	/**
	 * This field represents all of the {@link Bullet}s in the world.  The ArrayList will be initialized in the constructor
	 * and populated through calls to {@link #addBullet(Bullet)}.  
	 */
	private ArrayList<Bullet> bullets;
	
	/**
	 * Displays information about the player's inventory and is drawn in the {@link #draw()} method.  Initialized in constructor and is never reassigned.
	 */
	private HUD hud;
	
	/**
	 * The default constructor for the class {@link Person}.  The constructor will initialize {@link #farmer} 
	 * and sets the farmer name to {@code "No Name"}.  {@link #potatoMen} will be initialized and partially populated
	 * with {@link PotatoMan} near the start of the world by making calls to the method {@link #spawnPotatoMen(float, float)}.  {@link #platforms} will be initialized and fully populated with 
	 * {@link Platform}s who's positions and velocities are coded into the constructor.  {@link #worldX } will be set to {@code 0}.  {@link #worldY} will be set to {@code 0}.
	 */
	public World()
	{
		
	}
	
	/**
	 * Draws the {@link Farmer} by calling {@link Farmer#draw()}.
	 * Calls {@link Farmer#move()}.
	 * Draws the {@link HUD} by calling {@link HUD#draw()}.
	 * Iterates through the {@link Bullet}s in the {@link #bullets} calling {@link Bullet#draw()}, {@link Bullet#move()}, and {@link Bullet#checkCollision(World)}.
	 * Iterates through the {@link #platforms} and calls {@link Platform#draw()} and {@link Platform#move()}.
	 * Iterates through the {@link #potatoMen} calling {@link PotatoMan#draw()} and {@link PotatoMan#move()}, will also remove the element if {@link PotatoMan#isDead()} returns {@code true}.
	 */
	public void draw()
	{
		
	}
	
	/**
	 * Adds deltaX and deltaY to the corresponding the {@link #worldX} and {@link #worldY} values.  Causing the camera to "translate".
	 * @param deltaX Value to be added to the {@link #worldX}.
	 * @param deltaY Value to be added to the {@link #worldY}.
	 */
	public void translate(float deltaX, float deltaY)
	{
		
	}
	
	/**
	 * Adds a new {@link PotatoMan} object to the {@link #potatoMen} array.
	 * @param x X-coordinate for the position of the potato man
	 * @param y Y-coordinate for the position of the potato man
	 */
	public void spawnPotatoMen(float x, float y)
	{
		
	}
	
	/**
	 * Accessor for the {@link #farmer} object, which is the player in the {@link World}
	 * @return The {@link #farmer}, which represents the player in the {@link World}
	 */
	public Farmer getFarmer()
	{
		
	}
	
	/**
	 * Accessor to the {@link #potatoMen} container, which consists of all of the {@link PotatoMan} that have been spawned.
	 * @return The {@link #potatoMen}, contains all of the {@link PotatoMan} spawned by the world.
	 */
	public ArrayList<PotatoMan> getPotatoMen()
	{
		
	}
	
	/**
	 * Accessor to the {@link #platforms} container, which contains all of the {@link Platform}s in the {@link World}
	 * @return The {@link #platforms}, containing all of the {@link Platform}s in the World.
	 */
	public ArrayList<Platform> getPlatforms()
	{
	
	}
	
	/**
	 * Accessor for the {@link #worldX} attribute, which keeps track of the horizontal position of the view for all objects in the {@link World}.
	 * @return The {@link #worldX} attribute. Should be used in the x parameter in graphical draw methods so the view appears to move.
	 */
	public float getWorldX()
	{
		
	}
	
	/**
	 * Accessor for the {@link #worldY} attribute, which keeps track of the vertical position of the view for all objects in the {@link World}.
	 * @return The {@link #worldY} attribute. Should be used in the y parameter in graphical draw methods so the view appears to move.
	 */
	public float getWorldY()
	{
		
	}
	
	/**
	 * Accessor for the {@link #hud} attribute that is displayed on the {@link #draw()} method.
	 * @return The {@link #hud} attribute that is drawn to the world in front of all the environment and players.
	 */
	public HUD getHUD()
	{
		
	}
	
	/**
	 * Pushes a {@link Bullet} to the {@link #bullets} array, to be drawn and updated.
	 * @param bullet {@link Bullet} to be added to {@link bullets}.
	 */
	public void addBullet(Bullet bullet)
	{
		
	}
}