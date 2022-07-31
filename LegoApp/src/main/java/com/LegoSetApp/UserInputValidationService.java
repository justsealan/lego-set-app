package com.LegoSetApp;

import java.util.Scanner;

public class UserInputValidationService {
     public LegoSet getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter set number: ");
        String number = scanner.next();

        System.out.println("Enter name: ");
        String name = scanner.next();

        System.out.println("Enter theme: ");
        String theme = scanner.next();

        System.out.println("Enter age restriction: ");
        String age = scanner.next();

        System.out.println("Enter pieces: ");
        int pieces = scanner.nextInt();

        System.out.println("Enter recommended retail price: ");
        double retail = scanner.nextDouble();
        
          //null validations
        if (number.isEmpty()) {
            System.out.println("Number cannot be empty");
            return null;
        }
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return null;
        }
        if (theme.isEmpty()) {
            System.out.println("Theme cannot be empty");
            return null;
        }
        if (age.isEmpty()) {
            System.out.println("Age restriction cannot be empty");
            return null;
        }

        if (pieces < 0) {
            System.out.println("Number of pieces cannot be negative");
            return null;
        }
        if (retail < 0) {
            System.out.println("Retail price cannot be negative");
            return null;
        }

        var legoSet = new LegoSetBuilder().setNumber(number).setName(name).setTheme(theme).setAge(age).setPieces(pieces).setRetail(retail).getLegoSet();

        return legoSet;

    }
}
