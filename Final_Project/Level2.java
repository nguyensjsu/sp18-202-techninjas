import greenfoot.*;

import java.util.ArrayList;

public class Level2 extends BuilderClass 
{
    public InteractiveMover prepareLevelsPlayer()
    {
        // Player object
        PlayerTwo player = new PlayerTwo() ;       
        return player;
               
    }
    
    public ArrayList<Enemy> prepareEnemy(){
        // Enemy objects
        ArrayList<Enemy> enemyAll =  new ArrayList<Enemy>();
        // Enemy objects
        EnemyHoriz enemy = new EnemyHoriz() ;
        EnemyHoriz enemy1 = new EnemyHoriz() ;
        EnemyVert enemy2 = new EnemyVert();
        
        enemyAll.add(enemy);
        enemyAll.add(enemy1);
        enemyAll.add(enemy2);
        return enemyAll;
    }
    
    public Goal prepareGoal(){
        // GreenGem object
        GreenGem greenGem = new GreenGem() ;
        return greenGem;
    }

}
