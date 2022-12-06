
package lab_3;
 import java.awt.*;
import java.awt.event.*;
public class KeyhandlingDemo {
    Label l1;
    TextField t1;
    Label l2;
    KeyhandlingDemo(){
    Frame f= new Frame("Key Event");
    
         l1 = new Label("enter text");
        t1 = new TextField(10);
       l2 = new Label();
         
       f.add(l1);
       f.add(t1);
       f.add(l2);
       f.setLayout(new FlowLayout());
       f.setSize(400,200);
       f.setLocationRelativeTo(null);
       
//         t1.addKeyListener(new KeyAdapter() {
//            public void keyReleased(KeyEvent e) {
//                l2.setText(t1.getText());
//            }
//        });
t1.addKeyListener(new HandleEvent());
          f.setVisible(true);
        

    }
    class HandleEvent implements KeyListener{
         public void keyReleased(KeyEvent e) {
                l2.setText(t1.getText());
            }
          public void keyPressed(KeyEvent e) {
                l2.setText(t1.getText());
            }
           public void keyTyped(KeyEvent e) {
                l2.setText(t1.getText());
            }
    }
    
public static void main(String []args){
new KeyhandlingDemo();
}
}


