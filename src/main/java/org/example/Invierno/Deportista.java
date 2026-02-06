package org.example.Invierno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deportista {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listaModalidades;

    public Deportista(String nombre, int dia, int mes, int ano) {
        this.nombre = nombre;
        fecha_nacimiento = LocalDate.of(ano,mes,dia);
        this.medallas = 0;
        this.equipo = new Equipo("");
        listaModalidades = new ArrayList<>();
    }

    public void verModalidades(){
        for (String dep : listaModalidades){
            System.out.println(" - " + dep);
        }
    }

    public void inscribirse(String modalidad ){

        listaModalidades.add(modalidad);

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ArrayList<String> getListaModalidades() {
        return listaModalidades;
    }

    public void setListaModalidades(ArrayList<String> listaModalidades) {
        this.listaModalidades = listaModalidades;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", medallas=" + medallas +
                ", equipo=" + equipo.getPais() +
                ", listaModalidades=" + listaModalidades +
                '}';
    }
}
