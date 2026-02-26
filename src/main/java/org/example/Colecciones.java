package org.example;

import java.util.*;

public class Colecciones {
    static void main() {
        Scanner entyrada = new Scanner(System.in);
        /*
        ArrayList<Integer> listaNums = new ArrayList<>();
        Stack<Integer> pila = new Stack<>();

        pila.push(2);
        pila.push(9);
        pila.push(12);
        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());
        Queue<Integer> cola = new LinkedList<>();
        Map<Integer,Integer> hola = new HashMap<>();

         */

        Stack<Character> lista = new Stack<>();
        lista.push('s');
        lista.push('j');
        lista.push('k');
        lista.push('r');
        lista.push('w');
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        System.out.println(lista.peek());
        System.out.println(lista.pop());


        Stack<Integer> orden = new Stack<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce numero " + (i+1));
            orden.push(entyrada.nextInt());
        }
        System.out.println("Numeros en orden inverso");
        for (int i = orden.size(); i > 0; i--) {
            System.out.println(orden.peek());
            orden.pop();
        }
    }
}
