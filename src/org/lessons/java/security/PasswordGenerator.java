package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome e premi invio...");
        String firstName = input.nextLine();

        System.out.println("Inserisci il tuo cognome e premi invio...");
        String secondName = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito e premi invio...");
        String favouriteColor = input.nextLine();

        System.out.println("Inserisci il giorno della tua nacita e premi invio...");
        int dayOfBirth = Integer.parseInt(input.nextLine());

        System.out.println("Inserisci il mese della tua nacita e premi invio...");
        int monthOfBirth = Integer.parseInt(input.nextLine());

        System.out.println("Inserisci l'anno della tua nacita e premi invio...");
        int yearOfBirth = Integer.parseInt(input.nextLine());

        input.close();
    }
}
