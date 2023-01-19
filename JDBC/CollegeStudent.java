package JDBC;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class CollegeStudent {
    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
    
        CollegeStudent(){
         try {
            String sql="CREATE DATABASE CollegeStudent_test";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3300/CollegeStudent_test";
            con=DriverManager.getConnection(url,"root","");
            
            stmt= con.createStatement();
        } catch(Exception e){
            e.printStackTrace(); 
        }
    }
        void createTable() throws Exception{
         try{
         String sql ="CREATE TABLE Student("
                 + "s_id INT,"
                 + "name VARCHAR(50),"
                 + "address VARCHAR(50),"
                 + "gender VARCHAR(50),"
                 + "program VARCHAR(50))";
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
             String sql= "INSERT INTO Student VALUES(100,'Sam','Kathmandu','male','BCIS')";
        int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to insert");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
        }
         void tableInsert() throws Exception{
         try{
             String query="INSERT INTO Student VALUES(?,?,?,?,?)";
             pstmt=con.prepareStatement(query);
             pstmt.setInt(1, 11);
             pstmt.setString(2, "rashmi");
             pstmt.setString(3, "kathmandu");
             pstmt.setString(4,"Female");
             pstmt.setString(5,"BCIS");
             int result=pstmt.executeUpdate();
             if(result!=-1){
                JOptionPane.showMessageDialog(null,"Successfully Inserted ");
            }else{
                JOptionPane.showMessageDialog(null,"insert fail");
            }
         }catch(Exception e){
             e.printStackTrace();
         }
    }
        
         void readFromDatabase() throws Exception{
        try{
            String sql= "SELECT * FROM Student";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                int s_id=rs.getInt(1);
                String name=rs.getString(2);
                String address=rs.getString(3);
                String gender=rs.getString(4);
                String program=rs.getString(5);
     
            System.out.println(+s_id+"\n"+name+"\n"+address+"\n"+gender+"\n"+program);
            System.out.println("-------------------------------");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
    }
          void updateTable() throws Exception{
         try{
             System.out.println("\n\n\n\nAfter the update of the data to the table:");
           System.out.println("<<<<<--------------------------------------------------------->>>>>");
             String sql= "UPDATE Student SET program='BBA' WHERE program='BCIS'";
        int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Update Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to update");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
        }
           void deleteTable() throws Exception{
         try{
             System.out.println("\n\n\n\nAfter the deletion of the data from the table:");
           System.out.println("<<<<<--------------------------------------------------------->>>>>");
             String sql= "DELETE FROM Student WHERE s_id=100";
        int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Deleted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to delete");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
        }
     
      void close() throws Exception{
             try{
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
       public static void main(String []args)throws Exception{
       CollegeStudent cd=new CollegeStudent();
        cd.createTable();
        cd.insertTable();
        cd.tableInsert();
        cd.readFromDatabase();
        cd.updateTable();
        cd.readFromDatabase();
        cd.deleteTable();
        cd.readFromDatabase();
        cd.close();
    }
}

