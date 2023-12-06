package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codeProduct;
    private String nameProduct;
    private String descriptionProduct;
    private double prizeProduct;
    private int iva;

    //Getter and Setter

    public int getCodeProduct() {
        return codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public double getPrizeProduct() {
        return prizeProduct;
    }

    public void setPrizeProduct(int prizeProduct) {
        this.prizeProduct = prizeProduct;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    //Costruttori

    public Prodotto(String nameProduct, String descriptionProduct, double prizeProduct, int iva) {
        Random codiceSegretoRandom = new Random();
        this.codeProduct = codiceSegretoRandom.nextInt(1,1000);
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.prizeProduct = prizeProduct;
        this.iva = iva;
    }

    public Prodotto(){

    }

    //Metodi
    @Override
    public String toString() {
        return "Prodotto\n"
                +"----------\n"+
                "codeProduct = " + codeProduct +"\n"+
                "nameProduct = " + nameProduct +"\n"+
                "descriptionProduct = " + descriptionProduct +"\n"+
                "prizeProduct = " + prizeProduct + "€"+"\n"+
                "iva = " + iva + "%\n"+
                "sumWithIva = " +SumPriceWthIva()+"€"+"\n"+
                "completeProductWithCode = "+UnionCodePlusNameProduct()+"\n"+
                "----------";
    }

    //Metodo somma prodotto più iva
    public int SumPriceWthIva(){
        return (int) (prizeProduct + ((prizeProduct * iva)/100));
    }

    //Metodo nome esteso con code
    public String UnionCodePlusNameProduct(){
        return codeProduct +"-"+ nameProduct;
    }

}
