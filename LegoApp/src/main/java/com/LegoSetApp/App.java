package com.LegoSetApp;

import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

         var UserInputValidationService = new UserInputValidationService();
        var LegoSetStorageService = new LegoSetStorageService();
        Scanner scanner = new Scanner(System.in);

        //switch case for add, search, delete, and exit
        while (true) {
            System.out.println("Enter a command: ");
            System.out.println("1 - Add");
            System.out.println("2 - Search");
            System.out.println("3 - Update");
            System.out.println("4 - Delete");
            System.out.println("5 - Exit");
            var userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    var legoSet = UserInputValidationService.getUserInput();
                    LegoSetStorageService.addLegoSet(legoSet);
                    break;
                case 2:
                    System.out.println("Enter a name: ");
                    var name2 = scanner.nextLine();
                    var legoSet2 = LegoSetStorageService.getLegoSets(name2);
                    System.out.println(legoSet2.toString());
                    break;
                case 3:
                    System.out.println("Enter a number: ");
                    break;
                case 4:
                    System.out.println("Enter a name: ");
                    var name4 = scanner.nextLine();
                    LegoSetStorageService.deleteLegoSet(name4);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
