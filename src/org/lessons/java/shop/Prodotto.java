package org.lessons.java.shop;

public class Prodotto {
    private int codeProduct;
    private String nameProduct;
    private String descriptionProduct;
    private int prizeProduct;
    private int iva;

    //Getter and Setter

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
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

    public int getPrizeProduct() {
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

    public Prodotto(int codeProduct, String nameProduct, String descriptionProduct, int prizeProduct, int iva) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.prizeProduct = prizeProduct;
        this.iva = iva;
    }

    public Prodotto(){

    }

    //Metodi
}
