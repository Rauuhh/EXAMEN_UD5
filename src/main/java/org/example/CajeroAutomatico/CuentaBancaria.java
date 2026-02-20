package org.example.CajeroAutomatico;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(int monei){
        if (monei > 3000){
            throw new DepositoMaximoException();
        } else if (monei<0) {
            throw new MayorQue0();
        } else {
            saldo += monei;
        }
    }
    public void retirarDinero(int monei){
        if (saldo < monei){
         throw new SaldoInsuficienteException();
        }else if (monei > 600){
            throw new LimiteDiarioException();
        }
        else if (monei<0) {
            throw new MayorQue0();
        } else{
            saldo -= monei;

        }
    }

    public void consultarSaldo(){
        System.out.println("Tienes " + saldo + " € disponible");
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
