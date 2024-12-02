package clases;

public class perro {

    public int metros;
    public String guau;
    public String amo;

    public perro(int metros, String guau, String amo){
        this.metros = metros;
        this.guau = guau;
        this.amo = amo;
    }

    public void ladrar(){
        System.out.println("El perro dice" + guau);
    }

    public void andar(){
        System.out.println("El perro ha andado " + metros + " metros.");
    }
    
    public void amo(){
        System.out.println("El amo del perro es " + amo);
    }

    
    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }


    public String getAmo() {
        return amo;
    }

    public void setAmo(String amo) {
        this.amo = amo;
    }


    public String getGuau() {
        return guau;
    }

    public void setGuau(String guau) {
        this.guau = guau;
    }
    
}
