import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemTakenState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemTakenState extends PlayerState
{
    public GemTakenState(PlayerOne p){
        super(p);
    }
    
  public void goHome(Actor goHome, World world)
    {
          //Actor goHome = getOneIntersectingObject(Home.class);
          if (goHome != null)
          {
              Greenfoot.playSound("home.wav");
              world.removeObject(goHome);
              Levels w = (Levels)world;
              w.endLevelOne();
            }    
    } 
    
       public void getGoal(Actor takeGem, World w)
    {
  
    }
}
