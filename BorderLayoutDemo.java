import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class BorderLayoutDemo extends Frame {
    public BorderLayoutDemo(){

        add(new Button("this is across the  top"),BorderLayout.NORTH);
        add(new Label("the footer message mght go here."),BorderLayout.SOUTH);
        add(new Button("Right"),BorderLayout.EAST);
         add(new Button("left"),BorderLayout.WEST);
         String msg="the Responsable man adapts " + "himself to  the world; \n" + "the unreasonable  one persists in " + "trying to adapt the world; \n" + "therefore all progress depends " + "on the unreasonable man. \n]n" + "george bernard shaw\n\n";
         add(new TextArea(msg), BorderLayout.CENTER);
         addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowAdapter we){
                System.exit(0);
            }
         });
    }

    
    public static void main(String[]args){
        BorderLayoutDemo appwin=new BorderLayoutDemo();
        appwin.setSize(new Dimension(300,220));
        appwin.setTitle("BorderLayoutDemo");
        appwin.setVisible(true);
    }
}
 