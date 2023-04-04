package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static int position = 0;
    static int diceValue;
    static int diceMovement;
    static int count;
    static int dicePosition;

   // static final int FINAL_DICE_MOVEMENT

    static void findNum() {
       // int count;

        while (dicePosition >= 100) {
            double diceMove = (Math.random() * 10 % 3);
            diceMovement = (int) diceMove;
            double value = (Math.random() * 10 % 6);
            diceValue = (int) value;
            System.out.println(diceValue);
            System.out.println(diceMovement);
            switch (diceMovement) {
                case 1:
                    System.out.println("No Play");
                    break;
                case 2:
                    //dicePosition = dicePosition + diceValue;
                    System.out.println("Player Move Forward");
                    break;
                case 3:
                    //dicePosition = dicePosition - diceValue;
                    System.out.println("Player Move Backward");

            }

        }

            System.out.println(dicePosition);
        }

        public static void main (String[]args){
            findNum();
        }
    }

