package org.example.DispositivosInteligentes;

import java.util.ArrayList;

public class AppDispositivo {
    static void main() {
        ParlanteInteligente alexa = new ParlanteInteligente("Alexa");
        Televisor lg = new Televisor("LG");
        AireAcondicionado bosch = new AireAcondicionado("Bosch");

        ArrayList<Dispositivo> listaDispositivo = new ArrayList<>();
        listaDispositivo.add(alexa);
        listaDispositivo.add(lg);
        listaDispositivo.add(bosch);

        for (Dispositivo de : listaDispositivo){
            System.out.println("--------------");
            de.encender();
            if (de instanceof ControlRemoto){
                ((ControlRemoto) de).sincronizar();
            }
            de.mostrarEstado();
            de.apagar();
        }
        Dispositivo microondas = new Dispositivo("Microondas") {
        @Override
        void encender() {
            System.out.println( getNombre() + " encendido");
        }

        };
        microondas.encender();
        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            void encender() {
                if (isEstado()){
                    System.out.println("El proyector ya esta encendido");
                }else{
                    System.out.println("el proyector " + getNombre() + " se esta encendiendo...");
                    setEstado(true);
                }

            }

        };

        proyector.encender();
        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno= new Dispositivo("Balay") {
            @Override
            void encender() {
                if (isEstado()){
                    System.out.println("El hrono ya esta encendido");
                }else{
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }

            }

        };

        horno.encender();
        listaDispositivo.add(horno);
        listaDispositivo.add(proyector);

        for (Dispositivo de : listaDispositivo){
            System.out.println("--------------");
            de.encender();
            if (de instanceof ControlRemoto){
                ((ControlRemoto) de).sincronizar();
                proyector_sinc.sincronizar();
            }else if(de.getNombre().equals("Optoma")){
                proyector_sinc.sincronizar();

            }
            de.mostrarEstado();
            de.apagar();
        }
    }


}
