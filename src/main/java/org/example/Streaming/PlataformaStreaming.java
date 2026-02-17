package org.example.Streaming;

import java.util.ArrayList;

public class PlataformaStreaming {
    static void main() {
        ArrayList<Subscripcion> listaPlanes = new ArrayList<>();

        Subscripcion sub1 = new PlanGratis("Gratis",0.0);
        Subscripcion sub2 = new PlanBasico("Basico",9.99);
        Subscripcion sub3 = new PlanPremium("Premium",14.99);
        Subscripcion sub4 = new PlanFamiliar("Familiar",19.99);


        listaPlanes.add(sub1);
        listaPlanes.add(sub2);
        listaPlanes.add(sub3);
        listaPlanes.add(sub4);

        for (Subscripcion sub : listaPlanes){
            sub.mostrarInfo();
            sub.obtenerBeneficios();
            sub.obtenerPeriodoPrueba();
            System.out.println();
        }
    }
}
