import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node extends Actor
{
    
    public int thisX;
    public int thisY;
    
    public float gCost;
    int gCostX;
    int gCostY;
    public float hCost;
    int hCostX;
    int hCostY;
    public float fCost;
    
    public Node parent;
    public int py;
    public int px;
    public void act()
    {
                if(parent != null)
        {
        py = parent.thisY;
        px = parent.thisX;
    }
    }
    
     public void setX(int x)
    {
      thisX = x;
    }
    
    public void setY(int y)
    {
      thisY = y;
    }
    
    public void calculateCost(int currX,int currY, int tarX, int tarY)
    {

        //hCost
        if(tarX >= thisX)
        {
           hCostX =  tarX - thisX;
        }
        else 
        {
           hCostX = thisX - tarX;
        }
        
        if(tarY >= thisY)
        {
            hCostY =  tarY - thisY;
        }
        else
        {
            hCostY =  thisY - tarY;
        }
        
        if(hCostX >= hCostY)
        {
            hCost = 1.4f * hCostY + (hCostX - hCostY) ;
        }
        else
        {
            hCost = 1.4f * hCostX + (hCostY - hCostX) ;
        }
        
        //gCost
        if(currX >= thisX)
        {
           gCostX =  currX - thisX;
        }
        else 
        {
           gCostX = thisX - currX;
        }
        
        if(currY >= thisY)
        {
            gCostY =  currY - thisY;
        }
        else
        {
            gCostY =  thisY - currY;
        }
        
        if(gCostX >= gCostY)
        {
            gCost = 1.4f * gCostY + (gCostX - gCostY);
        }
        else
        {
            gCost = 1.4f * gCostX + (gCostY - gCostX);
        }
        
        //fCost
        
        
       if(getOneIntersectingObject(Huegel.class)!=null)
       {
            fCost = 1000000;
       }
       else
       {
        fCost = gCost + hCost;
       }
    }
}
