
package lab2;
import java.awt.*;
public class ButtonDemo {
    public ButtonDemo(){
        Frame f=new Frame("Button Demo");
        Button l1=new Button("1");
        Button l2=new Button("2");
        Button l3=new Button("3");
        Button l4=new Button("4");
        
        f.setLayout(new GridLayout(2,2));
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        l2.setEnabled(false);
        l4.setEnabled(false);
        l1.setLabel("One");
        l3.setLabel("");
        
//        l1.setAlignment(Button.CENTER);
//        l2.setAlignment(Button.CENTER);
//        l3.setAlignment(Button.CENTER);
//        l4.setAlignment(Button.CENTER);
        f.setSize(400,400);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new ButtonDemo();
    }
    
}
