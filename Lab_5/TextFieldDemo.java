
package Lab_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo {
    TextFieldDemo(){
        JFrame f=new JFrame("JTextField");
        JLabel l1=new JLabel("FInd the Largest One");
        JLabel l2=new JLabel("First Number");
        JLabel l3=new JLabel("Second Number");
        
        JTextField t1= new JTextField(10);
        JTextField t2= new JTextField(10);
        
        JButton btn=new JButton("Check");
        
        JLabel result=new JLabel("");
        JLabel lblBlank = new JLabel("");
        
        JPanel panelUp=new JPanel();
        JPanel panelMid=new JPanel();
        JPanel panelDown=new JPanel();
        
        panelUp.setLayout(new FlowLayout());
        panelMid.setLayout(new GridLayout(3,2));
        panelDown.setLayout(new FlowLayout());

        panelUp.add(l1);
        panelMid.add(l2);
        panelMid.add(t1);
        panelMid.add(l3);
        panelMid.add(t2);
        panelMid.add(btn);
        panelMid.add(lblBlank);
        panelDown.add(result);

        f.add(panelUp);
        f.add(panelMid);
        f.add(panelDown);
        f.setLayout(new GridLayout(3,1));


         btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNum=Integer.parseInt(t1.getText());
                int secondNum=Integer.parseInt(t2.getText());
               if(firstNum > secondNum)
                   result.setText(" "+firstNum +" is largest");
                else
                result.setText(" " +secondNum +" is largest");
            }
        });
        f.setSize(400,400);
        f.setVisible(true);
        
        
    }
    
   public static void main(String []args){
    new TextFieldDemo();
    }
    
}
