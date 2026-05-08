import greenfoot.*;
import java.util.ArrayList;
import java.util.List;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wand extends Actor
{
    int r = 0;
    public void act()
    {
        if( r == 0)
        {

          this.setLocation(getX()+16,getY()+16); 
          r++;
        }
        
    }
    
}
