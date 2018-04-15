import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/*
 * Main character of game for Level Three ONLY.  Uses similar methods,
 * but called differently than the other Player classes.  Allows player
 * to move the character around, causes the player to be reset if he/she
 * should be eaten by a bug, has the house appear when the gem is reached,
 * and calls the End Level class.
 */

public class PlayerThree extends InteractiveMover
{    
    // Constructor
    public PlayerThree()
    {
        setRotation(0);
    }

    // When run or act is pressed, the player tests if he/she
    // can move, moves if he/she can, and tests if he/she has
    // found the enemy, the gem, or gone home.
    public void act() 
    {
        if (canMove())
        {
           processKeys();
        }
        touchEnemy();
        getGoal();
        goHome();
    }   
    }