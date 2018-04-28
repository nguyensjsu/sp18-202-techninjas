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

    // Read keybaord input.
    public void processKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
            Actor wallCell = getOneIntersectingObject(wallRect.class);
            if (wallCell !=null)
            {
                setLocation (getX()+5,getY());
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
            Actor wallCell = getOneIntersectingObject(wallRect.class);
            if (wallCell !=null)
            {
                setLocation (getX()-5,getY());
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
            Actor wallCell = getOneIntersectingObject(wallRect.class);
            if (wallCell !=null)
            {
                setLocation (getX(),getY() + 5);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
            Actor wallCell = getOneIntersectingObject(wallRect.class);
            if (wallCell !=null)
            {
                setLocation (getX(),getY() - 5);
            }
        }
    }
    
    // Subtract SPEED from the x value.
    public void moveLeft()
    {
        setLocation(getX()-SPEED,getY());
    }
    
    // Add SPEED to the x value.
    public void moveRight()
    {
        setLocation(getX()+SPEED,getY());
    }
    
    // Add SPEED to the y value.
    public void moveUp()
    {
        setLocation(getX(),getY()-SPEED);
    }
    
    // Subtract SPEED to the y value.
    public void moveDown()
    {
        setLocation(getX(),getY()+SPEED);
    }
    
    // state or instance variables
    private static final int SPEED = 10;
    
}
