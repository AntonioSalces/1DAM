/**
 * Clase para gestionar información de contactos empresariales.
 * Almacena nombre, apellidos, cargo, email, teléfono e identificador.
 * 
 * Los atributos son:
 * - nombre: String con el nombre del contacto
 * - apellidos: String con los apellidos del contacto  
 * - cargo: String con el puesto o cargo en la empresa
 * - email: String con el correo electrónico profesional
 * - telefono: String con el número de teléfono de contacto
 * - id: Integer con el identificador único del contacto
 * 
 * Implementa la interfaz Serializable para permitir la persistencia.
 */
public class Contacto implements IContacto {
    private String nombre;
    private String apellidos;
    private String cargo;
    private String email;
    private String telefono;
    private Integer id;

    /**
     * Constructor para inicializar un nuevo contacto sin ID asignado.
     * 
     * @param nombre Nombre del contacto
     * @param apellidos Apellidos del contacto
     * @param cargo Cargo o puesto en la empresa
     * @param email Correo electrónico
     * @param telefono Número de teléfono
    */
    public Contacto(String nombre, String apellidos, String cargo, String email, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.email = email;
        this.telefono = telefono;
    }
    
    /**
     * Constructor para inicializar un nuevo contacto con ID específico.
     * 
     * @param id Identificador único del contacto
     * @param nombre Nombre del contacto
     * @param apellidos Apellidos del contacto
     * @param cargo Cargo o puesto en la empresa
     * @param email Correo electrónico
     * @param telefono Número de teléfono
     */
    public Contacto(Integer id, String nombre, String apellidos, String cargo, String email, String telefono) {
        if (id == null) {
            id = 1;
        }
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.email = email;
        this.telefono = telefono;
    }
    
    /**
     * Constructor que inicializa un contacto a partir de una cadena serializada.
     * El formato esperado es: id;nombre;apellidos;cargo;email;telefono
     * 
     * @param cadena La cadena serializada con el ID y datos del contacto
     * @throws IllegalArgumentException Si el formato de la cadena es inválido
     * @throws NumberFormatException Si el ID no es un número válido
     */
    public Contacto(String cadena) {
        String[] datos = cadena.split(";");

        if (datos.length != 6) {
            throw new IllegalArgumentException();
        }

        this.id = Integer.parseInt(datos[0]);
        this.nombre = datos[1];
        this.apellidos = datos[2];
        this. cargo = datos[3];
        this.email = datos[4];
        this.telefono = datos[5];
    }

    @Override
    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getApellidos() {
        return this.apellidos;
    }

    @Override
    public String getCargo() {
        return this.cargo;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String serializar() {
        return String.format("%d;%s;%s;%s;%s;%s", id, nombre, apellidos, cargo, email, telefono);
    }

    @Override
    public String toString() {
        return String.format("🔖 FICHA DE CONTACTO%n🔑 ID: %d%n👤 Nombre: %s%n💼 Cargo: %s%n📧 Email: %s%n📞 Teléfono: %s", 
        id, getNombre(), cargo, email, telefono);
    }
} 