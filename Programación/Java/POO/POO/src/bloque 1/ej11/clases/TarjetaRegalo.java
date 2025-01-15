package ej11.clases;

public class TarjetaRegalo {
    private double saldo;
    private int codigo;

    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        codigo = (int)(Math.random()*100000);
    }

    public void gasta(double cantidad){
        if (saldo >= cantidad) {
            saldo -= cantidad;
        }else{
            System.out.println("No tiene suficiente saldo para gastar " + cantidad + " euros");
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        TarjetaRegalo tarjeta = new TarjetaRegalo(this.saldo + t.saldo);
        this.saldo = 0;
        t.saldo = 0;
        return tarjeta;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta no %05d - Saldo %.2f euros", codigo, saldo);
    }
}

