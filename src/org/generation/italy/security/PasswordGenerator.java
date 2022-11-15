package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //chiedo all'utente il nome
        System.out.println("Inserisci il tuo nome: ");
        //inizializzo la variabile con l'input dall'utente
        String nome = scanner.nextLine();
        
        //chiedo all'utente il cognome
        System.out.println("Inserisci il tuo cognome: ");
        //inizializzo la variabile con l'input dall'utente
        String cognome = scanner.nextLine();
        
        //chiedo all'utente il colore preferito
        System.out.println("Inserisci il tuo colore preferito: ");
        
        //inizializzo la variabile con l'input dall'utente
        String colore = scanner.nextLine();
      
        //chiedo all'utente il giorno di nascita
        System.out.println("Inserisci il giorno di nascita: ");
        //inizializzo la variabile con l'input dall'utente
        int giorno = scanner.nextInt();
        scanner.nextLine();
      
        //chiedo all'utente il mese di nascita
        System.out.println("Inserisci il mese di nascita: ");
        //inizializzo la variabile con l'input dall'utente
        int mese = scanner.nextInt();
        scanner.nextLine();
      
        //chiedo all'utente l'anno di nascita
        System.out.println("Inserisci l'anno di nascita: ");
        //inizializzo la variabile con l'input dall'utente
        int anno = scanner.nextInt();
        scanner.nextLine();
           
        //stampo concatenazione
        System.out.println("La tua password è "+ nome + "-"+ cognome + "-"+ colore +"-"+  giorno +"-"+ mese + "-"+ anno);
        
               
        
    }
}
