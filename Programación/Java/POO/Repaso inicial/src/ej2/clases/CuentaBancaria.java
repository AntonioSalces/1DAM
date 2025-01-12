package ej2.clases;

public class CuentaBancaria {
    private String numeroCuenta;
    private int saldo;
    private String titular;

    public CuentaBancaria(String numeroCuenta, int saldo, String titular){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void operarCuenta(){
        System.out.println("Indique que quiere hacer con la cuenta:");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar dinero");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion == 1) {
            System.out.print("Indica cuanto dinero quiere depositar: ");
            setSaldo(this.saldo+=Integer.parseInt(System.console().readLine()));
        }else if (opcion == 2){
            System.err.print("Indica cuanto dinero quiere sacar: ");
            int retirado = Integer.parseInt(System.console().readLine());
            if (getSaldo() < retirado) {
                System.out.println("No puede sacar tanto dinero");
            }else{
                setSaldo(this.saldo-=retirado);
            }
        }
        else if(opcion == 3){
            System.out.println("Tiene un total de " + getSaldo() + " euros");
        }
    }
}
