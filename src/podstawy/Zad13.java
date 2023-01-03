package podstawy;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int ciasteczka=40;
        int porcje=1;
        int porcja=4;
        int kalorieP=300;
        int kalorieC=kalorieP/porcja;

        System.out.println("Podaj liczbe zjedzonych ciasteczek: ");
        int ilosc=klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Zjadles "+kalorieC*ilosc+" kalorii");

    }
}
