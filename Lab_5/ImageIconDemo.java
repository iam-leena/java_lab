package Lab_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.jtattoo.plaf.AbstractLookAndFeel;
public class ImageIconDemo {
    ImageIconDemo(){
        JFrame f=new JFrame("Image Icon Demo");
       f.setLayout(new GridLayout(3,1));
        f.setSize(800,800);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelUp=new JPanel();
        JPanel panelMid=new JPanel();
        JPanel panelDown=new JPanel();
        
        panelUp.setLayout(new FlowLayout());
        panelMid.setLayout(new FlowLayout());
        panelDown.setLayout(new FlowLayout());
        

        JLabel l1=new JLabel("Java Programming");
        ImageIcon image1=new ImageIcon("D:\\NetBeansProjects\\AdvanceJava\\src\\Lab_5\\image.jpg");
        
        JLabel l2=new JLabel(image1);
        JLabel l3=new JLabel("Try it");
        
        panelUp.add(l1);
        panelMid.add(l2);
        panelDown.add(l3);
        f.add(panelUp);
        f.add(panelMid);
        f.add(panelDown);
       f.setVisible(true);

}
public static void main(String []args){
    try{
        UIManager.setLookAndFeel("com.jtattoo.plaf.AbstractLookAndFeel");
    }catch(Exception e ){
        e.printStackTrace();  
    }
new ImageIconDemo();
    }
}
