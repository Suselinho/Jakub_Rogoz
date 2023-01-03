package podstawy;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dlugosc 1 pomieszczenia: ");
        double dlugosc1=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc 1 pomieszczenia: ");
        double szer1=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Pomieszczenie 1 ma wymiary: " + dlugosc1*szer1 + "m^2");

        System.out.println("Podaj dlugosc 2 pomieszczenia: ");
        double dlugosc2=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc 2 pomieszczenia: ");
        double szer2=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Pomieszczenie 2 ma wymiary: " + dlugosc2*szer2 + "m^2");

        System.out.println("Podaj dlugosc 3 pomieszczenia: ");
        double dlugosc3=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc 3 pomieszczenia: ");
        double szer3=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Pomieszczenie 3 ma wymiary: " + dlugosc3*szer3 + "m^2");

        System.out.println("Podaj dlugosc 4 pomieszczenia: ");
        double dlugosc4=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Podaj szerokosc 4 pomieszczenia: ");
        double szer4=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Pomieszczenie 4 ma wymiary: " + dlugosc4*szer4 + "m^2");

    }
}


