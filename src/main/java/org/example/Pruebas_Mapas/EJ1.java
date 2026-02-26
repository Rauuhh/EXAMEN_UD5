package org.example.Pruebas_Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ1 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        Map<String, Integer> mapa = new HashMap<>();
        System.out.println("Introduce una frase...");
        String frase = entrada.nextLine();

        for (String pala : frase.split(" ")){
            mapa.put(pala,mapa.getOrDefault(pala,0)+1);
        }

        for (Map.Entry<String,Integer> map : mapa.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }



}
