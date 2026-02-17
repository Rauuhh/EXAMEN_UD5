package org.example.Redes;

public class Basico extends Usuario{


    public Basico(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
    }

    @Override
    public void mostrarInfo(){
        System.out.println();

        System.out.println("Informacion de la Persona normal");
       super.mostrarInfo();

    }
}
