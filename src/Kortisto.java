/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heidi
 */

import java.util.Scanner;

public class Kortisto {
    
    public static Scanner lukija = new Scanner(System.in);

    public Kortisto() {
    }
    
    int paavalikko() {
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
}
