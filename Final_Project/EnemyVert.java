import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/* The Vertical Enemy class.
 * The Vertical Enemy ONLY walks vertically.
 * The Vertical Enemy eats the player. 
 */
public class EnemyVert extends Enemy
{
    // instance or state variables
    public int speed = 2;
    public String direction = "down";

    // Constructor
    public EnemyVert()
    {
        setRotation(90);  // face downward initially
    }
   
    // Method called whenever act or run is pressed.
    public void act() 
    {
       setLocation(getX(), getY() + speed);
       atWall();
    }   
    
    // Changes the direction of the bug.
    public void changeDirection()
    {
       if (direction.equals("down"))
       {
       setRotation(270);
       direction = "up";
       }
       else 
       {
       setRotation(90);
       setLocation(getX(), getY()+5);
       direction = "down";
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
