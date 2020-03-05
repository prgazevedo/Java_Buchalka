package com.Section10.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>  {
    private ArrayList<T> teamArrayList;


    public League() {
        teamArrayList = new ArrayList<>();
    }


    public boolean addTeam(T team){
        if(teamArrayList.contains(team.getTeamName())){
            System.out.println("Team already in League");
            return false;
        }
        teamArrayList.add(team);
    }

    public boolean addScores(String teamA, String teamB, GameResult result)
    {
        if(!teamArrayList. || !teamArrayList.contains(teamB) )    {
            System.out.println("Teams not in league");
            return false;
        }
        else
        {
            int indexA = teamArrayList.indexOf(teamA);
            int indexB = teamArrayList.indexOf(teamB);
            if(indexA!=-1 && indexB!=-1){
                switch (result){
                    case Win:
                        teamArrayList.get(indexA).setScore(GameResult.Win.getResult());
                        return true;
                    case Loss:
                        teamArrayList.get(indexB).setScore(GameResult.Win.getResult());
                        return true;
                    case Draw:
                        teamArrayList.get(indexA).setScore(GameResult.Draw.getResult());
                        teamArrayList.get(indexB).setScore(GameResult.Draw.getResult());
                        return true;
                }
            }
            return false;

        }

    }

    private ArrayList<T> getOrderedList(){
      Collections.sort(teamArrayList);
      return teamArrayList;

    }

    public void printOrderedLeague(){
        System.out.println("The ordered League is");
        System.out.println("=====================");
        for (T t:this.getOrderedList() )
        {
            System.out.println("->"+t.getTeamName()+" points: "+t.getScore());

        }

    }

    private enum GameResult{

        Win(3), Loss(0), Draw(1);

        private final int  result;


        public int getResult() {
            return result;
        }

        GameResult(int result) {
            this.result=result;
        }
    }


}
