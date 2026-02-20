package org.example.CopaDelRey;

public class Jugador extends MutxamelFC{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
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

    public void setDorsal(int dorsal) {
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
}
