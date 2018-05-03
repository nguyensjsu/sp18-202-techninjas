import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemNotTakenState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemNotTakenState extends PlayerState
{
   public GemNotTakenState(PlayerOne p){
       super(p);
    }
       public void getGoal(Actor takeGem,World world)
    {
        //Actor takeGem = getOneIntersectingObject(Goal.class);
        if (takeGem !=null)
        {
            Greenfoot.playSound("goal.wav");
            world.addObject(new House(), 75,310);
            world.removeObject(takeGem);
            playerOne.setState( playerOne.gemTakenState);
        }
    }  
         public void goHome(Actor goHome, World w)
    {
      
    }
}
