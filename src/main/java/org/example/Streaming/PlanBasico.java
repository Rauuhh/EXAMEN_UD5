package org.example.Streaming;

public class PlanBasico extends Subscripcion{
    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estandar y sin anuncios");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 30 dias de prueba gratuita");
    }
}
