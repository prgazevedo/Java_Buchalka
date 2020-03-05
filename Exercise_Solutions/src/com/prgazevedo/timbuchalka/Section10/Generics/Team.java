package com.prgazevedo.timbuchalka.Section10.Generics;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Team implements Comparable<Team>{
    private String teamName;
    private ArrayList<Player> teamMembers = new ArrayList<>();
    private int score;

    public  Team(String teamName) {
        this.teamName = teamName;
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

    public void printPlayers(){
        System.out.println("Has the following players:");
        for (Player p:teamMembers)
        {
            System.out.println("Player: "+p.getName());
        }
    }

    public int getNumberPlayers(){
        return teamMembers.size();
    }

    @Override
    public int compareTo(Team o) {
        if(o != null){
            if ( this.score > o.score ) return -1;
            else if(this.score < o.score) return 1;
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
