
package JDBC;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class JobDemo {
    Connection con;
     Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
     JobDemo(){
         try {
            String sql="CREATE DATABASE Job_test";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3300/Job_test";
            con=DriverManager.getConnection(url,"root","");
            
            stmt= con.createStatement();
        } catch(Exception e){
            e.printStackTrace(); 
        }
    }
     void createtable() throws Exception{
         try{
         String sql ="CREATE TABLE Jobs("
                 + "job_id INT,"
                 + "job_title VARCHAR(50),"
                 + "salary INT,"
                 + "department VARCHAR(50))";
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
     void insertTable() throws Exception{
         try{
             String query="INSERT INTO Jobs VALUES(?,?,?,?)";
             pstmt=con.prepareStatement(query);
             pstmt.setInt(1, 100);
             pstmt.setString(2, "MANAGER");
             pstmt.setInt(3, 100000);
             pstmt.setString(4,"Sales Department");
             int result=pstmt.executeUpdate();
             if(result!=-1){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to insert");
            }
         }catch(Exception e){
             e.printStackTrace();
         }
    }
     void readFromDatabase() throws Exception{
        try{
            String sql= "SELECT * FROM Jobs";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                int job_id=rs.getInt(1);
                String job_title=rs.getString(2);
                int salary=rs.getInt(3);
                String department=rs.getString(4);
     
            System.out.println(+job_id+"\n"+job_title+"\n"+salary+"\n"+department);
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
          JobDemo cd=new JobDemo();
          cd.createtable();
          cd.insertTable();
          cd.readFromDatabase();
          cd.close();
      
     }
}
