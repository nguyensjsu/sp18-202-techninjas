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
		for (int i = 2 ; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 575, 27 * i) ;
        }

		for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 50) ;
        }
		
		for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 550) ;
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
		
		for (int i = 6 ; i < 21 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 575, 27 * i) ;
        }
	}

}
