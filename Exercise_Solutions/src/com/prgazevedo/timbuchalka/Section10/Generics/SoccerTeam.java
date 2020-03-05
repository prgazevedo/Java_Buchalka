package com.prgazevedo.timbuchalka.Section10.Generics;

public class SoccerTeam extends Team {
    private String sportType;
    public SoccerTeam(String teamName) {
        super(teamName);
        this.sportType="Soccer";
        this.setScore(0);

    }
}
