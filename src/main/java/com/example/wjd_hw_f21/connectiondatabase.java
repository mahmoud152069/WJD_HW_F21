package com.example.wjd_hw_f21;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;

public class connectiondatabase {

   public Connection getconnection() throws NamingException, SQLException {
       javax.naming.InitialContext ctx = new javax.naming.InitialContext();
       javax.sql.DataSource ds = (javax.sql.DataSource) ctx.lookup("jdbc/SQLServer");
       java.sql.Connection conn = ds.getConnection();

       return  conn;

   }
}
