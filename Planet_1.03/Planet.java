import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 10 * 10 Feldern.
 */

public class Planet extends World
{
    

    /**
     * Erschaffe eine Welt mit 20 * 16 Zellen.
     */
    public Planet()
    {
        super(736, 736, 1);
        setBackground("images/boden01.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class);
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
        addObject(rover,1,1);

    }
}