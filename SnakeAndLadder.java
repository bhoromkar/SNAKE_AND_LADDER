package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static int position = 0;
    static int diceValue;
    static int diceMovement;
    static int count = 0;
    static int count1 = 0;
    static int dicePlayer1 = 0;
    static int dicePlayer2 = 0;

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static int totalDicePosition;
    //static int previousDicePosition;


    static final int FINAL_DICE_POSITION = 100;

    static void diceRoll() {

        int playerMove = 0;
        while (dicePlayer1 < FINAL_DICE_POSITION && dicePlayer2 < FINAL_DICE_POSITION) {
            double diceMove = (Math.random() * 10 % 3);
            diceMovement = (int) diceMove;
            double value = (Math.random() * 10 % 6);
            diceValue = (int) value;
            //System.out.println(diceValue);
            //  System.out.println(diceMovement);
            // previousDicePosition = dicePosition;
            if (playerMove % 2 == 0) {
                switch (diceMovement) {
                    case LADDER:
                        System.out.println("Player Move Forward");
                        if ((dicePlayer1 + diceValue) <= FINAL_DICE_POSITION)
                            dicePlayer1 = dicePlayer1 + diceValue;

                        break;
                    case SNAKE:

                        System.out.println("Player Move Backward");
                        dicePlayer1 = dicePlayer1 - diceValue;
                        if (dicePlayer1 < 0)
                            dicePlayer1 = 0;

                        break;
                    case NO_PLAY:
                        System.out.println("No Play");

                        break;
                    default:
                        System.out.println("WRONG OPTION");

                }
                playerMove++;
                count++;
                if (dicePlayer1 == FINAL_DICE_POSITION)
                    System.out.println("Player1 you are winner!");

                System.out.println("Position of dice for player1 is: " + dicePlayer1);

            }

            else {
                switch (diceMovement) {
                    case LADDER:
                        System.out.println("Player Move Forward");
                        if ((dicePlayer2 + diceValue) <= FINAL_DICE_POSITION)
                            dicePlayer2 = dicePlayer2 + diceValue;

                        break;
                    case SNAKE:

                        System.out.println("Player Move Backward");
                        dicePlayer2 = dicePlayer2 - diceValue;
                        if (dicePlayer2 < 0)
                            dicePlayer2 = 0;

                        break;
                    case NO_PLAY:
                        System.out.println("No Play");

                        break;
                    default:
                        System.out.println("Wrong option");

                }
                playerMove++;
                count1++;
                if (dicePlayer2 == FINAL_DICE_POSITION)
                    System.out.println("Player2 you are winner!");

                System.out.println("Position of dice for player 2 is: " + dicePlayer2);
            }

            System.out.println(count + " times dice roll.");

        }
    }

    public static void main(String[] args) {
        diceRoll();

    }
}
