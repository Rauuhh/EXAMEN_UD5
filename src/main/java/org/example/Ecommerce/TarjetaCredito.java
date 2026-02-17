package org.example.Ecommerce;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class TarjetaCredito extends MetodoPago{

    private String nro_tarjeta;
    private String tipo;
    private String[] listametodos = {"VISA", "MASTERCARD", "MAESTRO"};

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    public boolean validarTarjeta(){
        if ( (tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO")) && nro_tarjeta.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")){
            return true;
        }else{
            return false;
        }
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " +  importe + "€ con tarjeta de credito: " + tipo);
    }
}
