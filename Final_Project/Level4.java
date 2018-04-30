import greenfoot.*;

public class Level4 extends World implements LevelInterface 
{
	public int level = 1;
	public Level4()
    {
        super(600,600, 1);
        prepareLevelFour();
    }

	public void prepareLevelFour()
    {
        wallRectFour block ;

       // OUTSIDE OUTER RECTANGLE

       // Player object
       PlayerFour player = new PlayerFour() ;
       addObject(player,75,485) ;

       // OrangeGem object
       Key key = new Key();
       addObject(key,500,500);

       // Enemy objects
       EnemyVert enemy = new EnemyVert() ;
       addObject(enemy,220,194) ;

       EnemyVert enemy1 = new EnemyVert() ;
       addObject(enemy1,525,100) ;

       EnemyVert enemy2 = new EnemyVert() ;
       addObject(enemy2,220,400) ;

       EnemyVert enemy3 = new EnemyVert() ;
       addObject(enemy3,525,300) ;
    }


    public void endLevelFour()
    {
       removeObjects(getObjects(wallRect.class));
       removeObjects(getObjects(Enemy.class));
       removeObjects(getObjects(PlayerFour.class));
       removeObjects(getObjects(Home.class));
       prepareWon();
    }

    // Displays the "You Win!" screen.
    public void prepareWon()
    {
       setBackground("You Win!.png");
       Greenfoot.stop();
    }
}
