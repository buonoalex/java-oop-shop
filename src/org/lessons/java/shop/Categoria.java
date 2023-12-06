package org.lessons.java.shop;

public class Categoria {
    private String nameCategory;
    private String descriptionCategory;

    //Getter and Setter
    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }

    //Costruttore
    public Categoria(String nameCategory, String descriptionCategory) {
        this.nameCategory = nameCategory;
        this.descriptionCategory = descriptionCategory;
    }
    public Categoria(){

    }
}
