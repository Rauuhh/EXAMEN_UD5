package org.example.CopaDelRey;

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println( getNombre() + " le esta dando un masaje a " + jugador);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se esta concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista: "+ getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOLASOOOOO");
    }
}
