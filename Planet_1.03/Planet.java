import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 10 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;

    /**
     * Erschaffe eine Welt mit 20 * 16 Zellen.
     */
    public Planet()
    {
        super(50, 50, zellenGroesse);
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
        addObject(rover,1,1);
        Huegel huegel = new Huegel();
        addObject(huegel,49,0);
        Huegel huegel2 = new Huegel();
        addObject(huegel2,49,1);
        Huegel huegel3 = new Huegel();
        addObject(huegel3,49,2);
        Huegel huegel4 = new Huegel();
        addObject(huegel4,49,3);
        Huegel huegel5 = new Huegel();
        addObject(huegel5,49,4);
        Huegel huegel6 = new Huegel();
        addObject(huegel6,49,5);
        huegel6.setLocation(49,6);
        Huegel huegel7 = new Huegel();
        addObject(huegel7,49,6);
        huegel7.setLocation(49,6);
        Huegel huegel8 = new Huegel();
        addObject(huegel8,49,6);
        Huegel huegel9 = new Huegel();
        addObject(huegel9,49,7);
        Huegel huegel10 = new Huegel();
        addObject(huegel10,49,8);
        Huegel huegel11 = new Huegel();
        addObject(huegel11,49,9);
        Huegel huegel12 = new Huegel();
        addObject(huegel12,49,10);
        Huegel huegel13 = new Huegel();
        addObject(huegel13,49,11);
        Huegel huegel14 = new Huegel();
        addObject(huegel14,49,12);
        Huegel huegel15 = new Huegel();
        addObject(huegel15,49,13);
        Huegel huegel16 = new Huegel();
        addObject(huegel16,49,14);
        Huegel huegel17 = new Huegel();
        addObject(huegel17,49,15);
        Huegel huegel18 = new Huegel();
        addObject(huegel18,49,16);
        Huegel huegel19 = new Huegel();
        addObject(huegel19,49,17);
        Huegel huegel20 = new Huegel();
        addObject(huegel20,49,18);
        Huegel huegel21 = new Huegel();
        addObject(huegel21,49,19);
        Huegel huegel22 = new Huegel();
        addObject(huegel22,49,20);
        Huegel huegel23 = new Huegel();
        addObject(huegel23,49,21);
        Huegel huegel24 = new Huegel();
        addObject(huegel24,49,22);
        Huegel huegel25 = new Huegel();
        addObject(huegel25,49,23);
        Huegel huegel26 = new Huegel();
        addObject(huegel26,49,24);
        Huegel huegel27 = new Huegel();
        addObject(huegel27,49,25);
        Huegel huegel28 = new Huegel();
        addObject(huegel28,49,26);
        Huegel huegel29 = new Huegel();
        addObject(huegel29,49,27);
        Huegel huegel30 = new Huegel();
        addObject(huegel30,49,28);
        Huegel huegel31 = new Huegel();
        addObject(huegel31,49,29);
        huegel31.setLocation(49,29);
        Huegel huegel32 = new Huegel();
        addObject(huegel32,49,29);
        Huegel huegel33 = new Huegel();
        addObject(huegel33,49,30);
        Huegel huegel34 = new Huegel();
        addObject(huegel34,49,31);
        Huegel huegel35 = new Huegel();
        addObject(huegel35,49,32);
        Huegel huegel36 = new Huegel();
        addObject(huegel36,49,33);
        Huegel huegel37 = new Huegel();
        addObject(huegel37,49,34);
        Huegel huegel38 = new Huegel();
        addObject(huegel38,49,35);
        Huegel huegel39 = new Huegel();
        addObject(huegel39,49,36);
        Huegel huegel40 = new Huegel();
        addObject(huegel40,49,37);
        huegel40.setLocation(49,37);
        Huegel huegel41 = new Huegel();
        addObject(huegel41,49,37);
        Huegel huegel42 = new Huegel();
        addObject(huegel42,49,38);
        Huegel huegel43 = new Huegel();
        addObject(huegel43,49,39);
        Huegel huegel44 = new Huegel();
        addObject(huegel44,49,40);
        Huegel huegel45 = new Huegel();
        addObject(huegel45,49,41);
        Huegel huegel46 = new Huegel();
        addObject(huegel46,49,42);
        Huegel huegel47 = new Huegel();
        addObject(huegel47,49,43);
        Huegel huegel48 = new Huegel();
        addObject(huegel48,49,44);
        huegel48.setLocation(49,44);
        Huegel huegel49 = new Huegel();
        addObject(huegel49,49,44);
        Huegel huegel50 = new Huegel();
        addObject(huegel50,49,46);
        Huegel huegel51 = new Huegel();
        addObject(huegel51,49,45);
        Huegel huegel52 = new Huegel();
        addObject(huegel52,49,47);
        huegel52.setLocation(49,47);
        Huegel huegel53 = new Huegel();
        addObject(huegel53,49,47);
        Huegel huegel54 = new Huegel();
        addObject(huegel54,49,48);
        Huegel huegel55 = new Huegel();
        addObject(huegel55,49,49);
    }
}