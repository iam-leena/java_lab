package lab2;
import java.awt.*;
public class LabelDemo {
    LabelDemo(){
        Frame f=new Frame("Label Demo");
        
        Label l1= new Label("Name:");
        Label l2=new Label("Address:");
        
        TextField t1=new TextField(15);
        TextField t2=new TextField(15);
        
        Button b1=new Button("OK");
        Button b2= new Button("Cancel");
        
        f.setLayout(new GridLayout(3,2));
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        l1.setText("FullName:");
        l1.setAlignment(Label.CENTER);
        l2.setAlignment(Label.CENTER);
        f.setSize(600,300);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new LabelDemo();
    }
    
}
