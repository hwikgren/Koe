/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heidi
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Kortisto {
    
    public static Scanner lukija = new Scanner(System.in);
    
    ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

    public Kortisto() {
    }
    
    int paavalikko() {
        System.out.println("");
        System.out.println("HENKILÖOSAAMISKORTISTO");
        System.out.println("----------------------");
        System.out.println("Päävalikko");
        System.out.println(" 1. Lisää henkilö");
        System.out.println(" 2. Muokkaa henkilön tietoja");
        System.out.println(" 3. Listaa henkilöt");
        System.out.println(" 4. Listaa osaamisalueet");
        System.out.println(" 0. Poistu");


        System.out.print("\nValitse: ");
        int valinta = lukija.nextInt();

        return valinta;
    }
    
    void lisaaHenkilo() {
        Henkilo henkilo = new Henkilo();
        System.out.print("Anna etunimi: ");
        String etunimi = lukija.nextLine();
        System.out.print("Anna sukunimi: ");
        String sukunimi = lukija.nextLine();
        henkilo.lisaaNimi(etunimi, sukunimi);
        henkilot.add(henkilo);
        System.out.println("Haluatko asettaa henkilölle osaamisalueita? Y(es)/N(o)");
        String valinta = lukija.next();
        if (valinta.equalsIgnoreCase("y")) {
            lisaaOsaaminen(henkilo);
        }
    }
    
    void lisaaOsaaminen(Henkilo henkilo) {
        henkilo.lisaaOsaaminen();
        
        System.out.println("");
    }
}
