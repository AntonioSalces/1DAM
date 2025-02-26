package asociacionesYHerenciaEj1;

public final class Local extends Inmueble{
        private boolean tieneSalidaHumos;

        public Local() {

        }

        public Local(int id, String direccion, double precio, int metrosCuadrados, boolean tieneSalidaHumos) {
            super(id, direccion, precio, metrosCuadrados);
            this.tieneSalidaHumos = tieneSalidaHumos;
        }

        public boolean isTieneSalidaHumos() {
            return tieneSalidaHumos;
        }

        public void setTieneSalidaHumos(boolean tieneSalidaHumos) {
            this.tieneSalidaHumos = tieneSalidaHumos;
        }     

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (tieneSalidaHumos ? 1231 : 1237);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Local other = (Local) obj;
            if (tieneSalidaHumos != other.tieneSalidaHumos)
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Local [identificadorInmobiliario="
                    + identificadorInmobiliario + ", direccion=" + direccion + ", precioVenta=" + precioVenta
                    + ", metrosCuadrados=" + metrosCuadrados + ", tieneSalidaHumos" + tieneSalidaHumos + "]";
        }
}
