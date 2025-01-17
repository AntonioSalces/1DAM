package bloque2.ej3juanan.clases;

public interface DiscoCrud {
    public Disco crear(Disco d);
    public Disco[] consultar();
    public Disco consultarPorID(String id);
    public Disco actualizar(String id, Disco d);
    public Disco borrar(String id);
    
} 
