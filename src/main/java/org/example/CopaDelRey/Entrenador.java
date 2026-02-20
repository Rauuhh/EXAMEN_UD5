package org.example.CopaDelRey;

import java.util.Scanner;

public class Entrenador extends MutxamelFC{
    static Scanner entrada = new Scanner(System.in);
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;

    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {

    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
