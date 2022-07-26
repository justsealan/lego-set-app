package com.LegoSetApp;

public class LegoSet {

    //fields
    private String number;
    private String name;
    private String theme;
    private String ages;
    private int pieces;
    private double recommendedRetailPrice;

    //constructor
    public LegoSet(String number, String name, String theme, String ages, int pieces, double recommendedRetailPrice) {
        this.number = number;
        this.name = name;
        this.theme = theme;
        this.ages = ages;
        this.pieces = pieces;
        this.recommendedRetailPrice = recommendedRetailPrice;
    }

    public LegoSet() {

    }

    //getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAges() {
        return ages;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public double getRecommendedRetailPrice() {
        return recommendedRetailPrice;
    }

    public void setRecommendedRetailPrice(double recommendedRetailPrice) {
        this.recommendedRetailPrice = recommendedRetailPrice;
    }

    //toString
    @Override
    public String toString() {
        return "LegoSet [number=" + number + ", name=" + name + ", theme=" + theme + ", ages=" + ages + ", pieces="
                + pieces + ", recommendedRetailPrice=" + recommendedRetailPrice + "]";
    }
}
