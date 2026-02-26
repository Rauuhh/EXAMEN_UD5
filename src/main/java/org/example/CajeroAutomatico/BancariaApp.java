package org.example.CajeroAutomatico;

import java.util.Scanner;

public class BancariaApp {
    static CuentaBancaria cuentaBancaria = new CuentaBancaria(3);

    static void main()
    {
        Scanner entrada = new Scanner(System.in);

        CuentaBancaria cuentaBancaria = new CuentaBancaria(3);
        menu();
        int opcion = entrada.nextInt();
        opcion(opcion);

    }

    public static void menu()
    {
        System.out.println("Caero automatico");
        System.out.println();
        System.out.println("    [1]. Consultar dinero");
        System.out.println("    [2]. Ingresar dinero");
        System.out.println("    [3]. Retirar dinero");
        System.out.println("    [4]. Salir");
        System.out.println();
        System.out.println("    Selecciona una opcion");
    }

    public static void opcion(int opcion){
        switch (opcion){
            case 1:
                cuentaBancaria.consultarSaldo();
                break;

        }
    }

}
