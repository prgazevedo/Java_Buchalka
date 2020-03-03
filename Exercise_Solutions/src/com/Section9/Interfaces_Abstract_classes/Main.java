package com.Section9.Interfaces_Abstract_classes;



import com.Section9.Interfaces_Abstract_classes.InterfacesChallenge.Monster;
import com.Section9.Interfaces_Abstract_classes.InterfacesChallenge.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        testInterfaces();
    }

    private static void testInterfaces() {
        Player player = new Player("Player 1", "Sabre");
        Monster monster = new Monster( "Monster 1", "Claws");
        System.out.println("Initial Player is: "+ player.toString());
        System.out.println("Initial Monster is: "+ monster.toString());
        System.out.println("Enter player name and weapon:");
        ArrayList<String> playerData = readValues();
        playerData.add(0,"30");
        player.writeData(playerData);

        System.out.println("Enter monster name and weapon:");
        ArrayList<String> monsterData = readValues();
        monsterData.add(0,"15");
        monster.writeData(monsterData);

        System.out.println("Player saved are: "+ player.toString());
        System.out.println("Monster saved are: "+ monster.toString());

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
