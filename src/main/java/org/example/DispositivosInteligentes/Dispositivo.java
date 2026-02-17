package org.example.DispositivosInteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    abstract void encender();

    public void apagar(){
        if (estado){
            estado = false;
            System.out.println(nombre + " apagado");
        }else{
            System.out.println("El dispositivo ya esta apagado");
        }
    }
    public void mostrarEstado(){
        if (estado){
            System.out.println("Dispositivo encendido");
        }else{
            System.out.println("Dispositivo apagado");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
