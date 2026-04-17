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
    int tarX = 0;
    int tarY = 0;
    Node[][] nodes;
    List<Node> openNodes   = new ArrayList<>();
    List<Node> closedNodes = new ArrayList<>();
    List<Node> path = new ArrayList<>();
    public int currentNode = 1;
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
        findPath(20,20);
        path = buildPath();
    }
    if(getX() != nodes[tarX][tarY].getX()||getY() != nodes[tarX][tarY].getY())
    executePath();
    }   
    
    public void findPath(int setX, int setY)
    {
        tarX=setX;
        tarY=setY;
        openNodes.clear();
        closedNodes.clear();
        openNodes.add(nodes[getNearestNode().thisX][getNearestNode().thisY]);
        int ramX = getNearestNode().thisX;
        int ramY = getNearestNode().thisY;
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
    
public Node getNearestNode()
{
    List<Node> nodes = getObjectsInRange(16, Node.class);

    if (nodes.isEmpty())
    {
        return null;
    }

    return nodes.get(0);
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

    
        public void executePath() {
            Node next = new Node();

              next = path.get(currentNode);
            

            
            if(getX()!= next.getX()&& getY()!= next.getY())
            {
              if(getX() > next.getX())
              {
                this.setLocation(getX()-1,getY());
              }
              else
              {
                this.setLocation(getX()+1,getY()); 
              }
              
              if(getY() > next.getY())
              {
                this.setLocation(getX(),getY()-1);
              }
              else
              {
                this.setLocation(getX(),getY()+1); 
              }
            
            }
            else
            {
            currentNode++;
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
    
    public void setCourse(int x, int y)
    {
        
        path = buildPath();
        openNodes.clear();
        closedNodes.clear();
        findPath(x,y);
    }
}
