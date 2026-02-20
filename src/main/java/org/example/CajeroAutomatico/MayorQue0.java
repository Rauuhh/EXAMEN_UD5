package org.example.CajeroAutomatico;

public class MayorQue0 extends RuntimeException {
    public MayorQue0() {
        super("Tienes que mover al menos 1 centimo");
    }
}
