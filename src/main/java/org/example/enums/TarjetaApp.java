package org.example.enums;


import java.util.Scanner;

public class TarjetaApp
{
   static Scanner entrada = new Scanner(System.in);
    static void main()
    {
        TipoTarjeta tarjeta_tipo = TipoTarjeta.VISA;

        System.out.println(tarjeta_tipo.ordinal());
        System.out.println(tarjeta_tipo.name());

        System.out.println("\nTipos de tarjetas:");
        for(TipoTarjeta tipoTarjeta : TipoTarjeta.values()) System.out.println(tipoTarjeta);

        System.out.println("\n¡Se debe introducir el nombre extactamente igual!");
        TipoTarjeta tipo = TipoTarjeta.valueOf(entrada.nextLine());
        System.out.println("La tarjeta de tipo "+ tipo +" tiene una comisión de "+ tipo.getComision() +"€");
    }
}