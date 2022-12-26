
package Lab_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GuessDemo {
    GuessDemo(){
        JFrame f=new JFrame("Guess the Answer...");
        JLabel lblHead=new JLabel("Who is the founder of java?");
        JLabel result=new JLabel(" ");
        
          JButton btn1=new JButton("Dennis Ritchiw");
          JButton btn2=new JButton("James Gosling");
          JButton btn3=new JButton("Guido Van Rossum");
          JButton btn4=new JButton("Patrick Naughton");
          
        JPanel panelUp=new JPanel();
        JPanel panelMid=new JPanel();
        JPanel panelDown=new JPanel();
        
        panelUp.setLayout(new FlowLayout());
        panelMid.setLayout(new GridLayout(2,2));
        panelDown.setLayout(new FlowLayout());
        
        panelUp.add(lblHead);
        panelMid.add(btn1);
        panelMid.add(btn2);
        panelMid.add(btn3);
        panelMid.add(btn4);
        panelDown.add(result);
        
        f.add(panelUp);
        f.add(panelMid);
        f.add(panelDown);
        f.setLayout(new GridLayout(3,1));
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                result.setText("you are incorrect");
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                result.setText("you are incorrect");
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                result.setText("you are incorrect");
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                result.setText("you are correct");
            }
        });
    f.setSize(400,400);
    f.setVisible(true);
    }
   public static void main(String []args){
    new GuessDemo();
   }
}
