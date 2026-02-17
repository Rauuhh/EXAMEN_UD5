package org.example.Redes;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public void anyadirColaboracion(String colabo){
        colaboraciones.add(colabo);
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    @Override
    public void mostrarInfo(){
        System.out.println();
        System.out.println("Indormacion del influencer:");
        super.mostrarInfo();
        System.out.println("Colaboraciones");
        for (String lista : colaboraciones){
            System.out.print(lista);
            System.out.print(", ");
        }
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + colaboraciones +
                '}';
    }
}
