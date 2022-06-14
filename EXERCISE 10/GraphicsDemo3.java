//1. Program to draw Circle, Rectangle, Line


import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo3 extends Frame 
{

	public GraphicsDemo3() 
	{
	// Anonymous inner class to handle window close events.
	addWindowListener(new WindowAdapter() 

	{
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
	});
	}


	public void paint(Graphics g) 
	{
	g.setColor(Color.red);
	// Draw lines.
	g.drawLine(20, 100, 100, 100);
	

	// Draw rectangles.
	g.setColor(Color.blue);
	g.fillRect(20, 150, 60, 50);
	
	// Draw Elipses and Circles
	g.setColor(Color.orange);
	g.fillOval(20, 250, 50, 50);
	
	}
	
	public static void main(String[] args) 
	{
	GraphicsDemo3 appwin = new GraphicsDemo3();

	appwin.setSize(new Dimension(370, 700));
	appwin.setTitle("GraphicsDemo3");
	appwin.setVisible(true);
	}
}
