package com.example.catanfx.GamePieces;

import com.example.catanfx.GamePieces.Cards.DevelopmentCard;
import com.example.catanfx.GamePieces.Cards.ResourceCard;
import com.example.catanfx.GamePieces.Structures.City;
import com.example.catanfx.GamePieces.Structures.Structure;

import java.util.LinkedList;

public class Player {
    private String color;
    private LinkedList<ResourceCard> resourceCards;
    private LinkedList<DevelopmentCard> devCards;
    private LinkedList<Structure> settlements;
    private LinkedList<Structure> roads;
    private LinkedList<Structure> cities;
    private int turnNum;
    private int KnightsPlayed;
    private int points;
    private boolean largestArmy;

    public Player(String c, int turn){
        color = c;
        turnNum = turn;
        resourceCards = new LinkedList<>();
        devCards = new LinkedList<>();
        settlements = new LinkedList<>();
        roads = new LinkedList<>();
        cities = new LinkedList<>();
        KnightsPlayed = 0;
        points = 0;
        largestArmy = false;
        for(int i=0; i<(Math.random()*40)+1; i++){
            resourceCards.add(new ResourceCard("brick"));
            resourceCards.add(new ResourceCard("lumber"));
            resourceCards.add(new ResourceCard("grain"));
            resourceCards.add(new ResourceCard("wool"));
            resourceCards.add(new ResourceCard("ore"));
        }
    }

    public void removeRCard(ResourceCard c){
        resourceCards.remove(c);
    }
    public void removeDCard(DevelopmentCard c){
        devCards.remove(c);
    }

    public String getColor(){return color;}
    public LinkedList<ResourceCard> getRC(){return resourceCards;}
    public int getTurnNum(){return turnNum;}
    public LinkedList<DevelopmentCard> getDC(){return devCards;}
    public LinkedList<Structure> getSettlements(){return settlements;}
    public LinkedList<Structure> getRoads(){return roads;}
    public LinkedList<Structure> getCities(){return cities;}
    public int getKnightsPlayed(){return KnightsPlayed;}
    public boolean hasLargestArmy(){return largestArmy;}

    public void obtainedLargestArmy(){largestArmy = true;}
    public void resetLargestArmy(){largestArmy = false; points = points - 2;}
    public void setPoints(int i){points += i;}
    public void playedKnight() {KnightsPlayed+=1;}
    public void setRC(LinkedList<ResourceCard> rc){resourceCards = rc;}
    public void setDC(LinkedList<DevelopmentCard> d){devCards = d;}
    public void addRC(ResourceCard c){resourceCards.add(c);}
    public void addDC(DevelopmentCard c){devCards.add(c);}
    public void addSett(Structure s){settlements.add(s);}
    public void addRoad(Structure s){roads.add(s);}
    public void upgradeStruct(Structure s){
        for(int i=0; i<settlements.size(); i++){
            if(settlements.get(i).equals(s)){
                settlements.set(i, new City("City", s.getColor(), s.getImage()));
                cities.add(settlements.get(i));
                return;
            }
        }
    }

    public int getPoints(){
        int cnt = 0;
        for(int i = 0; i < devCards.size(); i++){
            if(devCards.get(i).equals(new DevelopmentCard("victorypoint"))){
                cnt++;
            }
        }
        return cnt + points;
    }

    public ResourceCard getRandomCard(){
        return resourceCards.remove(0);
    }




}
