package com.bridgelabz.JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
 
public class Mydb1 {
   static String URL = "jdbc:mysql://localhost/CSVFile";

   public static void main(String[] args) {
      try{
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection(URL,"root","bridgeit");
        Statement stmt = conn.createStatement();
        String sql;
        try{
        	 sql = "CREATE TABLE REGISTRATION " +
                     "(id int NOT NULL AUTO_INCREMENT, " +
                     " first VARCHAR(255), " + 
                     " last VARCHAR(255), " + 
                     " age INTEGER, " + 
                     " PRIMARY KEY ( id ))"; 
             stmt.executeUpdate(sql);
        }
        catch(MySQLSyntaxErrorException e){
        	System.out.println("table already exists");
        }
        catch(Exception e){
        	System.out.println(e);
        }

       // sql = "INSERT INTO Emp1 VALUES (3,'pctb5361','gajanan','krpuram',968666668)";
       // stmt.executeUpdate(sql);
           
        sql = "INSERT INTO REGISTRATION(first,last,age) VALUES ('abc','zya',45)";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the table...");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}