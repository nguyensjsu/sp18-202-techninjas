import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.ArrayList;
/*
 * With four vibrant levels of mazes, it is your
 * goal as the character with the pink hair to get
 * the gem and head to the house (where you started) 
 * in each level.  You can not walk through any of
 * the plants, bushes, or rocks.  Avoid the bugs at
 * all costs or you'll be rest back to the start of 
 * the level.  All sounds were made with GarageBand.
 * Images were from GreenFoot, Planet Cute, and Lost
 * Garden.  Good luck and have fun playing!
 */

public class Levels extends World
{
    public int level = 1;
    
    //Constructor for objects of class Levels.
    public Levels()
    {    
        super(600,600, 1);
        prepareLevelOne();
    }
    
    // Prepares Level One, with the walls,
    //the player, the gem and the enemies.
    public void prepareLevelOne()
    {
       wallRectOne block ;

       // OUTSIDE OUTER RECTANGLE
       
       // make a vertical wall 19 unts long starting at (575, 54) - Ã
        for (int i = 2 ; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 575, 27 * i) ;
        }

       // make a horizontal wall 20 units long starting at point (54, 50) - Ã
        for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 50) ;
        }

        // make a horizontal wall 20 units long starting at point (54, 550) - Ã
        for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 550) ;
        }        

        // make a vertical wall 7 unts long starting at (58, 65) - Ã
        for (int i = 2 ; i < 9 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 58, (27 * i)+11) ;
        }  

        // make a vertical wall 7 unts long starting at (58, 378) - Ã
        for (int i = 14; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 58, 27 * i) ;
        }    
       
        
       // INSIDE OUTER RECTANGLE        

        // make a horizontal wall 11 units long starting at point (180, 150) - Ã
        for (int i =6 ; i < 17 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, ((27 * i)+18), 150) ;
        }      

        // make a vertical wall 11 unts long starting at (175, 162) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 175, 27 * i) ;
        }

        // make a horizontal wall 11 units long starting at point (180, 450) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, ((27 * i)+18), 450) ;
        }  
        

        // INNER RECTANGLE

        // make a horizontal wall 5 units long starting at point (329, 355) - Ã
       for (int i = 12; i < 17; i++)
       {
           block = new wallRectOne();
           addObject(block, (27*i)+5, 355);
        }

       // make a horizontal wall 5 units long starting at point (329, 245) - Ã
       for (int i = 12; i < 17; i++)
       {
           block = new wallRectOne();
           addObject(block, (27*i)+5, 245);
        }

        // make a right vertical wall 5 unts long starting at (460, 243) - Ã
       for (int i = 9; i < 14 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 460, 27*i) ;
        }  
        
       BuilderClass builder = new Level1();
       addObject(builder.prepareLevelsPlayer(), 55,270) ;
       addObject(builder.prepareGoal(), 410,297) ;
       ArrayList<Enemy> enemyAll = builder.prepareEnemy();
       addObject(enemyAll.get(0),250,193) ;
       addObject(enemyAll.get(1),517,100) ;

    }

    // Called when the player reaches home in Level One.
    // It removes walls, the enemies, the player and the
    // home from the world.  It then calls the method to
    // Prepare Level Two.
    public void endLevelOne()
    {
        removeObjects(getObjects(wallRect.class)); 
        removeObjects(getObjects(Enemy.class)); 
        removeObjects(getObjects(PlayerOne.class));
        removeObjects(getObjects(Home.class));
        prepareLevelTwo();
    }
    
    // Prepares Level Two with the walls, the player,
    // the enemies and the gem.
    public void prepareLevelTwo()
    {
        wallRectTwo block ;

        // OUTSIDE RECTANGLE
       
        // make a vertical wall 15 unts long starting at (575, 162) - Ã
        for (int i = 6 ; i < 21 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 575, 27 * i) ;
        }

        // make a vertical wall 15 unts long starting at (53, 54) - Ã
        for (int i = 2 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 53, 27 * i) ;
        }
        
        // make a horizontal wall 20 units long starting at point (54, 50) - Ã
        for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 27 * i, 50) ;
        }

        // make a horizontal wall 20 units long starting at point (54, 550) - Ã
        for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 27 * i, 550) ;
        }        
        
        
        // FIRST COLUMN        
        // make a vertical wall 14 unts long starting at (150, 162) - Ã
        for (int i = 6 ; i < 20 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 150, 27 * i) ;
        }

        // SECOND COLUMN        
        // make a vertical wall 11 unts long starting at (255, 162) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 255, 27 * i) ;
        }
       
        // THIRD COLUMN        
        // make a vertical wall 11 unts long starting at (360, 162) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 360, 27 * i) ;
        }
       
        // FOURTH COLUMN       
        // make a vertical wall 14 unts long starting at (475, 81) - Ã
        for (int i = 3 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 475, 27 * i) ;
        }
    
       
       BuilderClass builder = new Level2();
       addObject(builder.prepareLevelsPlayer(), 67,495) ;
       addObject(builder.prepareGoal(), 555,106) ;
       ArrayList<Enemy> enemyAll = builder.prepareEnemy();
       addObject(enemyAll.get(0),110,100) ;
       addObject(enemyAll.get(1),225,500) ;
       addObject(enemyAll.get(2),300,300) ;
       
    }
    
    // Called when the player reaches home in Level Two.
    // It removes walls, the enemies, the player and the
    // home from the world.  It then calls the method to
    // Prepare Level Three.
    public void endLevelTwo()
    {
        removeObjects(getObjects(wallRect.class));
        removeObjects(getObjects(Enemy.class));
        removeObjects(getObjects(PlayerTwo.class));
        removeObjects(getObjects(Home.class));
        prepareLevelThree();
    }
    
    // Prepares Level Three with the walls, the player,
    // the enemies and the gem.
    public void prepareLevelThree()
    {
       wallRectThree block ;

        // OUTSIDE RECTANGLE
       
        // make a vertical wall 15 unts long starting at (575, 162) - Ã
        for (int i = 6 ; i < 21 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 575, 27 * i) ;
        }

        // make a vertical wall 15 unts long starting at (25, 54) - Ã
        for (int i = 2 ; i < 17 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 25, 27 * i) ;
        }
        
        // make a horizontal wall 21 units long starting at point (54, 50) - Ã 
        for (int i =1 ; i < 22 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 27 * i, 50) ;
        }

        // make a horizontal wall 21 units long starting at point (27, 550) - Ã
        for (int i = 1 ; i < 22 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 27 * i, 550) ;
        }        
        
        
        // COLUMNS IN ORDER       
        // FIRST COLUMN
        // make a vertical wall 12 units long starting at (130, 54) - Ã
        for (int i = 2 ; i < 14 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 130, 27 * i) ;
        }
        
        // make a vertical wall 3 unts long starting at (130, 459) - Ã
        for (int i = 17 ; i < 20 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 130, 27 * i) ;
        }
      
        
        // SECOND COLUMN
        // make a vertical wall 10 unts long starting at (240, 54) - Ã
        for (int i = 2 ; i < 12 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 240, 27 * i) ;
        }
           
        // make a vertical wall 5 unts long starting at (240, 405) - Ã
        for (int i = 15 ; i < 20 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 240, 27 * i) ;
        }
        
        
        // THIRD COLUMN
        // make a vertical wall 8 unts long starting at (350, 54) - Ã
        for (int i = 2 ; i < 10 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 350, 27 * i) ;
        }
           
        // make a vertical wall 5 unts long starting at (350, 221) - Ã
        for (int i = 13 ; i < 20 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 350, 27 * i) ;
        }
        
        
        // FOURTH COLUMN
        // make a vertical wall 5 unts long starting at (493, 81) - Ã
        for (int i = 3 ; i < 8 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 453, 27 * i) ;
        }
    
        // make a vertical wall 5 unts long starting at (453, 297) - Ã
        for (int i = 11 ; i < 20 ; i++)
        {
            block = new wallRectThree() ;
            addObject(block, 453, 27 * i) ;
        }
        

      
              
       BuilderClass builder = new Level3();
       addObject(builder.prepareLevelsPlayer(), 30,495) ;
       addObject(builder.prepareGoal(), 577,106) ;
       ArrayList<Enemy> enemyAll = builder.prepareEnemy();
       addObject(enemyAll.get(0),75,100) ;
       addObject(enemyAll.get(1),180,200) ;
       addObject(enemyAll.get(2),290,300) ;
       addObject(enemyAll.get(3),400,400) ;
       addObject(enemyAll.get(4),505,500) ;
    }
    
    // Called when the player reaches home in Level Three.
    // It removes walls, the enemies, the player and the
    // home from the world.  It then calls the method to
    // Prepare Level Four.
    public void endLevelThree()
    {
        removeObjects(getObjects(wallRect.class));
        removeObjects(getObjects(Enemy.class));
        removeObjects(getObjects(PlayerThree.class));
        removeObjects(getObjects(Home.class));
        prepareLevelFour();
    }
    
    // Prepares Level Four with the walls, the player,
    // the enemies and the key.
    public void prepareLevelFour()
    {
        wallRectFour block ;

       // OUTSIDE OUTER RECTANGLE
       
       // make a vertical wall 19 units long starting at (575, 54) - Ã
        for (int i = 2 ; i < 21 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, 575, 27 * i) ;
        }

       // make a horizontal wall 20 units long starting at point (54, 50) - Ã
        for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, 27 * i, 50) ;
        }

        // make a horizontal wall 20 units long starting at point (54, 550) - Ã
        for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, 27 * i, 550) ;
        }        

        // make a vertical wall 14 unts long starting at (58, 65) - Ã
        for (int i = 2 ; i < 16 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, 58, (27 * i)+11) ;
        }  
             

        // INSIDE MAZE
        // make a horizontal wall 10 units long starting at point (189, 150) - Ã
        for (int i =7 ; i < 17 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, (27 * i), 150) ;
        }      

        // make a vertical wall 14 unts long starting at (175, 162) - Ã
        for (int i = 6 ; i < 20 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, 175, 27 * i) ;
        }

        // make a horizontal wall 10 units long starting at point (315, 450) - Ã
        for (int i = 11 ; i < 21 ; i++)
        {
            block = new wallRectFour() ;
            addObject(block, ((27 * i)+18), 450) ;
        }  

        // make a horizontal wall 10 units long starting at point (194, 355) - Ã
        for (int i = 7; i < 17; i++)
       {
           block = new wallRectFour();
           addObject(block, (27*i)+5, 355);
        }

       // make a horizontal wall 10 units long starting at point (302, 245) - Ã
       for (int i = 11; i < 21; i++)
       {
           block = new wallRectFour();
           addObject(block, (27*i)+5, 245);
        }

       
        
       BuilderClass builder = new Level4();
       addObject(builder.prepareLevelsPlayer(), 75,485) ;
       addObject(builder.prepareGoal(), 500,500) ;
       ArrayList<Enemy> enemyAll = builder.prepareEnemy();
       addObject(enemyAll.get(0),220,194) ;
       addObject(enemyAll.get(1),525,100) ;
       addObject(enemyAll.get(2),220,400) ;
       addObject(enemyAll.get(3),525,300) ;
    }
    
    // Called when the player reaches home in Level Four.
    // It removes walls, the enemies, the player and the
    // key from the world.  It then calls the method to
    // Prepare the "You Won!" screen.
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
