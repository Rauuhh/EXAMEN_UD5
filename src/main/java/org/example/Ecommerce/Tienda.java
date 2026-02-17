package org.example.Ecommerce;


import java.util.Scanner;

public class Tienda {
    public static Scanner entrada = new Scanner(System.in);
    public static double importe;

    public static void iniciarPago(){
        System.out.println("¿Que metodo de pago quieres usar?");
    }

    public static void realizarPago(MetodoPago metodoPago){
        System.out.println("Introduce el importe");
        importe = entrada.nextDouble();
        metodoPago.procesarPago(importe);
    }
}
