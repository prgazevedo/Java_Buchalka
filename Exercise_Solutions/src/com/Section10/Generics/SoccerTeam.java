package com.Section10.Generics;

public class SoccerTeam extends Team {

    public SoccerTeam(String teamName, String sportType) {
        super(teamName, "Soccer");
        this.setScore(0);
        this.setTeamMembers(11);
    }
}
