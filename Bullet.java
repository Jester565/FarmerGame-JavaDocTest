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
 * Bullet class represents a bullet which is fired from a {@link Shotgun}
 * object.
 * @author James Taracevicz
 */
public class Bullet {
    
    /**
     * The horizontal coordinate for the location to draw the image of the gun.
     * Refers to the top left x coordinate of the gun graphic. 
     */
    private float x;
    
    /**
     * The vertical coordinate for the location to draw the gun.
     * Refers to the top left y coordinate of the gun graphic.
     */
    private float y;
    
        
    /**
     * The horizontal velocity of the bullet.  Added to the {@link #x} field every time {@link #move()} is called
     */
    private float velocityX;
    
    /**
     * The vertical velocity of the bullet.  Added to the {@link #y} field every time {@link #move()} is called.
     */
    private float velocityY;
        
    /**
     * The {@link #velocityX} and {@link #velocityY} fields are multiplied by this value to adjust bullet speed every time {@link #move()} is called.
     * Generally each bullet has a constant speed.  Initialized by constructor and is not modified after.
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
     * An accessor for the {@link damage} attribute, which gets how much damage {@code this} bullet inflicts.
     * @return The amount of damage this {@link Bullet} does.
     */
    public int getDamage()
    {
        
    }
    
    /**
     * Draw {@code this} bullet to the canvas to display graphically.  Use the {@link x} and {@link y} to determine the coordinates to draw it.
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
