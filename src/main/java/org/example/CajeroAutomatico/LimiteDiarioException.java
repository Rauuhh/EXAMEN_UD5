package org.example.CajeroAutomatico;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("No puedes retirar mas del limite");
    }
}
