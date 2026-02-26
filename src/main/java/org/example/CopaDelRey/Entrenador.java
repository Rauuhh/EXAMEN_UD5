package org.example.CopaDelRey;

import java.util.Scanner;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    static Scanner entrada = new Scanner(System.in);
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        try{
            setFormacionPreferida(formacionPreferida);
        }catch (Formacion e){

        }

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
        if (formacionPreferida.matches("^[0-9]-[0-9][0-9]$")){
            this.formacionPreferida = formacionPreferida;
        }else{
            throw new Formacion();
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " se esta concentrando ");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("VAMOS COÑOOOOO ESE ES MI EQUIPO");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " +  getNombre() + " esta entrenado a: " + getEquipo());
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Esta viendo como : " + getEquipo() + " juega" +
                "");
    }
}
