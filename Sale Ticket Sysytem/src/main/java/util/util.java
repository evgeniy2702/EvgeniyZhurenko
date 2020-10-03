package util;

/**
 @author Evgeniy Zhurenko
 */

import java.net.URL;
import java.sql.*;

public class util {

    public static final String JDBC = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/Ticket";
    public static final PreparedStatement preparedStatement = null;
    public static final CallableStatement callableStatement = null;
    public static final Statement statment = null;
    public static Connection connection = null;

    public static void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC);
        connection = DriverManager.getConnection(URL);
        if(connection == null){
            System.out.println("Can not connection to Data Base");
        } else {
            System.out.println("Get connection to Data Base");
        }
    }

    public static void closeConnecction() throws SQLException {
        if(connection !=null){
            connection.close();
            System.out.println("Connection is close");
        } else{
            System.out.println("Connection is absent");
        }
    }

    public static void closePreparedStatment() throws SQLException {
        if(preparedStatement != null){
            preparedStatement.close();
            System.out.println("PreparedStatment is close");
        } else {
            System.out.println("PreparedStatment is absent");
        }
    }

    public  static  void closeCallableStatment() throws SQLException {
        if(callableStatement != null) {
            callableStatement.close();
            System.out.println("CallableStatment is close");
        } else {
            System.out.println("CallableStatment is absent");
        }
    }

    public static void closeStatment() throws SQLException {
        if(statment != null){
            statment.close();
            System.out.println("Statment is close");
        } else {
            System.out.println("Statment is absent");
        }
    }
}
