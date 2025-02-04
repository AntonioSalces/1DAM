package eticket;

/** Product
 * Mantiene la información de un producto
 * Información que mantiene:
 * code: Código del producto (se debe autogenerar empezando en 1)
 * brand: Marca del producto
 * model: Modelo del producto
 * tradeName: Nombre comercial del producto
 * price: Precio del producto
 * Nota:
 * - Getters de cada uno de los campos
 * - Debes implementar el método equals que indica si un producto es igual a otro
 *   para ello se deben comparar los códigos de productos y así determinar si son iguales o no
 * - Se debe poder imprimir la información de un producto de la siguiente forma:
 * Ej:
 *   Código: 7
 *   Marca: C&A
 *   Modelo: G123456
 *   Nombre comercial: Vestido señora
 *   Precio: 119,95 €
 */
public class Product implements ProductInterface{
    private int code;
    private static int siguienteCodigo = 1;
    private String brand;
    private String model;
    private String tradeName;
    private double price;

    public Product(String brand, String model, String tradeName, double price) {
        this.code = siguienteCodigo++;
        this.brand = brand;
        this.model = model;
        this.tradeName = tradeName;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getCode() {
        return code;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    
    public String getTradeName() {
        return tradeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass() || obj == null) {
            return false;
        }

        Product product = (Product) obj;
        return product.code == this.code;
    }

    @Override
    public String toString() {
        return String.format("""
            Código: %d
            Marca: %s
            Modelo: %s
            Nombre comercial: %s
            Precio: %.2f""", code, brand, model, tradeName, price);
    }
}
