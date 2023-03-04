package org.example.services;

import org.example.bd.BaseDeDatos;
import org.example.entities.Empleado;

import java.sql.*;

public class EmpleadoService {

    public static Empleado guardarEmpleado(Empleado empleado){
        Connection connection=null;
        try {
            connection=BaseDeDatos.getConnection();
            PreparedStatement ps_insert=connection.prepareStatement("INSERT INTO EMPLEADOS (NOMBRE, EDAD, EMPRESA, FECHADEINICIO) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
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
