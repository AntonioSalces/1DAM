package ej1.clases;

public class Cuenta {
    private float saldo;

    public float depositar(float cantidad){
        saldo += cantidad;
        return saldo;
    }

    public float retirar(float cantidad){
        saldo -= cantidad;
        return cantidad;
    }

    public float consultar(){
        return saldo;
    }
}
