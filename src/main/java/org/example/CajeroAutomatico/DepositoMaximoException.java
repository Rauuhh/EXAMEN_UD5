package org.example.CajeroAutomatico;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("No puedes ingresar mas del limite");
    }
}
