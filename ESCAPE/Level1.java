import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1184, 736, 1); 
        setBackground("images/boden01.png");
        prepare();
    }
    
    private void prepare()
    {
        baueRaum(0,0,36,22);
        baueRaum(1,5,2,5);
        baueRaum(5,5,15,5);
        baueRaum(5,6,5,8);
        baueRaum(15,3,15,4);
        baueRaum(12,6,12,12);
        baueRaum(5,12,10,12);
        baueRaum(5,10,5,11);
        Lehrer lehrer = new Lehrer();
        addObject(lehrer,33,33);
    }

private void baueRaum(int x1, int y1, int x2, int y2)
{
    final int t = 32;

    // OBEN + UNTEN
    for(int x = x1; x <= x2; x++)
    {
        addObject(new Wand(), x * t+16, y1 * t+16);
        addObject(new Wand(), x * t+16, y2 * t+16);
    }

    // LINKS + RECHTS
    for(int y = y1 + 1; y < y2; y++)
    {
        
        addObject(new Wand(), x1 * t+16, y * t+16);
        addObject(new Wand(), x2 * t+16, y * t+16);
    }
}
}
