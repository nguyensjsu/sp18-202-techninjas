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
