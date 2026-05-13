package main.java.com.smarthub.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/smart_inventory";
        private static final String USER = "root";
        private static final String PASSWORD = "Prince#@321";

        public static Connection getConnection(){

            try{
                return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception e){
                throw new RuntimeException(e);
            }
    }
}
