import greenfoot.*;

public class Level3 extends World
{
	public int level = 1;
	public Level3()
    {
        super(600,600, 1);
        prepareLevelThree();
    }

	public void prepareLevelThree()
	{
		wallRectThree block ;
// make a vertical wall
		for (int i = 6 ; i < 21 ; i++)
		        {
		            block = new wallRectThree() ;
		            addObject(block, 575, 27 * i) ;
		        }

		        // make a vertical wall
		        for (int i = 2 ; i < 17 ; i++)
		        {
		            block = new wallRectThree() ;
		            addObject(block, 25, 27 * i) ;
		        }

		        // make a horizontal wall
		        for (int i =1 ; i < 22 ; i++)
		        {
		            block = new wallRectThree() ;
		            addObject(block, 27 * i, 50) ;
		        }

		        // make a horizontal wall
		        for (int i = 1 ; i < 22 ; i++)
		        {
		            block = new wallRectThree() ;
		            addObject(block, 27 * i, 550) ;
		        }

						// FIRST COLUMN
        // make a vertical wall
        for (int i = 2 ; i < 14 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 130, 27 * i) ;
        }

        // make a vertical wall
        for (int i = 17 ; i < 20 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 130, 27 * i) ;
        }
				// COLUMNS IN ORDER
			// FIRST COLUMN

			for (int i = 2 ; i < 14 ; i++)
			{
					block = new wallRectThree() ;
					addObject(block, 130, 27 * i) ;
			}


			for (int i = 17 ; i < 20 ; i++)
			{
					block = new wallRectThree() ;
					addObject(block, 130, 27 * i) ;
			}
			// SECOND COLUMN
	        // make a vertical wall
	    for (int i = 2 ; i < 12 ; i++)
	    {
	            block = new wallRectThree() ;
	            addObject(block, 240, 27 * i) ;
	    }

	        // make a vertical wall
	    for (int i = 15 ; i < 20 ; i++)
	    {
	            block = new wallRectThree() ;
	            addObject(block, 240, 27 * i) ;
	    }


	        // THIRD COLUMN
	        // make a vertical wall
	        for (int i = 2 ; i < 10 ; i++)
	        {
	            block = new wallRectThree() ;
	            addObject(block, 350, 27 * i) ;
	        }

	        // make a vertical wall
	        for (int i = 13 ; i < 20 ; i++)
	        {
	            block = new wallRectThree() ;
	            addObject(block, 350, 27 * i) ;
	        }


	        // FOURTH COLUMN
	        // make a vertical wall
	        for (int i = 3 ; i < 8 ; i++)
	        {
	            block = new wallRectThree() ;
	            addObject(block, 453, 27 * i) ;
	        }

	        // make a vertical wall
	        for (int i = 11 ; i < 20 ; i++)
	        {
	            block = new wallRectThree() ;
	            addObject(block, 453, 27 * i) ;
	        }

		// Player object
		PlayerThree player = new PlayerThree() ;
		addObject(player,30,495) ;

		// GreenGem object
		OrangeGem orangeGem = new OrangeGem() ;
		addObject(orangeGem,577,106);

		// Enemy objects
		EnemyVert enemy = new EnemyVert();
		addObject(enemy, 75,100);

		EnemyVert enemy1 = new EnemyVert();
		addObject(enemy1, 180,200);

		EnemyVert enemy2 = new EnemyVert();
		addObject(enemy2, 290,300);

		EnemyVert enemy3 = new EnemyVert();
		addObject(enemy3, 400,400);

		EnemyVert enemy4 = new EnemyVert();
		addObject(enemy4, 505,500);
	}

	// Displays the "You Win!" screen.
	public void endLevelThree()
	    {
	        removeObjects(getObjects(wallRect.class));
	        removeObjects(getObjects(Enemy.class));
	        removeObjects(getObjects(PlayerThree.class));
	        removeObjects(getObjects(Home.class));
	        prepareLevelFour();
	    }

		public void prepareWon()
    {
       setBackground("You Win!.png");
       Greenfoot.stop();
    }

}
