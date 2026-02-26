package org.example.CopaDelRey;

public class NumeroDorsal extends RuntimeException {
    public NumeroDorsal() {
        super("No se puede repetir dorsal");
    }
}
