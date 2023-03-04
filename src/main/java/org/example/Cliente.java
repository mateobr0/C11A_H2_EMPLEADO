package org.example;

import org.example.bd.BaseDeDatos;
import org.example.entities.Empleado;
import org.example.services.EmpleadoService;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {

            Empleado empleado1 = new Empleado("Mateo",21,"Company", LocalDate.now());
            Empleado empleado2 = new Empleado("Tadeo",20,"Facebook",LocalDate.now());
            Empleado empleado3 = new Empleado("Antonella",18,"Google",LocalDate.now());
            BaseDeDatos.crearTablas();
            System.out.println(EmpleadoService.guardarEmpleado(empleado1));
            System.out.println(EmpleadoService.guardarEmpleado(empleado2));
            System.out.println(EmpleadoService.guardarEmpleado(empleado3));
    }
}
