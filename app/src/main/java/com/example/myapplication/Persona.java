package com.example.myapplication;

public class Persona {

    private String nombre;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDescripcionl(String descripcionl) {
        this.descripcionl = descripcionl;
    }

    private String descripcionl;

    public Persona(String nombre, String telefono, String descripcionl) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.descripcionl = descripcionl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDescripcionl() {
        return descripcionl;
    }
}
