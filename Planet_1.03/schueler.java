import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class schueler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class schueler extends Actor
{
    /**
     * Act - do whatever the schueler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if (Greenfoot.isKeyDown("A")){
          this.setLocation(this.getX()-2,this.getY());
       }
       
       if (Greenfoot.isKeyDown("D")){
          this.setLocation(this.getX()+2,this.getY());
       }

       if (Greenfoot.isKeyDown("S")){
          this.setLocation(this.getX(),this.getY()-2);
        }
        
       if (Greenfoot.isKeyDown("W")){
          this.setLocation(this.getX(),this.getY()+2);
       }
}
}
