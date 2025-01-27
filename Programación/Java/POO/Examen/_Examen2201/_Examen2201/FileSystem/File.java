package FileSystem;
import java.util.Date;

/** clase File 
 * Implementa la interfaz FileEntry
 * Tiene que almacenar el nombre del archivo (fileName de tipo String)
 * Tiene que almacenar la fecha de creación (createdAt de tipo Date)
 * Date es una clase que hay que crear con new. Ej. this.createdAt = new Date()
 * Si quieres imprimir la fecha que ha almacenado en la variabel createdAt simplemente haz:
 * System.out.print(this.createdAt)
 * Tiene que almacenar el level en el que se encuentra el archivo
 * Ej: Si el archivo está en la raiz del sistema de archivos está en el level 0
 * Si está dentro de una carpeta que está en la raiz del disco está en el level 1
 * y así sucesivamente
 * Tiene que haber un constructor que recibe solo el nombre del archivo
 * En este caso el level se configurar a 0
 * Tiene que haber un constructor que recibe el nombre del archivo y el level
 * En ambos constructores se inicializa la fecha de creación con new Date()
 */

public class File implements FileEntry{
    protected String fileName;
    private Date createdAt;
    protected int level;

    public File(String fileName){
        this.fileName = fileName;
        createdAt = new Date();
        level = 0;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public File(String fileName, int level){
        this.fileName = fileName;
        createdAt = new Date();
        this.level = level;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public String getName() {
        return this.fileName;
    }

    protected String calculateSpacing(int level){
        String spaces = "";
        for (int i = 0; i < level; i++) {
            spaces += "  ";
        }
        return spaces;
    }

    @Override
    public String toString() {
        return String.format("%s/_%s %s", calculateSpacing(level), fileName, createdAt);
    }

    
}
