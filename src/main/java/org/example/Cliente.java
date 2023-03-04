package org.example;

import org.example.bd.BaseDeDatos;
import org.example.entities.Empleado;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {

            Empleado empleado = new Empleado("Mateo",21,"Company", LocalDate.now());
            BaseDeDatos.crearTablas();
            System.out.println(BaseDeDatos.guardarEmpleado(empleado));

    }
}
