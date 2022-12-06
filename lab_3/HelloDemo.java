
package lab_3;
import java.awt.*;
import java.awt.event.*;
public class HelloDemo {
    HelloDemo(){
    Frame f= new Frame("HELLO");
        TextField t1 = new TextField(10);
        Button btn = new Button("Submit");
        Label l1 = new Label();
        
       f.add(t1);
       f.add(btn);
       f.add(l1);
       f.setLayout(new FlowLayout());
       f.setSize(400,200);
       f.setLocationRelativeTo(null);
       
         btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText(t1.getText());
            }
        });
          f.setVisible(true);
        
}
public static void main(String []args){
new HelloDemo();
}
}
