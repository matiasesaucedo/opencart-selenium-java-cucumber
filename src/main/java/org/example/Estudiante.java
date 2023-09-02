package org.example;

public class Estudiante {

    String nombre;
    String apellido;
    int legajo;
    boolean estaMatriculado;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int legajo, boolean estaMatriculado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.estaMatriculado = estaMatriculado;
    }

    public void RendirMateria (String materia){
        System.out.println("Rendí la materia: " + materia);
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
    return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}