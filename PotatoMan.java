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
 * This class represents an enemy called PotatoMan.  It can shoot, move, and has a limited amount of health.  The health
 * can be reduced through methods.
 * @author Francisco
 *
 */
public class PotatoMan {

	/**
	 * This field represents the speed of the PotatoMan. It will determine the rate of change of the {@link x} and {@link y} values. It cannot be modified.
	 */
	private float SPEED;
	/**
	 * The initial and maximum value for the {@link #health} field.
	 */
	private static final int MAX_HEALTH;
	
	/**
	 * This field represents the amount of "health" the PotatoMan has. Once it reached {@code 0} it is considered to be dead. 
	 * Initially set to {@link #MAX_HEALTH} , and only decreases when a it is shot by a {@link Farmer} and the {@link #takeDamage(int)} method is called.
	 */
	private int health;
	/**
	 * This field represents the horizontal location of the PotatoMan. It  {@link #speed}.
	 */
	private float x;
	/**
	 * This field represents the vertical location of the PotatoMan . It affects the {@link #speed}.
	 */
	private float y;
	
	/**
	 * This field represents the {@link World} object that this enemy exists in.
	 */
	private World world;
	/**
	 * The {@link Shotgun} object used to shoot at the {@link Farmer}.
	 */
	private Shotgun shotgun;
	
	/**
	 * The default contructor for the class {@link PotatoMan}. Will have {@link #world}, an initial {@link #x}, and an initial {@link #y}.
	 * @param world Used to set the attribute {@link #world}.
	 * @param x The spawn position of the {@link PotatoMan}, the {@link #x} is set to the value of this parameter.
	 */
	public PotatoMan(World world, float x, float y) {
		
	}
	
	/**
	 * This method draws {@code this} {@link PotatoMan}, using the {@link #x} and {@link #y} and correcting the position
	 * by subtracting those coordinates from {@link World#getWorldX()} and {@link World#getWorldY()}.
	 */
	public void draw() {
		
	}
	
	/**
	 * This method updates the {@link #x} and {@link #y} methods by incrementing or decrementing them by {@link #SPEED}.
	 *  Movement may be blocked if when iterating through the {@link Platform}s returned by {@link World#getPlatforms()}, {@link Platform#isColliding(float, float)} returns {@code true}.
	 */
	public void move()
	{
		
	}
	
	/**
	 * This method uses {@link #shotgun} to attack the {@link Farmer}, if it is visible.  By using information from the {@link World} class,
	 * the angle of the {@link Farmer} is determined and {@link Shotgun#shoot(float, float, float)} is used to fire at it.
	 */
	private void attack() {
		
	}
	
	/**
	 * This method reduces the {@link #health} of the PotatoMan by the value of the parameter damage.
	 * @param damage How much {@link #health} should be reduced by.
	 */
	private void takeDamage(int damage) {
		
	}
	
	/**
	 * This method returns {@code true} if {@link #health} of PotatoMan <= 0, otherwise it returns {@code false}.
	 */
	private boolean isDead() {
		
	}

}
