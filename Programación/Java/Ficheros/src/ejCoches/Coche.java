    package ejCoches;

    public class Coche {
        private int id;
        private String marca;
        private String modelo;
        private int anio;
        private double precio;

        public Coche(int id, String marca, String modelo, int anio, double precio) {
            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.precio = precio;
        }

        public int getAnio() {
            return anio;
        }

        public int getId() {
            return id;
        }
        
        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }
        
        public double getPrecio() {
            return precio;
        }
        

        
        @Override
        public String toString() {
            return String.format("ID: %s, Marca: %s, Modelo: %s, Año: %d, Precio: %.2f", id, marca, modelo, anio, precio);
        }
    }
