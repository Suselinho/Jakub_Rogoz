package podstawy;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwe miasta:");
        String miasto=klawiatura.nextLine();

        int dlugosc;
        String wielkie,male;
        String pierwsza;
        dlugosc=miasto.length();
        wielkie=miasto.toUpperCase();
        male=miasto.toLowerCase();
        char miasto1 = .charAt(0);
        System.out.println("Liczba znakow: "+dlugosc);
        System.out.println("Miasto z wielkich liter: "+wielkie);
        System.out.println("Miasto z malych liter: "+male);
        System.out.println("Pierwszy znak: "+miasto1);
    }
}
