package org.lessons.java.shop;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Apro Scanner
        Scanner myBroScan = new Scanner(System.in);

        //Input start
        System.out.println("Quanti prodotti vogliamo aggiungere al carrello : ");
        int numberProduct = Integer.parseInt(myBroScan.nextLine());

        //Creo array di prodotti
        Prodotto[] carrelloProdotti = new Prodotto[numberProduct];

        //Completamento Array
        try {
            for (int i = 0; i < carrelloProdotti.length; i++) {
                System.out.println("Inserisci nome del prodotto : ");
                String name = myBroScan.nextLine();
                System.out.println("Inserisci la descrizione del prodotto : ");
                String description = myBroScan.nextLine();
                System.out.println("Inserisci prezzo del prodotto : ");
                double price = Double.parseDouble(myBroScan.nextLine());
                System.out.println("Inserisci l'iva del prodotto : ");
                int iva = Integer.parseInt(myBroScan.nextLine());
                System.out.println("Inserisci la categoria del prodotto : ");
                String category = myBroScan.nextLine();
                System.out.println("Inserisci la descrizione della categoria del prodotto : ");
                String descriptionCategory = myBroScan.nextLine();

                carrelloProdotti[i] = new Prodotto(name, description, price, iva, category, descriptionCategory);

            }

            for (Prodotto prodotto : carrelloProdotti) {
                String prodottoStampato = prodotto.toString();
                System.out.println(prodottoStampato);
            }

        }catch (Exception e ){
            System.out.println("Abbiamo riscontrato un problema\n"+ "Motivo : "+ e.getMessage());
            }finally {
                //Chiudo Scan
                myBroScan.close();
            }
        }
    }
