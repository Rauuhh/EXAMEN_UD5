package org.example.Pruebas_Mapas;

import java.util.Scanner;

public class DiccionarioMain {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Diccionario dic = new Diccionario();
        dic.insertarPalabras();
        String palabra;
        String respuesta;
        int bien = 0;
                int mal = 0;
                        int intentos = 0;
        do {
            palabra = dic.palabraAleatoria();
            if (!palabra.equals("fin")) {
                System.out.println(palabra + ":" + dic.primeraLetraTraduccion(palabra));
                System.out.println("Indique la respuesta:");
                respuesta = entrada.nextLine();
                if (respuesta.equals(dic.getDiccionario().get(palabra))){
                    System.out.println("¡Correcto!");
                    bien++;
                } else if (respuesta.equals("fin")) {
                    break;
                } else{
                    System.out.println("¡NO! La respuesta correcta es " + dic.getDiccionario().get(palabra));
                    mal++;
                }
                intentos++;
            }else{
                respuesta = "fin";
            }
        }while (!respuesta.equals("fin"));

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total Preguntas " + intentos);
        System.out.println("Total aciertos " + bien);
        System.out.println("Total fallos " + mal);
        System.out.println("Aciertos " +  (bien / intentos) * 100 + "%");
    }
}
