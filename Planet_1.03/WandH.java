import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Huege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WandH extends Actor
{
    private int steigung;

    public WandH()
    {
        steigung = Greenfoot.getRandomNumber(30)+31;
        setImage("images/Wand02.png");
    }

    public void act() 
    {
    } 

    public int getSteigung()
    {
        return steigung;
    }
}

