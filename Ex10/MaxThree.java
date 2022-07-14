import java.awt.*;
import java.awt.event.*;

public class MaxThree extends Frame
implements ActionListener {

TextField t1, t2,t3;

public MaxThree() {
// Use a flow layout.
setLayout(new FlowLayout());

// Create controls.
//Label namep = new Label("Name: ",
//Label.RIGHT);
//Label passp = new Label("Password: ",
//Label.RIGHT);
t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);

// Add the controls to the frame.
add(t1);
add(t2);
add(t3);

// Add action event handlers.
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);

addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

// User pressed Enter.
public void actionPerformed(ActionEvent ae) {
repaint();
}


	public void paint(Graphics g){
        int a, b, c,result;
        String str;

        g.drawString("Enter value to Check the Maximum of 3 ",10,50);

        str=t1.getText();
        a=Integer.parseInt(str);
        str=t2.getText();
        b=Integer.parseInt(str);
        str=t3.getText();
        c=Integer.parseInt(str);

        g.setColor(Color.blue);
        if (a>b) {
            if (a>c)
                result=a;
            else
                result=c;
        }
        else{
            if (b>c)
                result=b;
            else
                result=c;
        }
        g.drawString("Maximum of 3 No is "+result,10,70);
        g.drawString("MAXIMUM OF 3 NUMBERS",10,100);
    }



public static void main(String[] args) {
MaxThree appwin = new MaxThree();

appwin.setSize(new Dimension(380, 180));
appwin.setTitle("TextFieldDemo");
appwin.setVisible(true);
}
}
