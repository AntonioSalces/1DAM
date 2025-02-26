package recordsYEnums.ej2;

public class App {
    public static void main(String[] args) {
        Biblioteca bl = new Biblioteca(2);

        Libro l1 = new Libro("l1", "l1", 1, Genero.FICCION);
        Libro l2 = new Libro("l2", "l2", 2, Genero.NOFICCION);
        Libro l3 = new Libro("l3", "l3", 3, Genero.CIENCIA);


        bl.aniadirLibro(l1);
        bl.aniadirLibro(l2);
        bl.aniadirLibro(l3);

        bl.mostrarLibros();

        bl.buscarPorGenero(Genero.FICCION);
        bl.buscarPorGenero(Genero.NOFICCION);
        bl.buscarPorGenero(Genero.CIENCIA);
    }
}
