package com.LegoSetApp;

public class LegoSet {

   //fields
    private String number;
    private String name;
    private String theme;
    private String age;
    private int pieces;
    private double retail;

    //constructor
    public LegoSet(String number, String name, String theme, String age, int pieces, double retail) {
        this.number = number;
        this.name = name;
        this.theme = theme;
        this.age = age;
        this.pieces = pieces;
        this.retail = retail;
    }

    //getters
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public String getAge() {
        return age;
    }

    public int getPieces() {
        return pieces;
    }

    public double getRetail() {
        return retail;
    }


    //toString
    // @Override
    // public String toString() {
    //     return "LegoSet [number=" + number + ", name=" + name + ", theme=" + theme + ", ages=" + ages + ", pieces="
    //             + pieces + ", recommendedRetailPrice=" + recommendedRetailPrice + "]";
    // }
}
