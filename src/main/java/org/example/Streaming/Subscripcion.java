package org.example.Streaming;

public abstract class Subscripcion {

    private String nombrePlan;
    private double precio;

    public Subscripcion(String nombrePlan, double precio) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Plan: " + nombrePlan);
        System.out.println("Precio: " + precio);
    }

    public abstract void obtenerBeneficios();
    public abstract void obtenerPeriodoPrueba();

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
