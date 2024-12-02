public class Ayuda {
    public static void main(String[] args) {
        // Definir las letras con altura 18 y ancho 21
        String[] letraA = {
            "         *         ",
            "        * *        ",
            "       *   *       ",
            "      *     *      ",
            "     *       *     ",
            "    *         *    ",
            "   *           *   ",
            "  *             *  ",
            " *               * ",
            "*******************",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *"
        };

        String[] letraY = {
            "*                 *",
            " *               * ",
            "  *             *  ",
            "   *           *   ",
            "    *         *    ",
            "     *       *     ",
            "      *     *      ",
            "       *   *       ",
            "        * *        ",
            "         *         ",
            "         *         ",
            "         *         ",
            "         *         ",
            "         *         ",
            "         *         ",
            "         *         ",
            "         *         "
        };

        String[] letraU = {
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*******************"
        };

        String[] letraD = {
            "***************** ",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "*                *",
            "***************** "
        };

        // Corregir la segunda "A" correctamente, que se haya definido de manera consistente
        String[] letraA2 = {
            "         *         ",
            "        * *        ",
            "       *   *       ",
            "      *     *      ",
            "     *       *     ",
            "    *         *    ",
            "   *           *   ",
            "  *             *  ",
            " *               * ",
            "*******************",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *",
            "*                 *"
        };

        // Códigos de color ANSI
        String colorA = "\u001B[31m"; // Rojo
        String colorY = "\u001B[32m"; // Verde
        String colorU = "\u001B[33m"; // Amarillo
        String colorD = "\u001B[34m"; // Azul
        String colorA2 = "\u001B[35m"; // Magenta
        String resetColor = "\u001B[0m"; // Resetea el color al predeterminado

        // Código ANSI para negrita
        String negrita = "\u001B[1m"; // Estilo en negrita
        String resetStyle = "\u001B[0m"; // Restablece estilo

        // Imprimir las letras de la palabra "AYUDA" con diferentes colores y en negrita
        for (int i = 0; i < 18; i++) {
            System.out.print(negrita + colorA + letraA[i] + resetStyle + resetColor + "   "); // 3 espacios entre las letras
            System.out.print(negrita + colorY + letraY[i] + resetStyle + resetColor + "   ");
            System.out.print(negrita + colorU + letraU[i] + resetStyle + resetColor + "   ");
            System.out.print(negrita + colorD + letraD[i] + resetStyle + resetColor + "   ");
            System.out.print(negrita + colorA2 + letraA2[i] + resetStyle + resetColor);
            System.out.println();
        }
    }
}