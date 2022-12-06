
package lab_3;
import java.awt.*;
import java.awt.event.*;
public class CountDemo {
    CountDemo(){
       Frame f= new Frame("AWT Count");
       Panel p = new Panel(new FlowLayout());

       Label l= new Label("Count");
       TextField t= new TextField(10);
       Button b1 = new Button("Up");
       Button b2 = new Button("Down");
       Button b3 = new Button("Reset");

       p.add(l);
       p.add(t);
       p.add(b1);
       p.add(b2);
       p.add(b3);
       

       f.add(p);
       f.setSize(400,200);
       f.setLocationRelativeTo(null);
       f.setVisible(true);
       
       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int c = Integer.parseInt(t.getText());
               c++;
               t.setText(""+c);
           }
       });
       b2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int c = Integer.parseInt(t.getText());
               c--;
               t.setText(""+c);
           }
       });
       b3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int c = Integer.parseInt(t.getText());
               
               t.setText(" ");
           }
       });

       f.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });



   }

    public static void main(String[] args) {
        new CountDemo();
    }
}
