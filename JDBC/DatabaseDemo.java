package JDBC;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class DatabaseDemo {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
//    global variable to store data 

//    store data close
    
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
            String sql="CREATE TABLE CUSTOMERS("+"NAME VARCHAR(50),ADDRESS VARCHAR(20),"
                    + "PHONE VARCHAR(50),AGE INT,"
                    +"ID INT"+")";
            
            
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
    void insertTable(String name,String address,String phone,int age,int id) throws Exception{
              
        String n = name;
        String a = address;
        String p = phone;
        int ag = age;
        int i = id;
        try{
            System.out.println("Insert Table method ");
            String sql="INSERT INTO CUSTOMERS VALUES(n,a,p,ag,i)";
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to insert");
            }
         }catch (Exception e){
             e.printStackTrace();
         }finally{
            closee();
        }
    }
    void readTable() throws Exception{
        try{
            String sql="SELECT * FROM CUSTOMERS";

            rs=stmt.executeQuery(sql);
            while(rs.next()){
                String name=rs.getString(1);
                String address=rs.getString(2);
                String phone=rs.getString(3);
                int age=rs.getInt(4);
                int id=rs.getInt(5);
            
            System.out.println(name+"\n"+address+"\n"+phone+"\n"+age+"\n"+id);
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
//        dbDemo.createTable();
//        dbDemo.insertTable();
//        dbDemo.readTable();
//        dbDemo.closee();
    }
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
        JButton btnShow = new JButton("Show");
        
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
        panel.add(btnShow);
        
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
                    
                   insertTable(name,address,phone,age,id);
                System.out.println("Data inserted Successfully");
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
                
            }
        });
         btnShow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               
            }
        });
        }
    }
