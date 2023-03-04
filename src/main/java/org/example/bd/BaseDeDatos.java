package org.example.bd;

import org.example.entities.Empleado;

import java.sql.*;

public class BaseDeDatos {
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/empleado","sa","sa");
    }
    private static final String SQL_CREATE_TABLA = "DROP TABLE IF EXISTS EMPLEADOS;"+
            "CREATE TABLE EMPLEADOS (ID BIGINT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, EDAD INT NOT NULL, EMPRESA VARCHAR(100) NOT NULL, FECHADEINICIO DATE NOT NULL)";

    public static void crearTablas(){
        Connection connection=null;
        try {
            connection=getConnection();
            Statement statement=connection.createStatement();
            statement.execute(SQL_CREATE_TABLA);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

    }
}
