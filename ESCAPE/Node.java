import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node extends Actor
{
    public Lehrer lehrer;
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
    
    public void clear()
    {
    parent = null;
    fCost= 0;
    setRotation(0);
    }
    
    public void setTar()
    {
       lehrer.setCourse(thisX,thisY);
       
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
        
        /*
       if(getOneIntersectingObject(CornerOL.class)!=null||getOneIntersectingObject(CornerOR.class)!=null||getOneIntersectingObject(CornerUL.class)!=null || getOneIntersectingObject(CornerUR.class)!=null || getOneIntersectingObject(WandH.class)!=null||getOneIntersectingObject(WandV.class)!=null)
       {
            fCost = 1000000;
       }
       else
       {**/
        fCost = gCost + hCost;
        setRotation(90);
       
    }
}

