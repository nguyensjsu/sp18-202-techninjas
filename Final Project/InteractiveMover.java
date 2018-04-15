import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/*
 * Basis for Player, allows the person playing to
 * move the character around the screen, but not
 * move into the walls.
 */
public class InteractiveMover  extends Actor
{
    // Constructor
    public InteractiveMover()
    {
        
    }

    // Method called whenever act or run is pressed.
    public void act() 
    {
        processKeys();
    }
}