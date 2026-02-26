package org.example.CopaDelRey;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.posiciones = posicion;
        try {
            setDorsal(dorsal);
            listaJugadores.add(this);
        }catch (NumeroDorsal e){
            System.out.println("No se pudo crear al jugador");
        }
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal){
        for (Jugador jugador : listaJugadores){
            if (jugador.getCategoria().equals(categoria)){
                if (jugador.getDorsal() == dorsal){
                    throw new NumeroDorsal();
                }
            }
        }
        this.dorsal = dorsal;
    }

    public Posiciones getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posiciones posiciones) {
        this.posiciones = posiciones;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posiciones=" + posiciones +
                '}';
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
        System.out.println("QUE BUENO SOY CHEE");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " esta entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " esta jugando contra " + rival);
    }
}
