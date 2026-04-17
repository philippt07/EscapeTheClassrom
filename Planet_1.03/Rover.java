import greenfoot.*;
import java.util.ArrayList;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Rover extends Actor
{
    int z;
    int gridX=10;
    int gridY=10;
    int tarX = 5;
    int tarY = 5;
    Node[][] nodes;
    List<Node> openNodes   = new ArrayList<>();
    List<Node> closedNodes = new ArrayList<>();
    public void act() 
    {
       if(z==0)
       {
        nodes = new Node[gridX+1][gridY+1];
        for(int x = gridX; x > 0; x--)
        {
            for(int y = gridY; y > 0; y--)
            {
                Node n = new Node();
                getWorld().addObject(n, x, y);
                n.thisX = x;
                n.thisY = y;
                n.rover = this;
                nodes[x][y] = n;
            }   
        }
        z++;
       }
       findPath();
       if(getX() != tarX || getY() != tarY)
       {
        executePath();
       }
    } 

    public void findPath()
    {
        openNodes.clear();
        closedNodes.clear();
        openNodes.add(nodes[getX()][getY()]);
        int ramX = getX();
        int ramY = getY();
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

        n.calculateCost(getX(), getY(), tarX, tarY);
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

    /**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung („links“ oder „rechts“) übergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
        }
        else
        {
            
        }
    }

    /**
     * Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Klasse Gestein befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean gesteinVorhanden()
    {
        if(getOneIntersectingObject(Gestein.class)!=null)
        {
           
            return true;

        }

        return false;
    }

    /**
     * Der Rover überprüft, ob sich in richtung ("rechts", "links", oder "vorne") ein Objekt der Klasse Huegel befindet.
     * Das Ergebnis wird auf dem Display angezeigt.
     * Sollte ein anderer Text (String) als "rechts", "links" oder "vorne" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */


    /**
     * Der Rover ermittelt den Wassergehalt des Gesteins auf seiner Position und gibt diesen auf dem Display aus.
     * Sollte kein Objekt der Klasse Gestein vorhanden sein, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void analysiereGestein()
    {
        if(gesteinVorhanden())
        {
          
            Greenfoot.delay(1);
            removeTouching(Gestein.class);
        }
        else 
        {
           
        }
    }

    /**
     * Der Rover erzeugt ein Objekt der Klasse „Markierung“ auf seiner Position.
     */
    public void setzeMarke()
    {
        getWorld().addObject(new Marke(), getX(), getY());
    }

    /**
     * *Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Marke befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean markeVorhanden()
    {
        if(getOneIntersectingObject(Marke.class)!=null)
        {
            return true;
        }

        return false;
    }

    public void entferneMarke()
    {
        if(markeVorhanden())
        {
            removeTouching(Marke.class);
        }
    }

    class Display extends Actor
    {
        GreenfootImage bild; 

        public Display()
        {
          bild = getImage();
        }

        public void act() 
        {

        }  

        public void anzeigen(String pText)
        {
           loeschen();
           getImage().drawImage(new GreenfootImage(pText, 25, Color.BLACK, new Color(0, 0, 0, 0)),10,10);

        }

        public void loeschen()
        {
            getImage().clear();
            setImage("images/nachricht.png");
        }

    }
}
