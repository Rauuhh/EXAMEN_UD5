package org.example.CopaDelRey;

import java.util.ArrayList;

public class AppMutxamelFc {
    static ArrayList<MutxamelFC> listaEquipos = new ArrayList<>();
    static void main() {


        Jugador jorge = new Jugador("Jorge",21,Equipos.SENIOR,8,Posiciones.PORTERO);
        Jugador christian = new Jugador("Christian",20,Equipos.SENIOR,5,Posiciones.DEFENSA);
        Jugador jacobo = new Jugador("Jacobo",20,Equipos.SENIOR,9,Posiciones.DELANTERO);
        Jugador eric = new Jugador("Eric", 25,Equipos.SENIOR, 7, Posiciones.CENTROCAMPISTA);

        listaEquipos.add(jorge);
        listaEquipos.add(christian);
        listaEquipos.add(jacobo);
        listaEquipos.add(eric);

        Entrenador angel = new Entrenador("Angel", 19,Equipos.SENIOR,"4-4-2");

        listaEquipos.add(angel);

        Masajista DeividG = new Masajista("David",21,"Dedeador de tiktok",-3);

        listaEquipos.add(DeividG);

        Acompañante moderboar = new Acompañante("Denis",19,eric,"Novio");

        listaEquipos.add(moderboar);

        for (MutxamelFC hola : listaEquipos){
            if (hola instanceof Jugador){
                hola.concentrarse();
            }
        }

    }
}
