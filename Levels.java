import greenfoot.*;

public class Levels extends World
{
	public int level = 1;
	public Levels()
    {
        super(400,400, 1);
        prepareLevelOne();
    }

	public void prepareLevelOne()
	{
		wallRectOne block ;
		for (int i = 2 ; i < 10 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 575, 27 * i) ;
        }
	}

	// Component: End Level 1 and Prepare Level 2.
	public void endLevelOne()
	{
			removeObjects(getObjects(wallRect.class));
			removeObjects(getObjects(Enemy.class));
			removeObjects(getObjects(PlayerOne.class));
			removeObjects(getObjects(Home.class));
			prepareLevelTwo();
	}

	public void prepareLevelTwo()
	{
			 wallRectTwo block ;

			 PlayerTwo player = new PlayerTwo() ;
        addObject(player,67,495) ;

        // GreenGem object
        GreenGem greenGem = new GreenGem() ;
        addObject(greenGem,555,106);

        // Enemy objects
        EnemyHoriz enemy = new EnemyHoriz() ;
        addObject(enemy,110,100) ;

        EnemyHoriz enemy1 = new EnemyHoriz() ;
        addObject(enemy1,225,500) ;

        EnemyVert enemy2 = new EnemyVert();
        addObject(enemy2, 300,300);
	}

	public void endLevelTwo()
    {
        removeObjects(getObjects(wallRect.class));
        removeObjects(getObjects(Enemy.class));
        removeObjects(getObjects(PlayerTwo.class));
        removeObjects(getObjects(Home.class));
        prepareLevelThree();
    }

}
