package com.Section10.Generics;


import java.util.Random;

public class Main {


    public static void main(String[] args) {

        testTeamLeague();
    }

    private static void testTeamLeague() {

    }

    private static SoccerTeam initializeSoccerTeam(String name){
        SoccerTeam soccerTeam = new SoccerTeam(name, "Soccer");
        String stringData = "John David Ben Thomas Lucas Jaques Jardel Maradona Ronaldo Messi Gossi";

        String[] data = stringData.split(" ");
        for (int i = 0; i <11 ; i++) {
            soccerTeam.addPlayer( new SoccerPlayer(data[i],
                    (new Random().nextInt(40)),
                    (new Random().nextInt(10))));
        }
        return soccerTeam;

    }

    private static BasketTeam initializeBasketTeam(String name){
        BasketTeam basketTeam = new BasketTeam(name, "Basket");
        String stringData = "MagicJohnsson AirJordan Bird Tupac Larry";

        String[] data = stringData.split(" ");
        for (int i = 0; i <5 ; i++) {
            basketTeam.addPlayer( new BasketPlayer(data[i],
                    (new Random().nextInt(30)),
                    (new Random().nextInt(200))));
        }
        return basketTeam;
    }

    private static League initializeSoccerLeague(){
        League<SoccerTeam> soccerTeamLeague = new League<>();
        soccerTeamLeague.addTeam(initializeSoccerTeam("Benfica"));
        soccerTeamLeague.addTeam(initializeSoccerTeam("Port"));
        soccerTeamLeague.addTeam(initializeSoccerTeam("Sporting"));
        soccerTeamLeague.addScores()

    }

}
