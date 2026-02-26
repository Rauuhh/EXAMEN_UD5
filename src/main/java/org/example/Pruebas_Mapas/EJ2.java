package org.example.Pruebas_Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ2 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        Map<Character, Integer> mapa = new HashMap<>();
        System.out.println("Introduce una frase...");
        String palabra = entrada.nextLine();

        for (char pala : palabra.toCharArray()){
            if (mapa.containsKey(pala)){
                mapa.put(pala,mapa.get(pala)+1);
            }else{
                mapa.put(pala,1);
            }
        }

        for (Map.Entry<Character,Integer> map : mapa.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
