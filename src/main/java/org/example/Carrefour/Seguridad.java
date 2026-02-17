package org.example.Carrefour;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Seguridad extends Persona{

    private String empresa;
    private ArrayList<String> armas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        armas = new ArrayList<>();
    }

    public void anyadirArma(String arm){
        armas.add(arm);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Empresa: " + empresa);
        System.out.println("Armas que tiene:");
        for (String arma : armas){
            System.out.println(arma);
        }
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "armas=" + armas +
                '}';
    }

    @Override
    public void trabajar() {
        System.out.println("Vigilar a sospechosos...");
    }
}
