package bank;

import java.sql.*;

 
public class database1 {
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "root";
   static final String PASS = "";
   static final String databasename = "bank_applicatie";
  

   void bank_data1(){
       String query1 = "SELECT Bank_Naam,USD_Biedkoers, USD_Laatkoers, EUR_Biedkoers, EUR_Laatkoers FROM banken where Bank_Id = 1";
      try(Connection conn = DriverManager.getConnection(DB_URL + databasename, USER, PASS);
      
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query1);
      ) {            
         while(rs.next()){
         //Display values
            System.out.println(rs.getString("Bank_Naam"));
            System.out.println("aankoop Valuta (Dollar): Srd "+ rs.getDouble("USD_Biedkoers") + "\naankoop Valuta(Euro): Srd "+ rs.getInt("EUR_Biedkoers"));
            System.out.println("verkoop Valuta(Dollar): Srd "+ rs.getDouble("USD_Laatkoers") + "\nverkoop Valuta(Euro): Srd " + rs.getInt("EUR_Laatkoers"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
    void bank_data2(){
    String query2 = "SELECT Bank_Naam,USD_Biedkoers, USD_Laatkoers, EUR_Biedkoers, EUR_Laatkoers FROM banken where Bank_Id = 2";
      try(Connection conn = DriverManager.getConnection(DB_URL + databasename, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query2);
      ) {            
         while(rs.next()){
            //Display values
            System.out.println(rs.getString("Bank_Naam"));
            System.out.println("aankoop Valuta (Dollar): Srd "+ rs.getDouble("USD_Biedkoers") + "\naankoop Valuta(Euro): Srd "+ rs.getInt("EUR_Biedkoers"));
            System.out.println("verkoop Valuta(Dollar): Srd "+ rs.getDouble("USD_Laatkoers") + "\nverkoop Valuta(Euro): Srd " + rs.getInt("EUR_Laatkoers"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
    }

    void bank_data3(){
    String query3 = "SELECT Bank_Naam,USD_Biedkoers, USD_Laatkoers, EUR_Biedkoers, EUR_Laatkoers FROM banken where Bank_Id = 3";
      try(Connection conn = DriverManager.getConnection(DB_URL + databasename, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query3);
      ) {            
         while(rs.next()){
            //Display values
            System.out.println(rs.getString("Bank_Naam"));
            System.out.println("aankoop Valuta (Dollar): Srd "+ rs.getDouble("USD_Biedkoers") + "\naankoop Valuta(Euro): Srd "+ rs.getInt("EUR_Biedkoers"));
            System.out.println("verkoop Valuta(Dollar): Srd "+ rs.getDouble("USD_Laatkoers") + "\nverkoop Valuta(Euro): Srd " + rs.getInt("EUR_Laatkoers"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
    }
    void bank_data4(){
    String query4 = "SELECT Bank_Naam,USD_Biedkoers, USD_Laatkoers, EUR_Biedkoers, EUR_Laatkoers FROM banken where Bank_Id = 4";
      try(Connection conn = DriverManager.getConnection(DB_URL + databasename, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query4);
      ) {            
         while(rs.next()){
            //Display values
            System.out.println(rs.getString("Bank_Naam"));
            System.out.println("aankoop Valuta (Dollar): Srd "+ rs.getDouble("USD_Biedkoers") + "\naankoop Valuta(Euro): Srd "+ rs.getInt("EUR_Biedkoers"));
            System.out.println("verkoop Valuta(Dollar): Srd "+ rs.getDouble("USD_Laatkoers") + "\nverkoop Valuta(Euro): Srd " + rs.getInt("EUR_Laatkoers"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
    }

    void bank_data5(){
    String query5 = "SELECT Bank_Naam,USD_Biedkoers, USD_Laatkoers, EUR_Biedkoers, EUR_Laatkoers FROM banken where Bank_Id = 5";
      try(Connection conn = DriverManager.getConnection(DB_URL + databasename, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query5);
      ) {            
         while(rs.next()){
            //Display values
            System.out.println(rs.getString("Bank_Naam"));
            System.out.println("aankoop Valuta (Dollar): Srd "+ rs.getDouble("USD_Biedkoers") + "\naankoop Valuta(Euro): Srd "+ rs.getInt("EUR_Biedkoers"));
            System.out.println("verkoop Valuta(Dollar): Srd "+ rs.getDouble("USD_Laatkoers") + "\nverkoop Valuta(Euro): Srd " + rs.getInt("EUR_Laatkoers"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
    }
}
