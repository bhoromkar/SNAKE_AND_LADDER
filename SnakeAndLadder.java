package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static int position = 0;
    static void findNum() {
        double value = (Math.random() * 10 % 6);
        int diceValue = (int) value;
        System.out.println(diceValue);
    }

    public static void main(String[] args) {
findNum();
    }
}
