package org.example.Pruebas_Mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {
    static void main() {
        HashMap<String,String> concejales = new HashMap<>();
        concejales.put("Enrique Pastor","Juventud y tiempo Libre");
        concejales.put("Lola Rodriguez","Familia, fiestas y jardines");

        System.out.println(concejales.keySet());
        System.out.println(concejales.values());
        System.out.println(concejales.get("Enrique Pastor"));
       for (Map.Entry<String,String> mapa : concejales.entrySet()){
           System.out.println("El concejal " + mapa.getKey() + " tiene el cargo " +  mapa.getValue());
       }
    }
}
