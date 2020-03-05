package com.prgazevedo.timbuchalka.Section10.Generics;

public class BasketTeam extends Team {
    private String sportType;
    public BasketTeam(String teamName) {
        super(teamName);
        this.sportType="Basket";
        this.setScore(0);

    }


}
