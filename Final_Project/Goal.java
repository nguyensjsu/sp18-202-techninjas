import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * Class for player to reach, then return home.
 * Blue, green, orange gems, and the key are all
 * subclasses of this class.
 */
public abstract class Goal  extends Actor
{
    // Method called whenever act or run is pressed.
    public abstract void act();   
}
