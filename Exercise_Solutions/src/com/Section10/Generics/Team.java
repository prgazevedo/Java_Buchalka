package com.Section10.Generics;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Team implements Comparable<Team>{
    private String teamName;
    private String sportType;
    private ArrayList<Player> teamMembers = new ArrayList<>();
    private int score;

    public  Team(String teamName, String sportType) {
        this.teamName = teamName;
        this.sportType = sportType;
    }

    public void addPlayer(Player player){
        if (player != null) {
            teamMembers.add(player);
        }
        else System.out.println("Player is null");

    }


    public String getTeamName() {
        return teamName;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Team o) {
        if(o != null){
            if ( this.score < o.score ) return -1;
            else if(this.score > o.score) return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(teamName, team.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }
}
