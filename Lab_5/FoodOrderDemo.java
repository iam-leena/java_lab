
package Lab_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FoodOrderDemo {
    FoodOrderDemo(){
        JFrame f=new JFrame("Food ordering System");
        JLabel lblHead=new JLabel("Food Ordering System");
        JLabel lblBlank=new JLabel(" ");
        JLabel result=new JLabel(" ");
        
        JCheckBox c1 = new JCheckBox("Momo");
        JCheckBox c2 = new JCheckBox("Pizza");
        JCheckBox c3 = new JCheckBox("Chowmein");
        JCheckBox c4 = new JCheckBox("fry rice");
        
         JButton btn=new JButton("Submit");
         
         JPanel panelUp=new JPanel();
        JPanel panelMid=new JPanel();
        JPanel panelDown=new JPanel();
        
        panelUp.setLayout(new FlowLayout());
        panelMid.setLayout(new GridLayout(3,2));
        panelDown.setLayout(new FlowLayout());
        
         panelUp.add(lblHead);
        panelMid.add(c1);
        panelMid.add(c2);
        panelMid.add(c3);
        panelMid.add(c4);
        panelMid.add(btn);
        panelDown.add(result);
        
        f.add(panelUp);
        f.add(panelMid);
        f.add(panelDown);
        f.setLayout(new GridLayout(3,1));
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (c1.isSelected()) {
                    result.setText("You have selected 1 items that is Momo");
                }
                if (c2.isSelected()) {
                    result.setText("You have selected 2 items they are Momo and Pizza");
                }
                if (c3.isSelected()) {
                    result.setText("You have selected 3 items they are Momo, Chowmein and Pizza");
                }
                if (c4.isSelected()) {
                    result.setText("You have selected 4 items they are Momo, Chowmein,Pizza and fry rice");
                }

            }
        });
    
    f.setSize(400,400);
    f.setVisible(true);
    }
     public static void main(String []args){
    new FoodOrderDemo();
     }
}
