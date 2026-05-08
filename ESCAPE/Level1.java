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
        baueRaum(6,6,30,16);
        Lehrer lehrer = new Lehrer();
        addObject(lehrer,33,33);
    }

private void baueRaum(int x1, int y1, int x2, int y2)
{
    final int t = 32;

    // OBEN + UNTEN
    for(int x = x1; x <= x2; x++)
    {
        addObject(new Wand(), x * t, y1 * t);
        addObject(new Wand(), x * t, y2 * t);
    }

    // LINKS + RECHTS
    for(int y = y1 + 1; y < y2; y++)
    {
        addObject(new Wand(), x1 * t, y * t);
        addObject(new Wand(), x2 * t, y * t);
    }
}
}
