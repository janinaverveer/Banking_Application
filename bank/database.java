package bank;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "root";
   static final String PASS = "";
   static String dataname = "bank_applicatie";
   public static void main(String[] args) {
      System.out.println("Connecting to a selected database...");
      // Open a connection
      String sql = "select Bank_Naam from banken";
      try(Connection conn = DriverManager.getConnection(DB_URL+dataname, USER, PASS);	
         Statement stmt =conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql) ;     
         ){
        while(rs.next()){
           System.out.println(rs.getString("Bank_Naam"));
        }

      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
