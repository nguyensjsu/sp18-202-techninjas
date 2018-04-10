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
}