package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static int position = 0;
    static int diceValue;
    static int diceMovement;
    static int count=0;
    static int dicePosition=0;
    static int totalDicePosition;
    //static int previousDicePosition;


   static final int FINAL_DICE_POSITION =100;

    static void diceRoll() {


        while (dicePosition < FINAL_DICE_POSITION ) {
            double diceMove = (Math.random() * 10 % 3);
            diceMovement = (int) diceMove;
            double value = (Math.random() * 10 % 6);
            diceValue = (int) value;
            System.out.println(diceValue);
            System.out.println(diceMovement);
           // previousDicePosition = dicePosition;
            switch (diceMovement) {
                case 1:
                    System.out.println("Player Move Forward");
                    if((dicePosition + diceValue) <= FINAL_DICE_POSITION)
                        dicePosition = dicePosition + diceValue;
                    break;
                case 2:

                    System.out.println("Player Move Backward");
                    dicePosition = dicePosition - diceValue;
                    if (dicePosition < 0)
                        dicePosition = 0;

                    break;
                default:
                    System.out.println("No Play");

            }
                count++;
                System.out.println("Position of dice is: " + dicePosition);
        }

            System.out.println(count + " times dice roll.");
        }

        public static void main (String[]args){
            SnakeAndLadder sn = new SnakeAndLadder();
            int player1 = sn.count;
            int player2 =sn.count;
            System.out.println(player1);
            System.out.println(player2);
            //int player1  = sn.diceRoll();
           // System.out.println(player1);
        }
    }



