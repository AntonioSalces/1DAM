package interfaces.ej1;

public class App {
    public static void main(String[] args) {
        Documento d1 = new DocumentoPDF(12345);
        Documento d2 = new DocumentoPDF(1234567891);

        Imagen im = new ImagenJPG(2500, 1900);

        Video v = new VideoMp4(4);

        Validable[] arr = {d1, v};

        ServicioValidacion sv = new ServicioValidacion(arr);

        if (sv.validarFicheros()) {
            System.out.println("Todo ok");
        } else {
            System.out.println("No todo ok");
        }
    System.out.println(v.isValid());

    System.out.println(im.isValid());

    System.out.println(d2.isValid());
    }
}
