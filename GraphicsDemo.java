/**2. Using 2D graphics commands in an Applet, construct a house.On mouse click event, change the color of the door from blue to red.*/

import java.awt.*;
import java.awt.event.*;

class GraphicsDemo extends Frame
 implements MouseListener{ 
	Color c2=new Color(0,0,255);      
                
public GraphicsDemo(){
	addMouseListener(this);
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we) {
        System.exit(0);
        }
       });
      }


public void paint(Graphics g) {

// Draw a polygon
g.setColor(Color.red);
int xpoints[] = {80, 200, 320  };
int ypoints[] = {150, 75, 150};
int num = 3;

g.fillPolygon(xpoints, ypoints, num);

g.setColor(Color.green);
g.fillRect(90, 150, 219, 139);

g.setColor(c2);
g.fillRect(175, 180, 50, 110);

}
public void mouseClicked(MouseEvent me){
c2=new Color(255,0,0);
repaint();
}

public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}

public static void main(String[] args) {
GraphicsDemo appwin = new GraphicsDemo();

appwin.setSize(new Dimension(500, 400));
appwin.setTitle("GraphicsDemo");
appwin.setVisible(true);
}
} 
