package ej13.clases;

public class CuentaCorriente {
    private long cc;
    private double saldo;

    public CuentaCorriente(){
        cc = (long)(Math.random()*10000000000l);
        saldo = 0;
    }

    public CuentaCorriente(double saldo){
        cc = (long)(Math.random()*10000000000l);
        this.saldo = saldo;
    }

    public void ingreso(double cantidad){
        saldo += cantidad;
    }

    public void cargo(double cantidad){
        saldo -= cantidad;
    }

    public void transferencia(CuentaCorriente c, double cantidad){
        c.saldo += cantidad;
        saldo -= cantidad;
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %d Saldo: %.02f euros", cc, saldo);
    }
}
