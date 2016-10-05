/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #1
 *
 * <description-of-assignment>
 * Create imaginary game without writing functional code to practice writing
 * and using javadoc utility.
 *
 * Random Six:
 * Hao
 * Alex
 * Fransisco
 * Jessica
 * Jason
 * James Taracevicz
 */
package game;

import java.util.ArrayList;

/**
 * Shotgun class represents a shotgun in the game which can be shot reloaded,
 * hold ammo in the clip, and more. 
 * 
 * @author James Taracevicz
 * 
 */
public class Shotgun {
    
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
     * The delay in milliseconds between gun shots.
     */
    private int shotDelay;
           
    /**
     * Construct a {@link Shotgun} object without parameters. Initializes all
     * of the attributes needed.
     */
    public Shotgun()
    {
        
    }
    
    /**
     * Construct a {@link Shotgun} object and assign it coordinates. 
     * Initializes all of the attributes needed, and it sets {@link #x} and 
     * {@link #y} to {@code this} {@code x} and {@code y}.
     * @param spawnX x coordinate to spawn the gun at
     * @param spawnY y coordinate to spawn the gun at
     */
    public Shotgun(float spawnX, float spawnY)
    {
        
    }
       
    /**
     * Send some bullets flying (from gun nozzle). 
     * containing {@link Bullet} objects.
     */
    public void shoot()
    {
        
    }
        
    /**
     * Draw the gun on the game canvas to display graphically.
     * This can be called when the player has the
     * gun equipped, or when the gun is sitting in the {@link World}.
     */
    public void draw()
    {
        
    }
}
