    package ej1.clases;

    public class ArticuloTecnologico extends Articulo{
        private int garantia;
        private String tipo;

        public ArticuloTecnologico(String descripcion, float precioCompra, float precioVenta, int garantia, String tipo){
            super(descripcion, precioCompra, precioVenta);
            this.garantia = garantia;
            this.tipo = tipo;
        }
        
        public int getGarantia() {
            return garantia;
        }

        public void setGarantia(int garantia) {
            this.garantia = garantia;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return String.format("""
                        %s
                        Garantia: %d meses
                        Tipo: %s
                        %s""", super.toString(), garantia, tipo, calcularRayas(getDescripcion()));  
        }
    }
