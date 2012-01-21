

/**
 *
 * @author heidi
 */



public class Javalabra {

    public static void main(String[] args) {
        Kortisto kortisto = new Kortisto();
        
        while (true) {
            int valinta = kortisto.paavalikko();

            if (valinta == 0) {
                System.out.println("Valitsit poistumisen");
                break;
            }

            if (valinta == 1) {
                System.out.println("Valitsit henkilön lisäämisen");
            }

            if (valinta == 2) {
                System.out.println("Valitsit henkilön tietojen muokkaamisen");
            }

            if (valinta == 3) {
                System.out.println("Valitsit henkilöiden listaamisen");
            }

            if (valinta == 4) {
                System.out.println("Valitsit osaamisalueiden listaamisen");
            }


        }
    }
    
}
