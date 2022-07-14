/*1. Program to draw Circle, Rectangle, Line*/
import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo extends Frame {

public GraphicsDemo() {
// Anonymous inner class to handle window close events.
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {



// Draw lines.
g.setColor(Color.yellow);

g.drawLine(10, 100, 300, 100);



// Draw rectangles.
g.setColor(Color.red);

//g.drawRect(10, 150, 80, 60);
g.fillRect(10, 150, 80, 60);


// Draw Elipses and Circles
g.setColor(Color.cyan);
g.fillOval(10, 250, 100, 100);
g.drawOval(10, 250, 100, 100);




}

public static void main(String[] args) {
GraphicsDemo appwin = new GraphicsDemo();

appwin.setSize(new Dimension(800, 620));
appwin.setTitle("Ak Graphics");
appwin.setVisible(true);
}
}
