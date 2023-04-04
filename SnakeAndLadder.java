package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static int position = 0;
    static int diceValue;
    static int diceMovement;
    static int count;
    static int dicePosition=0;

   static final int FINAL_DICE_POSITION =100;

    static void findNum() {
      // int count;

        while (dicePosition <= FINAL_DICE_POSITION) {
            double diceMove = (Math.random() * 10 % 3);
            diceMovement = (int) diceMove;
            double value = (Math.random() * 10 % 6);
            diceValue = (int) value;
            System.out.println(diceValue);
            System.out.println(diceMovement);
            switch (diceMovement) {
                case 1:
                    System.out.println("Player Move Forward");
                    dicePosition = dicePosition + diceValue;
                    break;
                case 2 :
                    System.out.println("Player Move Backward");
                    dicePosition = dicePosition - diceValue;
                    break;
                default:
                    System.out.println("No Play");

            }


        }

            System.out.println(dicePosition);
        }

        public static void main (String[]args){
            findNum();
        }
    }

