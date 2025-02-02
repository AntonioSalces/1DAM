public class Carta {
    private int puntos;

    public Carta(String palo, String numero) {
        switch (palo) {
            case "espadas":
                puntos += 0;
                break;
            case "bastos":
                puntos +=10;
                break;
            case "copas":
                puntos += 20;
                break;
            case "oros":
                puntos += 30;
                break;
            default:
                break;
        }
        switch (numero) {
            case "as":
                puntos += 1;
                break;
            case "2":
                puntos += 2;
                break;
            case "3":
                puntos += 3;
                break;
            case "4":
                puntos += 4;
                break;
            case "5":
                puntos += 5;
                break;
            case "6":
                puntos += 6;
                break;
            case "7":
                puntos += 7;
                break;
            case "sota":
                puntos += 8;
                break;
            case "caballo":
                puntos += 9;
                break;
            case "rey":
                puntos += 10;
                break;
        
            default:
                break;
        }
    }

    public Carta (int puntos) {
        this.puntos = puntos;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public String getNumero() {
        return queNumeroEs(puntos);
    }

    private static String quePaloEs(int puntos) {
        int paloNumero = (puntos - 1) / 10;
        switch (paloNumero) {
            case 0:
                return "oros";
            case 1:
                return "copas";
            case 2:
                return "espadas";
            case 3:
                return "bastos";
            default:
                return "desconocido";
        }
    }

    private static String queNumeroEs(int puntos) {
        int numeroCarta = (puntos - 1) % 10 + 1;
        switch (numeroCarta) {
            case 1:
                return "as";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "sota";
            case 9:
                return "caballo";
            case 10:
                return "rey";
            default:
                return "desconocido";
        }
    }

    @Override
    public String toString() {
        return String.format("%s de %s", queNumeroEs(puntos), quePaloEs(puntos));
    }
}