package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Bracciale","si può indossare",29.99,21);
        String stampoProdotto1 = p1.toString();
        System.out.println(stampoProdotto1);
    }
}
