
package lab2;
import java.awt.*;
public class ChoiceDemo {
    ChoiceDemo(){
        Frame f=new Frame("AWT Choice Demo");
        f.setLayout(new GridLayout(1,2));
        Label l1=new Label("Which language do you like the most?");
        Choice c1=new Choice();
        c1.add("C");
        c1.add("Java");
        c1.add("Python");
        c1.add("C++");
        c1.add("DotNet");
        f.add(l1);
        f.add(c1);
        
        System.out.println("currently number of items in choice list is:"+c1.getItemCount());
        System.out.println("currently selected is:"+c1.getSelectedItem());
      
        
        c1.select("DotNet");
        System.out.println("currently selected is:"+c1.getSelectedItem());
        f.setSize(500,300);
        f.setVisible(true);
    }
    public static void main (String[] args){
        new ChoiceDemo();
    }
}
