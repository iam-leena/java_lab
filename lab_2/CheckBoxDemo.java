
package lab2;
import java.awt.*;
public class CheckBoxDemo {
    CheckBoxDemo(){
    Frame f=new Frame("CheckBox Demo");
    f.setSize(600,400);
    f.setLayout(new GridLayout(8,2));
    
    Label l1=new Label("choose program to enroll");
    Checkbox c1=new Checkbox("C");
    Checkbox c2=new Checkbox("Java");
    Checkbox c3=new Checkbox("HTML");
    Checkbox c4=new Checkbox("PHP");
    
    Label l2=new Label("Payment");
    
    CheckboxGroup cg=new CheckboxGroup();
    Checkbox c5=new Checkbox("Now",false,cg);
    Checkbox c6=new Checkbox("Later",true,cg);
    f.add(l1);
    f.add(c1);
    f.add(c2);
    f.add(c3);
    f.add(c4);
    f.add(l2);
    f.add(c5);
    f.add(c6);
    f.setVisible(true);
}
    public static void main(String[] args){
        new CheckBoxDemo();
    }
}
