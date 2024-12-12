import clases.Candidato;

public class App {
    public static void main(String[] args) throws Exception {
        Candidato[] candidatos = new Candidato[20];
        for (int i = 0; i < candidatos.length; i++) {
            Candidato candidato = new Candidato();
            candidatos[i] = candidato;
            candidatos[i].calcularSuerteYTalento();
        }
    }
}
