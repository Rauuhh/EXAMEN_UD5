package org.example.enums.ej2;



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DificultadApp
{
    static Scanner entrada = new Scanner(System.in);
    static Dificultad validarDificultad()
    {

        Dificultad dificultad;
        boolean fallo;
        do
        {
            fallo = false;
            dificultad = null;
            System.out.println("Introduzca dificultad "+ Arrays.asList(Dificultad.values()) +":");
            try
            {
                dificultad = Dificultad.valueOf(entrada.nextLine());
            }
            catch(Exception e)
            {
                fallo = true;
                System.out.println("Dificultad inválida");
            }
        }while(fallo);
        return dificultad;
    }

    static void main()
    {
        Dificultad dificultad = validarDificultad();
        Random aleatorio = new Random();
        int puntuacion = aleatorio.nextInt(10000);

        System.out.println("Puntuación obtenida = "+ puntuacion +"\n" +
                "Puntuación final = "+ (puntuacion * dificultad.getMultiplicador()));
    }
}