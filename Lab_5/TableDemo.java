
package Lab_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TableDemo{
    TableDemo(){
        JFrame frame = new JFrame("My window");
        String[] colhead = {"ID", "Name", "Prpduct","price in $"};
        Object[][] data = {{"1234", "John", "pencil","10"},
                           {"4535", "Mirian", "pen","11"},
                           {"3424", "Katy", "chair","253"},
                           {"4124", "Agnes", "table","456"},
                           {"8563", "Stanley", "flower","25"}};
        
        JTable table=new JTable(data,colhead);
        JScrollPane jsp=new JScrollPane(table);
        frame.add(jsp);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

}
    public static void main(String[] args) {
        new TableDemo();
}

}

