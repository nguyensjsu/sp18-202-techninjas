import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/*
 * Main character of game for Level One ONLY.  Uses similar methods,
 * but called differently than the other Player classes.  Allows player
 * to move the character around, causes the player to be reset if he/she
 * should be eaten by a bug, has the house appear when the gem is reached,
 * and calls the End Level class.
 */

public class PlayerOne extends InteractiveMover
{    
    // Constructor
    public PlayerOne()
    {
        setRotation(0);
    }

    // When run or act is pressed, the player testst if he/she
    // can move, moves if he/she can, and tests if he/she has
    // found the enemy, the gem, or gone home.
    public void act() 
    {
        if (canMove())
        {
           processKeys();
        }
        touchEnemy();
        getGoal();
        goHome();
    }   
    
    //Returns true if the player is within the world's borders.
    public boolean canMove()
    {
        if (getX() > 0)
        {
           return true; 
        }
        else if (getY() > 0)
        {
           return true; 
        }
        else if (getX() < 500)
        {
           return true; 
        }
        else if (getY() < 500)
        {
           return true; 
        }
        else
        {
            return false;
        }        
    }
        
    // If the player touches the enemy, the player is
    // reset to the start of the level, the gem is placed
    // back if it was missing, and the home is removed if
    // it was there.
    public void touchEnemy()
    {
        Actor playerReset = getOneIntersectingObject(Enemy.class);
        if (playerReset != null)
        {
            Greenfoot.playSound("enemy.wav");
            setLocation(75,315);
            getWorld().addObject(new BlueGem(), 410,297);
            getWorld().removeObjects(getWorld().getObjects(Home.class));
        }
    }

    // The player must get the gem before the home portal will appear.
    public void getGoal()
    {
        Actor takeGem = getOneIntersectingObject(Goal.class);
        if (takeGem !=null)
        {
            Greenfoot.playSound("goal.wav");
            getWorld().addObject(new House(), 75,310);
            getWorld().removeObject(takeGem);
        }
    }
        
    // When the player reaches home, remove the home image,
    // and call the EndLevelOne method of the Levels class.
    public void goHome()
    {
          Actor goHome = getOneIntersectingObject(Home.class);
          if (goHome != null)
          {
              Greenfoot.playSound("home.wav");
              getWorld().removeObject(goHome);
              Levels world = (Levels)getWorld();
              world.endLevelOne();
            }    
    }  
}
