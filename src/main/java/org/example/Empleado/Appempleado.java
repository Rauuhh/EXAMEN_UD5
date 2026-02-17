package org.example.Empleado;

import java.util.ArrayList;

public class Appempleado {
    static void main() {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Empleado em1 = new Desarrollador();
        Empleado em2 = new Diseñador();
        Empleado em3 = new Gerente();

        listaEmpleados.add(em1);
        listaEmpleados.add(em2);
        listaEmpleados.add(em3);


        System.out.println("=== Usando Array Polimorfico === ");
        for (Empleado empleado : listaEmpleados){
            empleado.realizarTarea();
        }

        System.out.println();
        System.out.println("=== Metodo asignarTarea ===");
        asignarTarea(em3);
        asignarTarea(em1);
    }
    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }

}
