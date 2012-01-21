/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heidi
 */
public class Henkilo {
    String etunimi;
    String sukunimi;

    public Henkilo() {
    }
    
    void lisaaNimi(String etu, String suku) {
        this.etunimi = etu;
        this.sukunimi = suku;
    }
    
    void lisaaOsaaminen() {
        Osaaminen taito = new Osaaminen();
    }
}
