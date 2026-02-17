package org.example.Carrefour;

import java.util.ArrayList;

public class CarrefourApp {
    static void main() {
        Cajero jorge = new Cajero(147,"Jorge",800);
        jorge.mostrarInfo();
        System.out.println();
        Reponedor jorg = new Reponedor(178,"Jorge",1000,5);
        jorg.mostrarInfo();
        System.out.println();
        Seguridad jor = new Seguridad(179,"Jorge", 1200,"Securitas");
        jor.anyadirArma("Palo");
        jor.anyadirArma("Taser");
        jor.mostrarInfo();


        Persona manuel = new Cajero(101,"Manuel",800);
        ArrayList<Persona> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(manuel);
        listaEmpleados.add(jor);

        fichar(manuel);
        fichar(jor);

        jorge.trabajar();
        jorg.trabajar();

    }
    public static void fichar(Persona persona){
        System.out.println("Fichando...");
    }
}
