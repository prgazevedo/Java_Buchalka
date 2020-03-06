package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.LinkedListChallenge;
import java.util.Random;

public class NameGenerator {

    private Random random;

    private static String[] Begin = {"Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk" };
    private static String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
            "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
            "marac", "zoir", "slamar", "salmar", "urak" };

    private static String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
            "tron", "med", "ure", "zur", "cred", "mur" };

    public NameGenerator() {
        random = new Random();
    }

    public String generateName(){
        return Begin[random.nextInt(Begin.length)]+
                Middle[random.nextInt(Middle.length)]+
                End[random.nextInt(End.length)];
    }
}
