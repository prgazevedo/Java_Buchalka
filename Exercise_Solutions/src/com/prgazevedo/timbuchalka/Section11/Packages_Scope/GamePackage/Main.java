package com.prgazevedo.timbuchalka.Section11.Packages_Scope.GamePackage;



import com.prgazevedo.timbuchalka.Section9.Interfaces_Inner_Anonymous_Abstract_classes.InterfacesChallenge.ISaveable;
import com.prgazevedo.timbuchalka.Section9.Interfaces_Inner_Anonymous_Abstract_classes.InterfacesChallenge.Monster;
import com.prgazevedo.timbuchalka.Section9.Interfaces_Inner_Anonymous_Abstract_classes.InterfacesChallenge.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        testInterfaces();
    }

    private static void testInterfaces() {
        ISaveable player = new Player("Player 1", "Sabre");
        ISaveable monster = new Monster( "Monster 1", "Claws");
        System.out.println("Initial Player is: "+ player.toString());
        System.out.println("Initial Monster is: "+ monster.toString());
        System.out.println("Test will now load a new player and monster");
        System.out.println("Enter player name and weapon:");
        loadObject(player);
        System.out.println("Enter monster name and weapon:");
        loadObject(monster);
        //Now we set player HP higher
        ((Player) player).setHealth(50);
        System.out.println("Player loaded is: "+ player.toString());
        System.out.println("Monster loaded is: "+ monster.toString());
        saveObject(player);
        saveObject(monster);

    }

    private static void saveObject(ISaveable objectToSave){
        System.out.println("Save to Storage:");
        for(int i=0; i<objectToSave.writeData().size(); i++){
            System.out.println("->"+objectToSave.writeData().get(i));
        }
    }

    private static void loadObject(ISaveable objectToLoad){
        System.out.println("Load from storage");
        ArrayList<String> dataToLoad = readValues();
        dataToLoad.add(0,"15");
        objectToLoad.readData(dataToLoad);
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
            if(scanner.hasNextInt())
            {
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
            else{
                System.out.println("Please insert a number");
                scanner.nextLine();
            }

        }
        return values;
    }
}
