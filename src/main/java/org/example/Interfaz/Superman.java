package org.example.Interfaz;

public class Superman extends   Superheroe implements  Volador,Ataques{
    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad, vigilandop a los maleantes");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Tirando rayo laser");
    }

    @Override
    public void alientoHielo() {
        System.out.println("Congelandote");
    }
}
