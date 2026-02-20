package org.example.Excepciones;

public class PruebaExcepciones {
    static void main() {
        int edad = 15;

        if (edad <= 18){
            throw new EdadValida();
        }
    }
}
