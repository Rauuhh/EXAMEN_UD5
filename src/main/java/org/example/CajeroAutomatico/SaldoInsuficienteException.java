package org.example.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {

        super("No tienes tanto saldo para retirar");
    }
}
