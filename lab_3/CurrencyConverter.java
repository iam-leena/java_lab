
package lab_3;
import java.awt.*;
import java.awt.event.*;
public class CurrencyConverter {
    CurrencyConverter(){
        Frame f=new Frame("Currency Converter");
        Label l1 = new Label("Dollar");
        TextField t1 = new TextField(10);
        Label l2 = new Label("Nepalese");
        TextField t2 = new TextField(10);
        Label l3 = new Label("Euro");
        TextField t3 = new TextField(10);
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.setSize(400,400);
        f.setLayout(new GridLayout(3,2));
        
        t1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                Float dlr = Float.parseFloat(t1.getText());
                t2.setText("" + dlr * 129.57);
                t3.setText("" + dlr * 0.97);
            }
        });
        t2.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                Float npr = Float.parseFloat(t2.getText());
                t1.setText("" + npr / 129.57);
                t3.setText("" + npr / 133.73);
            }
        });
        t3.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                Float euro = Float.parseFloat(t3.getText());
                t1.setText("" + euro * 1.03);
                t2.setText("" + euro * 133.73);
            }
        });
          f.setVisible(true);
        
    }
    public static void main(String [] args){
        new CurrencyConverter();
        
    }
    }
