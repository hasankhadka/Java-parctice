package events;
import java.awt.*;
import java.awt.event.*;
public class SimpleKey extends Frame
        implements KeyListener {
            String msg = "";
            String keyState ="";
            public SimpleKey(){
                addKeyListener(this);
                addWindowListener(new MyWindowAdapter());
            }

            public void keyPressed(KeyEvent ke){
                keyState = "Key Down";
                repaint();
            }

            public void keyReleased(KeyEvent ke){
                keyState ="Key Up";
                repaint();
            }

            public void keyTyped(KeyEvent ke){
                msg +=ke.getKeyChar();
                repaint();
            }

            public void paint (Graphics g){
                g.drawString(msg,20,100);
                g.drawString(keyState,20,50);
            }

            public static void main(String[] args) {
                SimpleKey appwin = new SimpleKey();
                appwin.setSize(new Dimension(200,150));
                appwin.setTitle("SimpleKey");
                appwin.setVisible(true);
            }
        }

class MyWindowAdapter extends WindowAdapter{
    public void WindowClosing(WindowEvent we){
        System.exit(0);
    }
}

