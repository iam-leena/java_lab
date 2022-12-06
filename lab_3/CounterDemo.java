
package lab_3;
import java.awt.*;
import java.awt.event.*;
public class CounterDemo {
   public CounterDemo(){
       Frame f= new Frame("AWT CounterDemo");
       Panel p = new Panel(new FlowLayout());

       Label l= new Label("Enter an integer:");
       TextField t= new TextField(10);
       Button b = new Button("Count Down");

       p.add(l);
       p.add(t);
       p.add(b);

       f.add(p);
       f.setSize(400,200);
       f.setLocationRelativeTo(null);
       f.setVisible(true);

       b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int c = Integer.parseInt(t.getText());
               c--;
               t.setText(""+c);
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
        new CounterDemo();
    }
}