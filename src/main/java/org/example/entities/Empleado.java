package org.example.entities;

import java.time.LocalDate;

public class Empleado {
    private Long id;
    private String nombre;
    private int edad;
    private String empresa;
    private LocalDate fechaDeInicio;

    public Empleado(Long id, String nombre, int edad, String empresa, LocalDate fechaDeInicio) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.empresa = empresa;
        this.fechaDeInicio = fechaDeInicio;
    }

    public Empleado(String nombre, int edad, String empresa, LocalDate fechaDeInicio) {
        this.nombre = nombre;
        this.edad = edad;
        this.empresa = empresa;
        this.fechaDeInicio = fechaDeInicio;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", empresa='" + empresa + '\'' +
                ", fechaDeInicio=" + fechaDeInicio +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }
}

