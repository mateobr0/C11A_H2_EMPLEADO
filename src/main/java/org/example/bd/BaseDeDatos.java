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

    public static Empleado guardarEmpleado(Empleado empleado){
        Connection connection=null;
        try {
            connection=getConnection();
            PreparedStatement ps_insert=connection.prepareStatement("INSERT INTO EMPLEADOS (NOMBRE, EDAD, EMPRESA, FECHADEINICIO) VALUES(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            ps_insert.setString(1, empleado.getNombre());
            ps_insert.setInt(2,empleado.getEdad());
            ps_insert.setString(3, empleado.getEmpresa());
            ps_insert.setObject(4,empleado.getFechaDeInicio());
            ps_insert.execute();
            ResultSet rs = ps_insert.getGeneratedKeys();
            while (rs.next()){
                empleado.setId(rs.getLong(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    return empleado;
    }
}
