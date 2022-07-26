package com.LegoSetApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        var legoSet = new LegoSet("1", "Death Star Lego", "Star Wars", "13+", 1600, 180.00);
        var persistence = new Persistence();
        persistence.createTable();

        //add new legoset to the database from the user input
        Scanner scanner = new Scanner(System.in);
        var legoSet = new LegoSet();
        System.out.println("Enter the lego set number: ");
        legoSet.setNumber(scanner.nextLine());
        System.out.println("Enter the lego set name: ");
        legoSet.setName(scanner.nextLine());
        System.out.println("Enter the lego set theme: ");
        legoSet.setTheme(scanner.nextLine());
        System.out.println("Enter the lego set age restriction: ");
        legoSet.setAges(scanner.nextLine());
        System.out.println("Enter the lego set pieces: ");
        legoSet.setPieces(scanner.nextInt());
        System.out.println("Enter the lego set recommended retail price: ");
        legoSet.setRecommendedRetailPrice(scanner.nextDouble());
        persistence.addLegoSet(legoSet);

        System.out.println("Lego set added to database");
        }


}
