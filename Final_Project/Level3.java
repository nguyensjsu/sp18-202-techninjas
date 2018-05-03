import greenfoot.*;

import java.util.ArrayList;

public class Level3 extends BuilderClass
{
	public InteractiveMover prepareLevelsPlayer()
	{
		// Player object
		PlayerThree player = new PlayerThree()   ; 
        return player;
		
	}

	public Goal prepareGoal(){
        OrangeGem orangeGem = new OrangeGem() ;
        return orangeGem;
    }
	
    public ArrayList<Enemy> prepareEnemy(){
        // Enemy objects
        ArrayList<Enemy> enemyAll =  new ArrayList<Enemy>();
        EnemyVert enemy = new EnemyVert();
		EnemyVert enemy1 = new EnemyVert();
		
		EnemyVert enemy2 = new EnemyVert();
		
		EnemyVert enemy3 = new EnemyVert();
		
		EnemyVert enemy4 = new EnemyVert();
		
        enemyAll.add(enemy);
        enemyAll.add(enemy1);
        enemyAll.add(enemy2);
        enemyAll.add(enemy3);
        enemyAll.add(enemy4);
        return enemyAll;
    }
}
