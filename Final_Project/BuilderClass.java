import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class BuilderClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BuilderClass extends World
{

    /**
     * Constructor for objects of class BuilderClass.
     * 
     */
    public BuilderClass()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public abstract InteractiveMover prepareLevelsPlayer();
    public abstract Goal prepareGoal();
    public abstract ArrayList<Enemy> prepareEnemy();
}
