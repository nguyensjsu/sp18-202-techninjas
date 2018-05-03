import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * The Horizontal Enemy class.
 * The Horizontal Enemy moves horizontally ONLY.
 * The Horizontal Enemy eats the player.
 */
public class EnemyHoriz extends Enemy
{
    // instance or state variables
    public int speed = 2;
    public String direction;

    // Constructor
    public EnemyHoriz()
    {
        setRotation(0);
        direction = "left";
    }
   
    // Method called whenever act or run is pressed.
    public void act() 
    {
       setLocation(getX() + speed, getY());
       atWall();
    }   
    
    // Changes the direction of the bug.
    public void changeDirection()
    {
       if (direction.equals("left"))
       {
       setRotation(180);
       direction = "right";
       }
       else 
       {
       setRotation(0);
       setLocation(getX()+5, getY());
       direction = "left";
       }
    }
    
    // If the bug is at the wall, have it change direction.
    public void atWall()
    {
        Actor wall = getOneIntersectingObject(wallRect.class);
        if (wall != null)
        {
            speed = -speed;
            changeDirection();
        }
    }
}
