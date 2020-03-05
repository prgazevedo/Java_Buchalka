package com.Section10.Generics;


import java.util.Random;

public class Main {


    public static void main(String[] args) {

        testTeamLeague();
    }

    private static void testTeamLeague() {
        runSoccerLeague();
    }

    private static SoccerTeam initializeSoccerTeam(String name){
        SoccerTeam soccerTeam = new SoccerTeam(name);
        System.out.println("New soccer team with name: "+soccerTeam.getTeamName());
        String stringData = "John David Ben Thomas Lucas Jaques Jardel Maradona Ronaldo Messi Gossi";

        String[] data = stringData.split(" ");
        for (int i = 1; i <=11 ; i++) {
            soccerTeam.addPlayer( new SoccerPlayer(data[new Random().nextInt(i)],
                    (new Random().nextInt(40)),
                    (new Random().nextInt(10))));
        }
        soccerTeam.printPlayers();
        return soccerTeam;

    }

    private static BasketTeam initializeBasketTeam(String name){
        BasketTeam basketTeam = new BasketTeam(name);
        String stringData = "MagicJohnsson AirJordan Bird Tupac Larry";

        String[] data = stringData.split(" ");
        for (int i = 0; i <5 ; i++) {
            basketTeam.addPlayer( new BasketPlayer(data[new Random().nextInt(i)],
                    (new Random().nextInt(30)),
                    (new Random().nextInt(200))));
        }
        return basketTeam;
    }

    private static void runSoccerLeague(){
        League<SoccerTeam> soccerTeamLeague = new League<>();
        SoccerTeam benfica = initializeSoccerTeam("Benfica");
        SoccerTeam porto = initializeSoccerTeam("Porto");
        SoccerTeam sporting = initializeSoccerTeam("Sporting");
        soccerTeamLeague.addTeam(benfica);
        soccerTeamLeague.addTeam(porto);
        soccerTeamLeague.addTeam(sporting);
        System.out.println("");
        System.out.println("Soccer League Running");
        System.out.println("======================");
        soccerTeamLeague.addScores(benfica,porto, League.GameResult.Win);
        soccerTeamLeague.addScores(porto,benfica, League.GameResult.Draw);
        soccerTeamLeague.addScores(benfica,sporting, League.GameResult.Win);
        soccerTeamLeague.addScores(sporting,benfica, League.GameResult.Win);
        soccerTeamLeague.addScores(porto,sporting, League.GameResult.Win);
        soccerTeamLeague.addScores(sporting,porto, League.GameResult.Draw);
        System.out.println("======================");
        System.out.println("");
        soccerTeamLeague.printOrderedLeague();

    }

}
