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

        CornerOL cornerOL = new CornerOL();
        addObject(cornerOL,0,0);
        CornerUR cornerUR = new CornerUR();
        addObject(cornerUR,14,11);
        CornerOR cornerOR = new CornerOR();
        addObject(cornerOR,14,0);
        CornerUL cornerUL = new CornerUL();
        addObject(cornerUL,1,11);
        cornerUL.setLocation(0,11);
        WandH wandH = new WandH();
        addObject(wandH,1,0);
        WandH wandH2 = new WandH();
        addObject(wandH2,2,0);
        WandH wandH3 = new WandH();
        addObject(wandH3,3,0);
        WandH wandH4 = new WandH();
        addObject(wandH4,4,0);
        WandH wandH5 = new WandH();
        addObject(wandH5,5,0);
        WandH wandH6 = new WandH();
        addObject(wandH6,6,0);
        WandH wandH7 = new WandH();
        addObject(wandH7,7,0);
        WandH wandH8 = new WandH();
        addObject(wandH8,8,0);
        WandH wandH9 = new WandH();
        addObject(wandH9,9,0);
        WandH wandH10 = new WandH();
        addObject(wandH10,10,0);
        WandH wandH11 = new WandH();
        addObject(wandH11,11,0);
        WandH wandH12 = new WandH();
        addObject(wandH12,12,0);
        WandH wandH13 = new WandH();
        addObject(wandH13,13,0);
        WandH wandH14 = new WandH();
        addObject(wandH14,13,11);
        WandH wandH15 = new WandH();
        addObject(wandH15,12,11);
        WandH wandH16 = new WandH();
        addObject(wandH16,11,11);
        WandH wandH17 = new WandH();
        addObject(wandH17,10,11);
        WandH wandH18 = new WandH();
        addObject(wandH18,9,11);
        WandH wandH19 = new WandH();
        addObject(wandH19,8,11);
        WandH wandH20 = new WandH();
        addObject(wandH20,7,11);
        WandH wandH21 = new WandH();
        addObject(wandH21,6,11);
        WandH wandH22 = new WandH();
        addObject(wandH22,5,11);
        WandH wandH23 = new WandH();
        addObject(wandH23,4,11);
        WandH wandH24 = new WandH();
        addObject(wandH24,3,11);
        WandH wandH25 = new WandH();
        addObject(wandH25,2,11);
        WandH wandH26 = new WandH();
        addObject(wandH26,1,11);
        WandV wandV = new WandV();
        addObject(wandV,0,1);
        WandV wandV2 = new WandV();
        addObject(wandV2,0,2);
        WandV wandV3 = new WandV();
        addObject(wandV3,0,3);
        WandV wandV4 = new WandV();
        addObject(wandV4,0,4);
        WandV wandV5 = new WandV();
        addObject(wandV5,0,5);
        WandV wandV6 = new WandV();
        addObject(wandV6,0,6);
        WandV wandV7 = new WandV();
        addObject(wandV7,0,7);
        WandV wandV8 = new WandV();
        addObject(wandV8,0,8);
        WandV wandV9 = new WandV();
        addObject(wandV9,0,9);
        WandV wandV10 = new WandV();
        addObject(wandV10,0,10);
        WandV wandV11 = new WandV();
        addObject(wandV11,14,1);
        WandV wandV12 = new WandV();
        addObject(wandV12,14,2);
        WandV wandV13 = new WandV();
        addObject(wandV13,14,3);
        WandV wandV14 = new WandV();
        addObject(wandV14,14,4);
        WandV wandV15 = new WandV();
        addObject(wandV15,14,6);
        WandV wandV16 = new WandV();
        addObject(wandV16,14,7);
        WandV wandV17 = new WandV();
        addObject(wandV17,14,8);
        WandV wandV18 = new WandV();
        addObject(wandV18,14,9);
        WandV wandV19 = new WandV();
        addObject(wandV19,14,10);

        Void void2 = new Void();
        addObject(void2,15,1);
        Void void3 = new Void();
        addObject(void3,15,2);
        Void void4 = new Void();
        addObject(void4,15,3);
        Void void5 = new Void();
        addObject(void5,15,7);
        Void void6 = new Void();
        addObject(void6,15,8);
        Void void7 = new Void();
        addObject(void7,15,9);
        Void void8 = new Void();
        addObject(void8,15,10);
        Void void9 = new Void();
        addObject(void9,15,11);
        Void void10 = new Void();
        addObject(void10,15,12);
        Void void11 = new Void();
        addObject(void11,14,12);
        Void void12 = new Void();
        addObject(void12,13,12);
        Void void13 = new Void();
        addObject(void13,12,12);
        Void void14 = new Void();
        addObject(void14,11,12);
        Void void15 = new Void();
        addObject(void15,10,12);
        Void void16 = new Void();
        addObject(void16,8,12);
        Void void17 = new Void();
        addObject(void17,9,12);
        Void void18 = new Void();
        addObject(void18,7,12);
        Void void19 = new Void();
        addObject(void19,6,12);
        Void void20 = new Void();
        addObject(void20,5,12);
        Void void21 = new Void();
        addObject(void21,4,12);
        Void void22 = new Void();
        addObject(void22,3,12);
        Void void23 = new Void();
        addObject(void23,2,12);
        Void void24 = new Void();
        addObject(void24,0,12);
        Void void25 = new Void();
        addObject(void25,1,12);
        CornerOR cornerOR2 = new CornerOR();
        addObject(cornerOR2,16,6);
        CornerUL cornerUL2 = new CornerUL();
        addObject(cornerUL2,16,4);
        removeObject(cornerUL2);
        wandV14.setLocation(14,4);
        CornerOR cornerOR3 = new CornerOR();
        addObject(cornerOR3,14,4);
        wandV15.setLocation(14,6);
        CornerUR cornerUR2 = new CornerUR();
        addObject(cornerUR2,14,6);
        CornerOL cornerOL2 = new CornerOL();
        addObject(cornerOL2,16,4);
        WandH wandH27 = new WandH();
        addObject(wandH27,15,6);
        WandH wandH28 = new WandH();
        addObject(wandH28,15,4);
        CornerUR cornerUR3 = new CornerUR();
        addObject(cornerUR3,16,13);
        WandH wandH29 = new WandH();
        addObject(wandH29,15,13);
        WandH wandH30 = new WandH();
        addObject(wandH30,14,13);
        WandH wandH31 = new WandH();
        addObject(wandH31,13,13);
        WandH wandH32 = new WandH();
        addObject(wandH32,12,13);
        WandH wandH33 = new WandH();
        addObject(wandH33,10,13);
        WandH wandH34 = new WandH();
        addObject(wandH34,11,13);
        WandH wandH35 = new WandH();
        addObject(wandH35,9,13);
        WandH wandH36 = new WandH();
        addObject(wandH36,8,13);
        WandH wandH37 = new WandH();
        addObject(wandH37,7,13);
        WandH wandH38 = new WandH();
        addObject(wandH38,6,13);
        WandH wandH39 = new WandH();
        addObject(wandH39,5,13);
        WandH wandH40 = new WandH();
        addObject(wandH40,4,13);
        WandH wandH41 = new WandH();
        addObject(wandH41,3,13);
        WandH wandH42 = new WandH();
        addObject(wandH42,2,13);
        WandH wandH43 = new WandH();
        addObject(wandH43,1,13);
        WandH wandH44 = new WandH();
        addObject(wandH44,0,13);
        WandV wandV20 = new WandV();
        addObject(wandV20,16,12);
        WandV wandV21 = new WandV();
        addObject(wandV21,16,11);
        WandV wandV22 = new WandV();
        addObject(wandV22,16,10);
        WandV wandV23 = new WandV();
        addObject(wandV23,16,9);
        WandV wandV24 = new WandV();
        addObject(wandV24,16,8);
        WandV wandV25 = new WandV();
        addObject(wandV25,16,7);
        WandV wandV26 = new WandV();
        addObject(wandV26,16,3);
        WandV wandV27 = new WandV();
        addObject(wandV27,16,2);
        WandV wandV28 = new WandV();
        addObject(wandV28,16,1);
        WandV wandV29 = new WandV();
        addObject(wandV29,16,0);
        Void void30 = new Void();
        addObject(void30,15,0);
    }
}