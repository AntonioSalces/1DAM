package ej1.clases;

public class ArticuloAlimenticio extends Articulo{
    String fechaCaducidad;
    float temperaturaConservacion;

    public ArticuloAlimenticio(String descripcion, float precioCompra, float precioVenta, String fechaCaducidad, float temperaturaConservacion){
        super(descripcion, precioCompra, precioVenta);
        this.fechaCaducidad = fechaCaducidad;
        this.temperaturaConservacion = temperaturaConservacion;
    }

    @Override
    public String toString() {
        return String.format("""
                            %s
                            Fecha de caducidad: %s
                            Temperatura de conservacion: %.2f
                            %s""", super.toString(), fechaCaducidad, temperaturaConservacion, calcularRayas(getDescripcion()));
    }
}
