package org.example.Interfaz;

import java.util.ArrayList;

public class VoladorApp {
    static void main() {

        Superman clack_kent = new Superman();
        Pajaro piolin = new Pajaro();

        clack_kent.volar();
        piolin.volar();

        clack_kent.alientoHielo();
        clack_kent.rayoLaser();

        Spiderman peter_parker = new Spiderman();

        ArrayList<Superheroe> lista = new ArrayList<>();
        lista.add(clack_kent);
        lista.add(peter_parker);

        for (Superheroe supe : lista){

            if (supe instanceof Superman){
                ((Superman) supe).alientoHielo();
                ((Superman) supe).volar();
                ((Superman) supe).rayoLaser();
            }
        }
    }
}
