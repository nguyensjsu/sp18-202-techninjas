import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/*
 * Main character of game for Level Three ONLY.  Uses similar methods,
 * but called differently than the other Player classes.  Allows player
 * to move the character around, causes the player to be reset if he/she
 * should be eaten by a bug, has the house appear when the gem is reached,
 * and calls the End Level class.
 */

public class PlayerThree extends InteractiveMover implements InteractiveInterface
{
    
    public PlayerThree()
    {
        setRotation(0);
    }

    
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
            setLocation(30,495);
            getWorld().addObject(new OrangeGem(), 577,106);
            getWorld().removeObjects(getWorld().getObjects(Home.class));
        }
    }

    // The player must get the gem before the home portal will appear.
    public void getGoal()
    {
        Actor takeGem = getOneIntersectingObject(Goal.class);
        if (takeGem !=null)
        {
            getWorld().addObject(new House(), 30,495);
            getWorld().removeObject(takeGem);
            Greenfoot.playSound("goal.wav");
        }
    }
    // When the player reaches home, remove the home image,
    // and call the endLevelThree method of the Levels class.
    public void goHome()
    {
      Actor goHome = getOneIntersectingObject(Home.class);
      if (goHome != null)
      {
          Greenfoot.playSound("home.wav");
          getWorld().removeObject(goHome);
          Levels world = (Levels)getWorld();
          world.endLevelThree();
      }
    }  

}
