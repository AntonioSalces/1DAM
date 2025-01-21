/*
 * Ejercicio 5: GESTISIMAL con Herencia
Crea un programa llamado GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el control de un almacén. El programa debe gestionar artículos genéricos y permitir una futura ampliación mediante herencia para diferentes tipos de artículos. Los artículos deben estar organizados jerárquicamente. Define al menos las siguientes clases:

Artículo (clase base):
Atributos: código, descripción, precio de compra, precio de venta, stock.
Métodos: getters, setters, toString(), y cualquier otro necesario para la gestión básica.

ArtículoAlimenticio (subclase de Artículo):
Atributos adicionales: fecha de caducidad y temperatura de conservación recomendada.
Métodos específicos relacionados con estos atributos.

ArtículoTecnológico (subclase de Artículo):
Atributos adicionales: garantía (en meses) y tipo de tecnología (por ejemplo, "móvil", "televisor", etc.).
Métodos específicos relacionados con estos atributos.

El menú del programa debe incluir, al menos, las siguientes opciones:
Listado general de artículos (incluyendo todos los tipos).
Alta de un artículo (debe permitir especificar si es genérico, alimenticio o tecnológico).
Baja de un artículo.
Modificación de un artículo.
Entrada de mercancía (incrementa el stock).
Salida de mercancía (decrementa el stock, controlando que no sea negativo).
Salir.

El programa debe cumplir con las siguientes características:
Control de unicidad del código: No pueden existir dos artículos con el mismo código.
Entrada y salida de mercancías: Controla que no se pueda sacar más stock del disponible.
Listado: Muestra todos los artículos y sus atributos específicos, dependiendo de su tipo.
Alta y modificación: Permite gestionar los atributos comunes y específicos de cada tipo de artículo.
Ejemplo de funcionamiento:

markdown
Copiar
Editar
G E S T I S I M A L
===================
1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir
Introduzca una opción: 2
NUEVO ARTÍCULO
==============
Seleccione el tipo de artículo:
1. Genérico
2. Alimenticio
3. Tecnológico
Opción: 2
Por favor, introduzca los datos del artículo.
Código: ali01
Descripción: Yogur natural
Precio de compra: 0.50
Precio de venta: 1.00
Stock: 500
Fecha de caducidad (YYYY-MM-DD): 2025-02-15
Temperatura recomendada (ºC): 4
El programa debe estar diseñado utilizando POO (Programación Orientada a Objetos), respetando los principios de encapsulación, herencia y polimorfismo.
 */

package ej1.clases;

public class Articulo {
    private String codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int stock;

    public Articulo(String descripcion, float precioCompra, float precioVenta){
        codigo = generarCodigo(5);
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        stock = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private String generarCodigo(int tamaño){
        String codigo = "";
        char minLetra = 'A';
        char maxLetra = 'Z';
        char minNumero = '0';
        char maxNumero = '9';
        for (int i = 0; i < tamaño; i++) {
            if (Math.random() < 0.5) {
                codigo += (char)(Math.random() * (maxLetra - minLetra + 1) + minLetra);
            }else{
                codigo += (char)(Math.random() * (maxNumero - minNumero + 1) + minNumero);
            }
        }
        return codigo;
    }

    protected String calcularRayas(String descripcion){
        for (int i = 0; i < descripcion.length()+13; i++) {
            descripcion += "-";
        }
        return descripcion;
    }

    @Override
    public String toString() {
        return String.format("""
                            %s
                            Código: %s
                            Descripcion: %s
                            Precio de compra: %.2f
                            Precio de venta: %.2f
                            Stock: %d""", calcularRayas(descripcion), codigo, descripcion, precioCompra, precioVenta, stock);
    }
}
