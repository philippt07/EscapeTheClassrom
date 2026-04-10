import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;

    /**
     * Erschaffe eine Welt mit 15 * 12 Zellen.
     */
    public Planet()
    {
        super(16, 12, zellenGroesse);
        setBackground("images/boden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20); 
        prepare();
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rover rover = new Rover();
        addObject(rover,2,1);
        Rover rover2 = new Rover();
        addObject(rover2,2,2);
        Rover rover3 = new Rover();
        addObject(rover3,2,3);
        Rover rover4 = new Rover();
        addObject(rover4,2,4);
        Rover rover5 = new Rover();
        addObject(rover5,2,5);
        Rover rover6 = new Rover();
        addObject(rover6,2,6);
        Rover rover7 = new Rover();
        addObject(rover7,5,1);
        Rover rover8 = new Rover();
        addObject(rover8,5,2);
        Rover rover9 = new Rover();
        addObject(rover9,5,3);
        Rover rover10 = new Rover();
        addObject(rover10,5,4);
        Rover rover11 = new Rover();
        addObject(rover11,5,5);
        Rover rover12 = new Rover();
        addObject(rover12,5,6);
        Rover rover13 = new Rover();
        addObject(rover13,2,7);
        Rover rover14 = new Rover();
        addObject(rover14,5,7);
        Rover rover15 = new Rover();
        addObject(rover15,3,4);
        Rover rover16 = new Rover();
        addObject(rover16,4,4);
        rover14.setLocation(4,11);
        removeObject(rover14);
    }
}