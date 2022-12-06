/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;
import java.awt.*;
import java.awt.event.*;
public class SimpleInterest {
    SimpleInterest(){
        Frame f=new Frame();
        Label l1 = new Label("principle");
        Label l2 = new Label("time");
        Label l3 = new Label("Rate");
        Label l4 = new Label("Result");
        
        
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3 = new TextField(10);
        TextField t4 = new TextField(10);
        
        Button btn = new Button("Calculate");
        Panel panelUp=new Panel();
        Panel panelDown =new Panel();
        panelUp.add(l1);
        panelUp.add(t1);
        panelUp.add(l2);
        panelUp.add(t2);
        panelUp.add(l3);
        panelUp.add(t3);
        panelUp.add(l4);
        panelUp.add(t4);
        panelDown.add(btn);
        f.add(panelUp);
        f.add(panelDown);
        f.setSize(400,400);
        panelUp.setLayout(new GridLayout(4,2));
        panelDown.setLayout(new FlowLayout());
        f.setLayout(new GridLayout(2,1));
        
        
         btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int p=Integer.parseInt(t1.getText());
                int t=Integer.parseInt(t2.getText());
                int r=Integer.parseInt(t3.getText());
                float si=(p*t*r)/100;
                t4.setText("" +si);
            }
        });
          f.setVisible(true);
        
    }
    public static void main(String []args){
new SimpleInterest();
}
}
