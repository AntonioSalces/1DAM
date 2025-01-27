package FileSystem;

/** clase Folder
 * Hereda de la clase File e implementa la interfaz FolderEntry
 * La clase Folder mantiene una lista de archivos/carpetas así como una referencia
 * a la carpeta que la contiene
 * La clase Folder al heredar de la clase File hereda sus propiedades
 * name, level y createdAt
 * Además dispondrá de un array donde se irán añadiendo los archivos que están dentro de
 * la carpeta
 * Debe implementar la interfaz FolderEntry
 * Debe tener un constructor que recibirá la carpeta que la contiene, en el caso
 * de que sea la carpeta raiz, recibirá null en la referencia a la carpeta padre
 * Además el constructor recibirá el nombre de la carpeta así como el nivel en el que se
 * encuentra la carpeta (Nivel 0 es la carpeta raiz, Nivel 1 las carpetas hijas de la carpeta raiz,
 * y así sucesivamente)
 * Ejemplo de llamada al constructor:
 * Folder root = new Folder(null, "Raiz", 0);
 * 
 */

public class Folder extends File implements FolderEntry{
    private File[] files;
    private Folder parent;
    private int position;

    public Folder(Folder parent, String fileName, int level){
        super(fileName, level);
        this.parent = parent;
        files = new File[100];
        position = -1;
        position++;
    }

    @Override
    public boolean isDirectory(){
        return true;
    }

    @Override
    public Folder getParent() {
        return parent;
    }

    @Override
    public boolean isFolderFull() {
        if (position > 99) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getFileCount() {
        return position;
    }

    @Override
    public boolean isFileInFolder(String fileName) {
        for (int i = 0; i < position; i++) {
            if (files[i].getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
        if (position > 99) {
            throw new FolderIsFullException();
        } else if (isFileInFolder(folderName)) {
            throw new FileAlreadyExistsException();
        }else{
            Folder files = new Folder(this.parent, folderName, this.level + 1);
            return files;
        }
    }

    @Override
    public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {
        if (position > 99) {
            throw new FolderIsFullException();
        } else if (isFileInFolder(fileName)) {
            throw new FileAlreadyExistsException();
        }else{
        File file = new File(fileName);
        files[position] = file;
        file.setLevel(this.level + 1);
        position++;
        return file;
        }
    }

    @Override
    public File removeFile(String fileName) throws FileDoesNotExistsException {
        if (!isFileInFolder(fileName)) {
            throw new FileDoesNotExistsException();
        }
        File file = new File(fileName);
        for (int i = 0; i < position; i++) {
            if (files[i].getName().equals(fileName)) {
                files[i] = files[i + 1]; //En lugar de poner a nulo la posición, envío una posición a la izquierda todas las que hay a su derecha
            }
        }
        position--;
        return file;
    }

    @Override
    public File removeFolder(String folderName, boolean recursive)
            throws FileDoesNotExistsException, FolderIsNotEmptyException {
                if (!isFileInFolder(folderName)) {
                    throw new FileDoesNotExistsException();
                }else if(recursive == false && position != 0){
                    throw new FolderIsNotEmptyException();
                }
                Folder _files = new Folder(parent, folderName, position);
                for (int i = 0; i < position; i++) {
                    if (files[i].getName().equals(folderName)) {
                        _files.setFileName(files[i].getName());
                        _files.setParent(getParent());
                        files[i] = files[i + 1]; //En lugar de poner a nulo la posición, envío una posición a la izquierda todas las que hay a su derecha
                    }
                }
                position--;
                return _files;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

    @Override
    public Folder getFolder(String folderName) throws FileDoesNotExistsException {
        return parent;
    }

    private void printSoon(){
        for (int i = 0; i < position; i++) {
            System.out.print(files[i]);
        }
    }

    public String toString() {
        return String.format("%s/_%s%s%s\n%s", calculateSpacing(level), isDirectory()?"(":"", fileName, isDirectory()?")":"");
    }
}