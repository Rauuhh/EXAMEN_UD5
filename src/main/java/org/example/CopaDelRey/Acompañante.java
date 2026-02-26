package org.example.CopaDelRey;

public class Acompañante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se esta concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("HA METIDO MI PRIMICO");
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
