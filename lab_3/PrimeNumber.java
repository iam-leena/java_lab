
package lab_3;
import Lab_4.TextFieldDemo;
import java.awt.*;
import java.awt.event.*;
public class PrimeNumber {
    Label l1;
    Label l2;
     TextField t1;
      TextField t2;
      Button btn;
      
    
    PrimeNumber(){
         Frame f= new Frame("Prime Number Test");
          l1 = new Label("Number");
         l2 = new Label("Prime");
         
          t1=new TextField(10);
          t2=new TextField(10);
         
        Panel panelUp=new Panel();
        Panel panelDown=new Panel();
         btn=new Button("Check");
         
       panelUp.add(l1);
       panelUp.add(t1);
       panelUp.add(l2);
       panelUp.add(t2);
       panelDown.add(btn);
       f.add(panelUp);
       f.add(panelDown);
       panelUp.setLayout(new GridLayout(2,2));
      panelDown.setLayout(new FlowLayout());
       f.setLayout(new GridLayout(2,1));
       f.setSize(400,200);
       f.setLocationRelativeTo(null);
       f.setVisible(true);
       btn.addActionListener(new HandleEvent());
       
    }
    class HandleEvent implements ActionListener{
         public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(t1.getText());
               boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      t2.setText("YES");
    else
      t2.setText("NO");
  }
    }

    public static void main(String []args){
    new PrimeNumber();
    }
}
