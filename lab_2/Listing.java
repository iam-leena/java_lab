
package lab2;
import java.awt.*;
public class Listing {
    Listing(){
        Frame f=new Frame("List");
        f.setLayout(new FlowLayout());
        Label l1=new Label("Select your favorite sports from the list:");
        List c1=new List(7,true);
        c1.add("Badminton");
        c1.add("Hockey");
        c1.add("Tennis");
        c1.add("Football");
        c1.add("Cricket");
        c1.add("Formula One");
        c1.add("Rugby");
        f.add(l1);
        f.add(c1);
        c1.select(0);
        System.out.println("currently selected is:"+c1.getSelectedItem());
        f.setSize(600,200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main (String[] args){
        new Listing();
    }
}

