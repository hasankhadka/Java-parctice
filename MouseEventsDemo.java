
import java.awt.*;
import java.awt.event.*;
public class MouseEventsDemo  extends Frame implements MouseListener, MouseMotionListener{

    String msg = " ";
    int mouseX = 0, mouseY = 0;

    public MouseEventsDemo(){
        addMouseListener (this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());

    }
    //handle mouse clicked

    public void mouseClicked(MouseEvent me){
        msg = msg + "--Click received";
        repaint();
    }

    //Handle mouse entered
    public void mouseEntered(MouseEvent me){
        mouseX = 100;
        mouseY = 100;

        msg = "Mouse Entered";
        repaint();
    }

    //Handle mouse exited 

    public void mouseExited(MouseEvent me){
        mouseX = 100; 
        mouseY = 100; 
        msg = "Mouse Exited";
        repaint();
    }
    //handle buttton pressed
    public void mousePressed(MouseEvent me){
        //save coordinates
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Button Down";
        repaint(); 
    }
    // handle button released

    public void mouseReleased(MouseEvent me){
        //save coordinates 
        mouseX = me.getX();
        mouseY = me.getY();

        msg="Button Released";
        repaint();
    }
    //handle mouse dragged
    public void mouseDragged(MouseEvent me){
        //save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + "mouse at " + mouseX + "," + mouseY; 
        repaint();
    }
    //handle mouse moved
    public void mouseMoved(MouseEvent me){
        msg = "Moving mouse at" + me.getX() + ","  + me.getY();
        repaint();
    }
    
    //Display msg in the window at current X, Y location 

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("MouseEventsDemo");
        appwin.setVisible(true);
    }
}

//when the close box in the frame is clicked 
//close the window and exit the program 
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}