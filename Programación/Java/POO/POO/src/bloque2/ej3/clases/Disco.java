    package bloque2.ej3.clases;

    public class Disco {
        private String codigo;
        private String autor;
        private String titulo;
        private String genero;
        private int duracion;

        public Disco(String autor, String titulo, String genero, int duracion){
            codigo = generarCodigoAleatorio();
            this.autor = autor;
            this.titulo = titulo;
            this.genero = genero;
            this.duracion = duracion;
        }

        public String getAutor() {
            return autor;
        }

        public String getCodigo() {
            return codigo;
        }

        public int getDuracion() {
            return duracion;
        }

        public String getGenero() {
            return genero;
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return String.format("------------------------------------------%nCódigo: %s%nAutor: %s%nTítulo: %s%nGénero: %s%nDuración: %d%n------------------------------------------", codigo, autor, titulo, genero, duracion);
        }

        private static String generarCodigoAleatorio(){
            char minNumero = 'A';
            char maxNumero = 'Z';
            char minLetra = '0';
            char maxLetra = '9';
            String codigo = "";
            final int NUMEROCARACTERES = 6;

            for (int i = 0; i < NUMEROCARACTERES; i++) {
                if (Math.random() < 0.5){
                    codigo += (char)(Math.random()*(maxNumero-minNumero-1)+minNumero);
                }else{
                    codigo += (char)(Math.random()*(maxLetra-minLetra-1)+minLetra);
                }
            }
            
            return codigo;
        }
    }
