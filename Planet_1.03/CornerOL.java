import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Huege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CornerOL extends Actor
{
    private int steigung;

    public CornerOL()
    {
        steigung = Greenfoot.getRandomNumber(30)+31;
        setImage("images/corner01.png");
    }

    public void act() 
    {
    } 

    public int getSteigung()
    {
        return steigung;
    }
}

