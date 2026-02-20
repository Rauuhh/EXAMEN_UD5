package org.example.enums;

public enum TipoTarjeta
{
    VISA(0),
    MAESTRO(1.5),
    MASTERCARD(5);

    private final double comision;

    //No hace falta decir que es público
    TipoTarjeta(double comision)
    {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }
}