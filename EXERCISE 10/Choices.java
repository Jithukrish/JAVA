/*5. Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and circle. Draw the corresponding shapes for given parameters as per user’s choice.*/


import java.awt.*;
import java.awt.event.*;

public class Choices extends Frame implements ItemListener
{
    Choice shapes;
    String str;

    public Choices()
    {

    // Use a flow layout.
    setLayout(new FlowLayout());
    // Create choice lists.
    shapes = new Choice();
   
    shapes.add("Rectangle");
    shapes.add("Triangle");
    shapes.add("Square");
    shapes.add("Circle");
   
    add(shapes);
   
    shapes.addItemListener(this);
   
    addWindowListener(new WindowAdapter()
    {
    public void windowClosing(WindowEvent we)
    {
    System.exit(0);
    }
    });
    }
   
    public void itemStateChanged(ItemEvent ie)
    {
    str=shapes.getSelectedItem();
    repaint();
    }
   
    public void paint(Graphics g)
    {
    if(str.equals("Rectangle"))
    {
    g.setColor(Color.pink);
    g.fillRect(50,40,150,100);
    }
   
    else if(str.equals("Triangle"))
    {
    Color c1=new Color(255,100,100);
    int xpoints[]={75,155,235};
    int ypoints[]={85,43,85};
    int num=3;
    g.setColor(c1);
    g.fillPolygon(xpoints,ypoints,num);
    }
   
    else if(str.equals("Square"))
    {
    Color c2=new Color(100,200,100);
    g.setColor(c2);
    g.fillRect(70,40,100,100);
    }
   
    else if(str.equals("Circle"))
    {
    Color c3=new Color(100,100,150);
    g.setColor(c3);
    g.fillOval(75,40,100,100);
    }
   
    else{}
    }
   
    public static void main(String[] args)
    {
    Choices appwin=new Choices();
   
    appwin.setSize(new Dimension(250,250));
    appwin.setTitle("Choice");
    appwin.setVisible(true);
    }
}
