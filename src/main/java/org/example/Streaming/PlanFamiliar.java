package org.example.Streaming;

public class PlanFamiliar extends Subscripcion{
    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultaneamente en alta definicion");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 7 dias de prueba para cuentas nuevas");
    }
}
