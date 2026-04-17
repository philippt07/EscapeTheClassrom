import greenfoot.*;
import java.util.ArrayList;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Lehrer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lehrer extends Actor
{
    int z;
    int gridX=37;
    int gridY=23;
    int tarX = 20;
    int tarY = 20;
    Node[][] nodes;
    List<Node> openNodes   = new ArrayList<>();
    List<Node> closedNodes = new ArrayList<>();
    public void act() 
    {
       if(z==0)
       {
           this.setLocation(16,16);
        nodes = new Node[gridX+1][gridY+1];
        for(int x = gridX; x > 0; x--)
        {
            for(int y = gridY; y > 0; y--)
            {
                Node n = new Node();
                getWorld().addObject(n, 32*x-16, 32*y-16);
                
                n.thisX = x;
                n.thisY = y;
                n.lehrer = this;
                nodes[x][y] = n;
                
            }   
        }
        z++;
        findPath();
    }
    }   
        public void findPath()
    {
        openNodes.clear();
        closedNodes.clear();
        openNodes.add(nodes[1][1]);
        int ramX = 1;
        int ramY = 1;
        findeUmgebung(ramX,ramY);
        while(!closedNodes.contains(nodes[tarX][tarY])&& !openNodes.isEmpty())
       {
            closedNodes.add(nodes[ramX][ramY]);
            openNodes.remove(nodes[ramX][ramY]);
            ramX = getLowestF().thisX;
            ramY = getLowestF().thisY;
            findeUmgebung(ramX,ramY);
       }  
    }
    
    public Node getLowestF()
    {
            Node best = openNodes.get(0);

            for(Node n : openNodes)
            {
               if(n.fCost < best.fCost)
               best = n;
            }

            return best;
    }
    
    public void findeUmgebung(int x, int y)
    {
        addOpen(x+1, y,x,y);
        addOpen(x-1, y,x,y);
        addOpen(x, y+1,x,y);
        addOpen(x, y-1,x,y);
    }
    
    public void addOpen(int x, int y,int px,int py)
    {
        if(x < 1 || x > gridX || y < 1 || y > gridY ) return;

        Node n = nodes[x][y];

        if(openNodes.contains(n) || closedNodes.contains(n)) return;

        n.calculateCost(1, 1, tarX, tarY);
        n.parent = nodes[px][py];
        openNodes.add(n);

    }
    
    public void fahre()
    {
        int posX = getX();
        int posY = getY();


        if(getRotation()==270 && getY()==1)
        {
     
        }
        else
        {
            move(1);
            Greenfoot.delay(1);
        }


    }
    
        public void executePath() {
        List<Node> path = buildPath();

        for(int i = 1; i < path.size(); i++) { 
            Node next = path.get(i);

            
            int dx = next.thisX - getX();
            int dy = next.thisY - getY();

            if(dx > 0) setRotation(0);     
            else if(dx < 0) setRotation(180); 
            else if(dy > 0) setRotation(90);  
            else if(dy < 0) setRotation(270); 

            fahre(); 
            
        }
    }
    public List<Node> buildPath() {
        List<Node> path = new ArrayList<>();
        Node current = nodes[tarX][tarY];
        
        while(current != null) {
            path.add(0, current); 
            current = current.parent;
        }
        return path;
    }
}
