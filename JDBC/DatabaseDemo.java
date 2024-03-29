package JDBC;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class DatabaseDemo {
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pstmt ;
    void GuiDemo(){

        JFrame frame = new JFrame();
    
        JLabel lblID = new JLabel("ID");
        JLabel lblName = new JLabel("Name");
        JLabel lblAge = new JLabel("Age");
        JLabel lblPhone = new JLabel("Phone_number");
        JLabel lblAddress = new JLabel("Address");
        
        JTextField txtID= new JTextField(10);
        JTextField txtName = new JTextField(10);
        JTextField txtAge = new JTextField(10);
        JTextField txtPhone = new JTextField(10);
        JTextField txtAddress = new JTextField(10);
        
        JButton btnSubmit = new JButton("Submit");
        
        
        JPanel panel = new JPanel();
        panel.add(lblID);
        panel.add(txtID);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblAge);
        panel.add(txtAge);
        panel.add(lblPhone);
        panel.add(txtPhone);
        panel.add(lblAddress);
        panel.add(txtAddress);
        panel.add(btnSubmit);
       
        
        panel.setLayout(new GridLayout(6,2));
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                    int id;
                String name;
                int age;
                String address;
                String phone;
                name = txtName.getText();
                age = Integer.parseInt(txtAge.getText());
                phone = txtPhone.getText();
                address = txtAddress.getText();
                id = Integer.parseInt(txtID.getText());
                
                try{
                    
                   insertTable(id,name,age,phone,address);
                }catch(Exception e){
                    e.printStackTrace();
                } 
            }
        });
     }

    public DatabaseDemo(){
        try {
            String sql="CREATE DATABASE db_test";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3300/db_test";
            con=DriverManager.getConnection(url,"root","");
            
            stmt= con.createStatement();
        } catch(Exception e){
            e.printStackTrace(); 
        }
    }
    void createTable() throws Exception{
        try{
            String sql="CREATE TABLE customers(id int primary key, name varchar(50),age int,phone varchar(10), address varchar(50))";
            
            
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Table created Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to create");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
    }
    void insertTable(int id,String name,int age,String phone,String address) throws Exception{
        int c_id = id;   
        String c_name = name;
        String c_address = address;
        String c_phone = phone;
        int c_age = age;
        
        try{
            System.out.println("Insert Table method ");
            String sql="INSERT INTO CUSTOMERS VALUES(?,?,?,?,?)";
             pstmt=con.prepareStatement(sql);
             pstmt.setInt(1,c_id );
             pstmt.setString(2, c_name);
             pstmt.setInt(3, c_age);
             pstmt.setString(4, c_phone);
             pstmt.setString(5,c_address);
             int result=pstmt.executeUpdate();
             if(result!=-1){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to insert");
            }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
            readTable();
        }
    }
    void readTable() throws Exception{
        try{
            String sql="SELECT * FROM CUSTOMERS";

            rs=stmt.executeQuery(sql);
            while(rs.next()){
                int c_id=rs.getInt(1);
                String c_name=rs.getString(2);
                int c_age=rs.getInt(3);
                String c_phone=rs.getString(4);
                String c_address=rs.getString(5);
          
            System.out.println(c_id+"\n"+c_name+"\n"+c_age+"\n"+c_phone+"\n"+c_address);
            System.out.println("-------------------------------");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
    }
    
    void closee()throws Exception{
        try{
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String []args)throws Exception{
       DatabaseDemo dbDemo=new DatabaseDemo();
       dbDemo.GuiDemo();
        dbDemo.createTable();
//        dbDemo.closee();
    }
}
     
