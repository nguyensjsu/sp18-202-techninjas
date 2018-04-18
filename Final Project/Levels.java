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
