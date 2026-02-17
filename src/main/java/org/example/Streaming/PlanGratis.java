package org.example.Streaming;

public class PlanGratis extends Subscripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: Sin periodo de prueba");
    }
}
