package clases;

public class Candidato {
    private int id;
    private float talento;
    private float suerte;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public float getSuerte() {
        return suerte;
    }
    public void setSuerte(float suerte) {
        this.suerte = suerte;
    }

    public float getTalento() {
        return talento;
    }
    public void setTalento(float talento) {
        this.talento = talento;
    }

    public void calcularSuerteYTalento(){
            talento = (float)(Math.random());
            suerte = (float)(Math.random());
            float resultadoTotal = (talento*95)+(suerte*5);
            System.out.println("Talento= " + talento*95);
            System.out.println("Suerte= " + suerte*5);
            System.out.printf("Resultado total: |%f|%n%n", resultadoTotal);
    }
}
