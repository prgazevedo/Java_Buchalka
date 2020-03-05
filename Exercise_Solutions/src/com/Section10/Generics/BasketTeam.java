package com.Section10.Generics;

public class BasketTeam extends Team {

    public BasketTeam(String teamName, String sportType) {
        super(teamName, "Tennis");
        this.setScore(0);
        this.setTeamMembers(5);
    }
}
