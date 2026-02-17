package org.example.DispositivosInteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto");
    }

    @Override
    void encender() {
        if (!super.isEstado()){
            System.out.println("Encenidendo aire acondicionado");
            setEstado(true);
        }else{
            System.out.println("El aire acondicionado ya esta encendido");
        }
    }
}
