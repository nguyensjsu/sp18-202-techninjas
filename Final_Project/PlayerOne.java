import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/*
 * Main character of game for Level One ONLY.  Uses similar methods,
 * but called differently than the other Player classes.  Allows player
 * to move the character around, causes the player to be reset if he/she
 * should be eaten by a bug, has the house appear when the gem is reached,
 * and calls the End Level class.
 */

public class PlayerOne extends InteractiveMover implements InteractiveInterface
{    
    
PlayerState currentState;
   PlayerState gemNotTakenState;
   PlayerState gemTakenState;
    // Constructor
    public PlayerOne()
    {
        setRotation(0);
        gemNotTakenState= new GemNotTakenState(this);
         gemTakenState= new GemTakenState(this);
        currentState=gemNotTakenState;
    }
    
    public void setState(PlayerState p){
        currentState = p;
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
