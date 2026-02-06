package org.example.Invierno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Equipo {
    private String pais;
    private ArrayList<Deportista> listaDeportistas;
    public Equipo(String pais) {
        this.pais = pais;
        listaDeportistas = new ArrayList<>();
    }

    public void inscribirDeportista(Deportista deportista){
        listaDeportistas.add(deportista);
        deportista.setEquipo(new Equipo(pais));
    }

    public int medallasTotales(){
        int meda = 0;
        for ( Deportista dep : listaDeportistas){
            meda += dep.getMedallas();
        }
        return  meda;
    }

    public void verMedallero(){
        for ( Deportista dep : listaDeportistas){
            if (dep.getMedallas() >= 1){
                System.out.println(" - " + dep.getNombre() + " ha ganado " + dep.getMedallas());
            }
        }
    }
    public Deportista deportistaTOP(){
        Deportista joven = listaDeportistas.getFirst();
        for (Deportista dep : listaDeportistas){
            if ( joven.getMedallas() <   dep.getMedallas()){
                joven = dep;
            }
        }

        return joven;
    }
    public void verMedallasDeportista(Deportista deportista){
        if (listaDeportistas.contains(deportista)){
            if (deportista.getMedallas() == 0){
                System.out.println("El deportista " + deportista.getNombre() + " de " + pais + " no ha ganado ninguna medalla en estos JJOO");
            }else{
                System.out.println("El deportista " + deportista.getNombre() +" ha ganado " + deportista.getMedallas() + " medalla/s");
            }
         }else{
            System.out.println("El deportista " + deportista.getNombre() + " no esta en el equipo" + pais);
            }
    }

    public Deportista deportistaMasJoven(){
            Deportista joven = listaDeportistas.getFirst();
            for (Deportista dep : listaDeportistas){
                if ( joven.getFecha_nacimiento().isBefore(dep.getFecha_nacimiento())){
                    joven = dep;
                }
            }

        return joven;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }
}
