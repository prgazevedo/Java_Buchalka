package com.Section9.Interfaces_Abstract_classes;



import com.Section9.Interfaces_Abstract_classes.InterfacesChallenge.Monsters;
import com.Section9.Interfaces_Abstract_classes.InterfacesChallenge.Players;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        testInterfaces();
    }

    private static void testInterfaces() {
        Players players = new Players();
        Monsters monsters = new Monsters();
        System.out.println("Enter players:");
        players.writeData(readValues());
        System.out.println("Enter monsters:");
        monsters.writeData(readValues());
        System.out.println("Players saved are: "+players.readData().toString());
        System.out.println("Monsters saved are: "+monsters.readData().toString());

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
