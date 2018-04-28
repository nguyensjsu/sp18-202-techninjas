import greenfoot.*;

public class Levels extends World
{
	public int level = 1;
	public Levels()
    {
        super(600,600, 1);
        prepareLevelOne();
    }

	public void prepareLevelOne()
	{
		wallRectOne block ;
		//vertical
		for (int i = 2 ; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 575, 27 * i) ;
        }

		//horizontal
		for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 50) ;
        }

		//horizontal
		for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 550) ;
        }

		 //vertical
        for (int i = 2 ; i < 9 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 58, (27 * i)+11) ;
        }

        //vertical
        for (int i = 14; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 58, 27 * i) ;
        }


		// INNER RECTANGLE

        //horizontal wall 5 units long
		for (int i = 12; i < 17; i++)
		{
           block = new wallRectOne();
           addObject(block, (27*i)+5, 355);
        }

       //horizontal wall 5 units long
       for (int i = 12; i < 17; i++)
       {
           block = new wallRectOne();
           addObject(block, (27*i)+5, 245);
        }

        //vertical wall 5 units long
        for (int i = 9; i < 14 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 460, 27*i) ;
        }

		PlayerOne player = new PlayerOne() ;
        addObject(player,75,315) ;


		// BlueGem object
		BlueGem blueGem = new BlueGem() ;
		addObject(blueGem,410,297);

		// Enemy objects
		EnemyVert enemy = new EnemyVert() ;
		addObject(enemy,250,193) ;

		EnemyVert enemy1 = new EnemyVert() ;
		addObject(enemy1,517,100) ;
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

	//Uttara
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
