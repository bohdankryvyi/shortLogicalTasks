package main.interestingMethods;

import java.util.Random;

public class Dice {

    static int sidesOfDice = 6;
    int faceValue = 0;

    public static void changeNumSidesOfDice(int newNumberOfSides) {
        Dice.sidesOfDice = newNumberOfSides;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public int roll() {
        Random rand = new Random();
        this.faceValue = rand.nextInt(Dice.sidesOfDice) + 1;
        return this.faceValue;
    }

    //To test it put next code in the main method:

    /*
    System.out.println(Dice.sidesOfDice);

        Dice myFirstDice = new Dice();
        Dice myOtherDice = new Dice();

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("First Dice: " + myFirstDice.roll());
            System.out.println("Second Dice: " + myOtherDice.roll());
        }

        System.out.println();

        System.out.println("1st Face: " + myFirstDice.getFaceValue());
        System.out.println("Other Face: " + myOtherDice.getFaceValue());
     */
}
