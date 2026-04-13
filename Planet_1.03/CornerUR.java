import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Huege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CornerUR extends Actor
{
    private int steigung;

    public CornerUR()
    {
        steigung = Greenfoot.getRandomNumber(30)+31;
        setImage("images/corner03.png");
    }

    public void act() 
    {
    } 

    public int getSteigung()
    {
        return steigung;
    }
}

