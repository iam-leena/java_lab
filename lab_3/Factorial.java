
package lab_3;
import java.awt.*;
import java.awt.event.*;
public class Factorial {
    Factorial(){
    Frame f= new Frame("Factorial");
        Label l1 = new Label("Number");
        TextField t1 = new TextField(10);
        Button btn = new Button("Calculator");
        Label l2 = new Label("Factorial");
        TextField t2 = new TextField(10);
        
       f.add(l1);
       f.add(t1);
       f.add(btn);
       f.add(l2);
       f.add(t2);
       f.setLayout(new FlowLayout());
       f.setSize(400,200);
       f.setLocationRelativeTo(null);
       
         btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fact=1;
                int n=Integer.parseInt(t1.getText());
                for(int i=1;i<=n;i++){
                    fact=fact*i;
                }
                t2.setText(" " +fact);
            }
        });
          f.setVisible(true);
        
}
public static void main(String []args){
new Factorial();
}
}
