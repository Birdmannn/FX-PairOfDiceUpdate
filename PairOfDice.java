package com.example.pairofdicegui;

public class PairOfDice {
    private int die1;  //Number showing on first die.
    private int die2;  //Number showing on second die.

    public PairOfDice() {
        //Constructor. Rolls the dice, so that they initially show some random values.
        roll();  // Call the roll() method to roll the dice.
    }

    public PairOfDice(int val1, int val2) {
        //Constructor. Creates a pair of dice that are initially showing the values val1 and val2.
        die1 = val1;
        die2 = val2;
    }

    public void roll() {
        //Roll the dice by setting each of the dice to be a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }

    public int getFirstDieValue() {
        //gets the value of the first die
        return die1;
    }

    public int getSecondDieValue() {
        //gets the value of the second die
        return die2;
    }

    public String toString() {
        if (die1 == die2)
            return "double " + die1;
        else
            return die1 + " and " + die2;
    }

    public int getTotal() {
        return die1 + die2;
    }


}
