package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ShapeDemo.class" width=200 height=200></applet> */
public class ShapeDemo extends Applet {
    Label lblRec,lblFillRec,lblArc;
    Panel panelUp,panelDown;

    public void paint(Graphics g) {
        panelUp=new Panel();
        panelDown=new Panel();
        
        lblRec=new Label("Rectangle");
        lblFillRec=new Label("Filled Rectangle");
        lblArc=new Label("Arc");
        
        g.drawLine(25,25,100,25);
        g.drawLine(35,35,100,35);
        panelDown.add(lblRec);
        g.drawRect(25,40,100,50); 
        panelDown.add(lblFillRec);
        g.fillRect(145,40,100,50); 
        panelDown.add(lblArc);
        g.drawArc(25,345,100,50,25,75); 
        
        
        panelDown.setLayout(new GridLayout(3,2));
        panelUp.setLayout(new FlowLayout());
        
        add(panelUp);
        add(panelDown);
    }
}
