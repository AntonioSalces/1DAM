import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implementación de la interfaz IGestor para la clase Contacto.
 * Gestiona una colección de contactos permitiendo operaciones CRUD y persistencia.
 * 
 * Los atributos son:
 * - contactos: HashMap que almacena los contactos usando el ID como clave
 * - nextId: Entero que mantiene el siguiente ID disponible para nuevos contactos
 * - nombreArchivo: String con la ruta del archivo para persistencia de datos
 */
public class Gestor implements IGestor<Contacto> {
    private HashMap<Integer, Contacto> contactos;
    private String nombreArchivo;
    private static int nextId;
    
    /**
     * Constructor que inicializa el gestor con un archivo específico.
     * 
     * @param nombreArchivo El nombre del archivo .data para persistencia
     */
    public Gestor(String nombreArchivo) {
        this.contactos = new HashMap<>();
        this.nombreArchivo = nombreArchivo;
        cargarDesdeArchivo();
        File file = new File(this.nombreArchivo);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int maxId = 0;
        for(Contacto c : listarTodos()) {
            if (c.getId() >= maxId)
                maxId = c.getId();
        }
        nextId = maxId + 1;
    }
    
    /**
     * Constructor por defecto que inicializa el gestor sin archivo.
     */
    public Gestor() {
        this.contactos = new HashMap<>();
        nextId = 1;
    }

    @Override
    public int agregar(Contacto entidad) {
        if (contactos.containsKey(entidad.getId())) {
            return 0;
        }
        int id = entidad.getId()==null?nextId:entidad.getId();
        contactos.put(id, entidad);
        if (nombreArchivo != null) {
            guardarEnArchivo(); 
        }
        nextId++;
        return id;
    }

    @Override
    public boolean actualizar(int id, Contacto entidadActualizada) {
        entidadActualizada.setId(id);
        if (contactos.containsKey(id)) {
            contactos.put(id, entidadActualizada);
            if (this.nombreArchivo != null) {
                guardarEnArchivo();
            }
            return true;            
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        boolean esta = false;
        for(Contacto c : listarTodos()) {
            if (c.getId() == id){
                esta = true;
                contactos.remove(c.getId());
            }
        }
        if (!esta) {
            return false;
        } else if (this.nombreArchivo == null) {
            return true;
        } else {
            guardarEnArchivo();
            return true;
        }
    }

    @Override
    public Contacto buscarPorId(int id) {
        if(contactos.containsKey(id)){
            return contactos.get(id);
        }
        return null;
    }

    @Override
    public List<Contacto> listarTodos() {
        List<Contacto> lista = new ArrayList<>();
        for(Contacto c : contactos.values()) {
            if (c != null)
                lista.add(c);
        }
        return lista;
    }

    @Override
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public int cargarDesdeArchivo() {
        String linea = "";
        int total = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(this.nombreArchivo));
            while ((linea = br.readLine()) != null) {
                Contacto c = new Contacto(linea);
                contactos.put(c.getId(), c);
                total++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return total;
    }

    @Override
    public boolean guardarEnArchivo() {
        try  {
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.nombreArchivo));
            for(Contacto c : contactos.values()){
                if (c.getId() == null) {
                    c.setId(nextId);
                }
                bw.write(c.serializar());
                bw.newLine();
            }
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
} 