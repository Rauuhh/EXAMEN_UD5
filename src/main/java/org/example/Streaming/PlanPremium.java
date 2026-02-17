package org.example.Streaming;

public class PlanPremium extends Subscripcion{
    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definicion y descargas offline");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 14 dias de prueba gratuita");
    }
}
