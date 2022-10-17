
package lab2;
import java.awt.*;
public class ListDemo {
    ListDemo(){
        Frame f=new Frame("List Demo");
        f.setLayout(new FlowLayout());
        Label l1=new Label("Choose the planet");
        List c1=new List(4,false);
        c1.add("Mercury");
        c1.add("Venus");
        c1.add("Earth");
        c1.add("Mars");
        c1.add("Jupiter");
        c1.add("Saturn");
        c1.add("Uranus");
        c1.add("Neptune");
        c1.add("Pluto");
        f.add(l1);
        f.add(c1);
        Panel p=new Panel(new FlowLayout());
        p.add(c1);
        f.add(p);
        
        c1.select(0);
        System.out.println("currently selected is:"+c1.getSelectedItem());
        f.setSize(300,200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main (String[] args){
        new ListDemo();
    }
}
