import greenfoot.*;
import java.util.ArrayList;

public class Level1 extends BuilderClass   
{
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(600, 400, 1); 
    }
    
    public InteractiveMover prepareLevelsPlayer()
    {
        PlayerOne player = new PlayerOne() ;       
        return player;
    }
    
    public Goal prepareGoal(){
        BlueGem blueGem = new BlueGem() ;
        return blueGem;
    }
    
    public ArrayList<Enemy> prepareEnemy(){
        // Enemy objects
        ArrayList<Enemy> enemyAll =  new ArrayList<Enemy>();
        EnemyVert enemy = new EnemyVert() ;
        EnemyVert enemy1 = new EnemyVert() ;
                
        enemyAll.add(enemy);
        enemyAll.add(enemy1);
        return enemyAll;
    }
}
