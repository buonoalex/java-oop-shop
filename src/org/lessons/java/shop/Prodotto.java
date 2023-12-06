package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codeProduct;
    private String nameProduct;
    private String descriptionProduct;
    private double prizeProduct;
    private int iva;
    private Categoria categoryProduct = new Categoria();

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

    public Categoria getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(Categoria categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    //Costruttori

    public Prodotto(String nameProduct, String descriptionProduct, double prizeProduct, int iva , String nameCategory , String descriptionCategory) {
        Random codiceSegretoRandom = new Random();
        this.codeProduct = codiceSegretoRandom.nextInt(1,1000);
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.prizeProduct = prizeProduct;
        this.iva = iva;
        this.categoryProduct.setNameCategory(nameCategory);
        this.categoryProduct.setDescriptionCategory(descriptionCategory);
    }

    public Prodotto(){

    }

    //Metodi
    @Override
    public String toString() {
        String decimalFormattatoSum = String.format("%.2f",SumPriceWthIva());
        String decimalFormattatoPrice = String.format("%.2f",prizeProduct);
        return "Prodotto\n"
                +"----------\n"+
                "codeProduct = " + codeProduct +"\n"+
                "nameProduct = " + nameProduct +"\n"+
                "descriptionProduct = " + descriptionProduct +"\n"+
                "prizeProduct = " + decimalFormattatoPrice + "€"+"\n"+
                "iva = " + iva + "%\n"+
                "sumWithIva = " +decimalFormattatoSum+"€"+"\n"+
                "completeProductWithCode = "+UnionCodePlusNameProduct()+"\n"+
                "----------";
    }

    //Metodo somma prodotto più iva
    public double SumPriceWthIva(){
        return (double) (prizeProduct + ((prizeProduct * iva)/100));
    }

    //Metodo nome esteso con code
    public String UnionCodePlusNameProduct(){
        return codeProduct +"-"+ nameProduct;
    }

}
