package Lab_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTabbePaneDemo {
    JTabbePaneDemo(){
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("DashBoard", new DashboardPanel());
        jtp.addTab("Courses", new CoursePanel());
        jtp.addTab("Comment", new CommentPanel());
        frame.add(jtp);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

}
    public static void main(String[] args) {
        new JTabbePaneDemo();
    }
}
   class DashboardPanel extends JPanel{

public DashboardPanel(){

JLabel lblDash=new JLabel("Welcome to IOC");

add(lblDash);

}

}

class CoursePanel extends JPanel{

public CoursePanel(){
    JLabel lblcourse=new JLabel("Select the Course",JLabel.CENTER);
    add(lblcourse);
    JCheckBox c1=new JCheckBox("C");
    add(c1);
    JCheckBox c2=new JCheckBox("C++");
    add(c2);
    JCheckBox c3=new JCheckBox("Java");
    add(c3);
    JCheckBox c4=new JCheckBox("PHP");
    add(c4);
    JButton btn1=new JButton("Submit");
    add(btn1);
    setLayout(new GridLayout(6,1));
    

}
}
class CommentPanel extends JPanel{

public CommentPanel(){
    JLabel lblCom=new JLabel("Leave your comment",JLabel.CENTER);
    JTextArea ta=new JTextArea(15,35);
    add(lblCom);
    add(ta);
//    setLayout(new GridLayout(2,1));
}
}


