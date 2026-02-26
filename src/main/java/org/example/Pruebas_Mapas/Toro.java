package org.example.Pruebas_Mapas;

import java.util.HashMap;
import java.util.Map;

public class Toro {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int casos = in.nextInt();
        if (casos == 0)
            return false;
        else {

            Map<String,Integer> mapita = new HashMap<>();
            for (int i = 0; i < casos; i++) {
                String alumno = in.next();
                String estado = in.next();

                if (mapita.containsKey(alumno)) {
                    if (estado.equals("CORRECTO")) {
                        mapita.put(alumno, mapita.get(alumno) + 1);
                    } else {
                        mapita.put(alumno, mapita.get(alumno) - 1);
                    }
                } else {
                    if (estado.equals("CORRECTO")) {
                        mapita.put(alumno, 1);
                    } else {
                        mapita.put(alumno, -1);
                    }
                }
            }

            for (Map.Entry<String,Integer> map : mapita.entrySet()){
                System.out.println(map.getKey() + ", " + map.getValue());
            }
            System.out.println("---");
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}