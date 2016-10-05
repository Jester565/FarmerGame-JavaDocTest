/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #1
 *
 * <description-of-assignment>
 * Create a platformer without any code in the methods to practice working in a group, class design, and
 * utilizing the javadoc utility.
 *
 * Random Six:
 * Hao Zheng
 * Alex Craig
 * Fransisco Rodriguez
 * Jessica Castron
 * Jason Kwok
 * James Taracevicz
 */

package edu.cpp.cs.cs141.prog_assgmnt_1;

/**
 * Bullet class represents a bullet which is fired from a {@link Shotgun}
 * object.
 * @author James Taracevicz
 */
public class Bullet {
    
    /**
     * The x coordinate for the location to draw the gun.
     * Refers to the top left x coordinate of the gun graphic.
     */
    private float x;
    
    /**
     * The y coordinate for the location to draw the gun.
     * Refers to the top left y coordinate of the gun graphic.
     */
    private float y;
    
        
    /**
     * The x component vector of the velocity.
     */
    private float velocityX;
    
    /**
     * The y component vector of the velocity.
     */
    private float velocityY;
        
    /**
     * The velocity gets multiplied by this value to adjust bullet speed.
     * Generally each bullet has a constant speed.
     */
    private float speedMultiplier;
    
    /**
     * The amount of damage the {@link Bullet} inflicts upon the object it 
     * collides with.
     */
    private int damage;
    
           
    /**
     * Initialize all attributes by passing arguments to this constructor.
     * These attributes get instantiated.
     * @param x_init set {@link #x}
     * @param y_init set {@link #y}
     * @param velocityX_init set {@link #velocityX}
     * @param velocityY_init set {@link #velocityY}
     * @param speedMultiplier_init set {@link speedMultiplier_init}
     * @param damage_init set {@link #damage}
     */
    public Bullet(float x_init, float y_init, float velocityX_init, 
                    float velocityY_init, float speedMultiplier_init,
                    int damage_init)
    {
        
    }
    
    
    
    /**
     * Get how much damage {@code this} bullet does.
     * @return The amount of damage this {@link Bullet} does.
     */
    public int getDamage()
    {
        
    }
    
    /**
     * Draw {@code this} bullet to the canvas to display graphically.
     */
    public void draw()
    {
        
    }   
    
    /**
     * Change the position of the bullet by adding {@link vX} to {@link x} and adding {@link vY} to {@link y}.
     */
    public void move()
    {
    	
    }
}
