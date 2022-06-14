//1. Program to draw Circle, Rectangle, Line



import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo1 extends Frame {

public GraphicsDemo1() {
// Anonymous inner class to handle window close events.
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {
g.setColor(Color.red);
// Draw lines.
g.drawLine(20, 100, 100, 100);


// Draw rectangles.

g.setColor(Color.orange);
g.fillRect(20, 150, 60, 50);

// Draw Circles
g.setColor(Color.pink);
g.fillOval(20, 250, 60, 60);

}

public static void main(String[] args) {
GraphicsDemo1 appwin = new GraphicsDemo1();

appwin.setSize(new Dimension(370, 700));
appwin.setTitle("GraphicsDemo1");
appwin.setVisible(true);
}
}
