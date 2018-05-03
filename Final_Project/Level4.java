import greenfoot.*;

import java.util.ArrayList;

public class Level4 extends BuilderClass
{
	public InteractiveMover prepareLevelsPlayer()
    {
       // Player object
      
      PlayerFour player = new PlayerFour() ;
       return player;
    }
    
    public Goal prepareGoal(){
        Key key = new Key();
        return key;
    }
    
    public ArrayList<Enemy> prepareEnemy(){
        // Enemy objects
        ArrayList<Enemy> enemyAll =  new ArrayList<Enemy>();
        // Enemy objects
       EnemyVert enemy = new EnemyVert() ;
       EnemyVert enemy1 = new EnemyVert() ;
       EnemyVert enemy2 = new EnemyVert() ;
       EnemyVert enemy3 = new EnemyVert() ;
        enemyAll.add(enemy);
        enemyAll.add(enemy1);
        enemyAll.add(enemy2);
        enemyAll.add(enemy3);
        return enemyAll;
    }
}
