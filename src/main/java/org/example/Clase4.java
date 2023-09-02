package org.example;

public class Clase4 {

    public static void main(String[] args) {

        Estudiante pepe = new Estudiante();

        pepe.RendirMateria ("Programación en Java");

        pepe.setNombre("Pepe");

        System.out.println("El nombre del estudiante es: " + pepe.getNombre());

        Estudiante matias = new Estudiante("Matías", "Saucedo", 001, true );
        System.out.println("El nombre del estudiantes es: " + matias.getNombre());
    }

}
