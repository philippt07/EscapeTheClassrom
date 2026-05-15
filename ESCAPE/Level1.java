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
        baueRaum(15,8,15,12);
        baueRaum(16,8,17,8);
        baueRaum(16,12,19,12);
        baueRaum(19,8,19,11);
        baueRaum(3,8,4,8);
        baueRaum(3,9,3,12);
        baueRaum(22,5,22,14);
        baueRaum(18,5,25,5);
        baueRaum(18,1,18,4);
        baueRaum(3,20,15,20);
        baueRaum(18,20,33,20);
        baueRaum(33,17,33,19);
        baueRaum(33,14,33,15);
        baueRaum(28,14,32,14);
        baueRaum(28,15,28,19);
        baueRaum(15,15,15,19);
        baueRaum(3,15,3,19);
        baueRaum(9,16,9,19);
        baueRaum(6,15,12,15);
        baueRaum(4,15,4,15);
        baueRaum(14,15,14,15);
        baueRaum(18,15,18,19);
        baueRaum(25,1,25,3);
        baueRaum(28,12,35,12);
        baueRaum(28,1,28,5);
        baueRaum(28,7,28,9);
        baueRaum(28,11,28,11);
        baueRaum(29,7,35,7);
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
