package lab_3;

import java.awt.*;
import java.awt.event.*;
public class ReverseNumber {
     Label l1;
    Label l2;
     TextField t1;
      TextField t2;
      Button btn;
    ReverseNumber(){
         Frame f= new Frame("Reverse test");
          l1 = new Label("Number");
         l2 = new Label("Reverse");
         
          t1=new TextField(10);
          t2=new TextField(10);
         
        Panel panelUp=new Panel();
        Panel panelDown=new Panel();
         btn=new Button("Reverse");
         
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
       btn.addActionListener(new InnerClass());
    }
    class InnerClass implements ActionListener{
        public void actionPerformed(ActionEvent ae){
             int num=Integer.parseInt(t1.getText());
             int rev=0;int rem;
             while(num!=0)    
  {    
     rem=num%10;    
     rev=rev*10+rem;    
     num=num/10;    
  }    
  t2.setText(" " +rev);   
        }
        
    }
    public static void main(String[] args){
        new ReverseNumber();
    }
}
