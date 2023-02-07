package JDBC;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountriesDemo {
     Connection con;
     Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
    void GuiDemo(){

        JFrame frame = new JFrame();
    
        JLabel lblID = new JLabel("Country_ID");
        JLabel lblName = new JLabel("Country_Name");
        JLabel lblContinent = new JLabel("Continent");
 
        JTextField txtID= new JTextField(10);
        JTextField txtName = new JTextField(10);
        JTextField txtContinent = new JTextField(10);
        
        JButton btnSubmit = new JButton("Submit");
        
        
        JPanel panel = new JPanel();
        panel.add(lblID);
        panel.add(txtID);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblContinent);
        panel.add(txtContinent);
        panel.add(btnSubmit);
       
        
        panel.setLayout(new GridLayout(6,2));
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int country_id;
                String country_name;
                String continent;
                
                country_id = Integer.parseInt(txtID.getText());
                country_name = txtName.getText();
                continent = txtContinent.getText();
               
                
                try{
                    
                   insertTable(country_id,country_name,continent);
                }catch(Exception e){
                    e.printStackTrace();
                } 
            }
        });
     }

     CountriesDemo(){
         try {
            String sql="CREATE DATABASE Countries_test";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3300/Countries_test";
            con=DriverManager.getConnection(url,"root","");
            
            stmt= con.createStatement();
        } catch(Exception e){
            e.printStackTrace(); 
        }
    }
     void createtable() throws Exception{
         try{
//              String sql="CREATE TABLE COUNTRIES("+"NAME VARCHAR(50),ADDRESS VARCHAR(20),"
//                    + "PHONE VARCHAR(50),AGE INT,"
//                    +"ID INT"+")";
         String sql ="CREATE TABLE Countries("
                 + "country_id INT,"
                 + "country_name VARCHAR(50),"
                 + "continent VARCHAR(50))";
          int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Table created Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to create");
            }
         }catch(Exception e){
             e.printStackTrace();
         }
    }
     void insertTable(int country_id,String country_name,String continent) throws Exception{
         try{
             String query="INSERT INTO COUNTRIES VALUES(?,?,?)";
             pstmt=con.prepareStatement(query);
             pstmt.setInt(1, country_id);
             pstmt.setString(2, country_name);
             pstmt.setString(3, continent);
             int result=pstmt.executeUpdate();
             if(result!=-1){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to insert");
            }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             readFromDatabase();
         }
    }
     void readFromDatabase() throws Exception{
        try{
            String sql= "SELECT * FROM Countries";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                int country_id=rs.getInt(1);
                String country_name=rs.getString(2);
                String continent=rs.getString(3);
               
            
            System.out.println(+country_id+"\n"+country_name+"\n"+continent);
            System.out.println("-------------------------------");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
    }
   
        void close() throws Exception{
             try{
            stmt.close();
            pstmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
      public static void main(String[] args)throws Exception{
          CountriesDemo cd=new CountriesDemo();
          cd.GuiDemo();
          cd.createtable();
          cd.readFromDatabase();
//          cd.close();
      
     }
}
