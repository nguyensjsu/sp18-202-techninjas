import greenfoot.*;

public class Level2 implements LevelInterface extends World 
{
	public int level = 2;
	public Level2()
    {
        super(600,600, 1);
        prepareLevelTwo();
    }

	public void prepareLevelTwo()
	{
		wallRectTwo block ;
		//vertical
		for (int i = 6 ; i < 21 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 575, 27 * i) ;
        }
		//vertical
		for (int i = 2 ; i < 17 ; i++)
		{
		  block = new wallRectTwo() ;
		  addObject(block, 53, 27 * i) ;
		}
		//horizontal
		for (int i =2 ; i < 22 ; i++)
		{
			block = new wallRectTwo() ;
			addObject(block, 27 * i, 50) ;
		}
		//horizontal
		for (int i = 2 ; i < 22 ; i++)
		{
			block = new wallRectTwo() ;
			addObject(block, 27 * i, 550) ;
		}

		//First column
		for (int i = 6 ; i < 20 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 150, 27 * i) ;
        }

		//second column
		for (int i = 6 ; i < 17 ; i++)
		{
			block = new wallRectTwo() ;
			addObject(block, 255, 27 * i) ;
		}

		//Third column
		for (int i = 6 ; i < 17 ; i++)
		{
          block = new wallRectTwo() ;
          addObject(block, 360, 27 * i) ;
    	}

		//fourth
		for (int i = 3 ; i < 17 ; i++)
		{
			block = new wallRectTwo() ;
			addObject(block, 475, 27 * i) ;
		}

		// Player object
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


    // Displays the "You Win!" screen.
    public void prepareWon()
    {
       setBackground("You Win!.png");
       Greenfoot.stop();
    }
}
