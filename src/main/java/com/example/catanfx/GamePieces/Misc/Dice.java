package com.example.catanfx.GamePieces.Misc;

import com.example.catanfx.GamePieces.GameState;

public class Dice {

    private static int number, number0;

    public Dice() {
        number = 0;
        number0 = 0;
    }

    public static int getRolledNum() {
        return number + number0;
    }

    public static int[] rollDice() {
        int[] num = new int[2];
        num[0] = (int)(Math.random()*6)+1;
        num[1] = (int)(Math.random()*6)+1;
        number=num[0];
        number0=num[1];
        if(!GameState.roundZeroRollDice && !GameState.roundZeroBuildSettlement && !GameState.roundZeroBuildRoad){
            GameState.rollDiceGetResources(number + number0);
        }
        return num;
    }
}
