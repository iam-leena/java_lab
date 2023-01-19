package JDBC;
import java.sql.*;
import javax.swing.*;
public class CountriesDemo {
     Connection con;
     Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
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
     void insertTable() throws Exception{
         try{
             String query="INSERT INTO COUNTRIES VALUES(?,?,?)";
             pstmt=con.prepareStatement(query);
             pstmt.setInt(1, 100);
             pstmt.setString(2, "Nepal");
             pstmt.setString(3, "Asia");
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
          cd.createtable();
          cd.insertTable();
          cd.readFromDatabase();
          cd.close();
      
     }
}
