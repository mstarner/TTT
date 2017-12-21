package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a tic-tac-toe simulator. The board is now printed in the output. Please type in your desired player, X's or O's ");
        String xoro = input.next();
        String playerSide;
        if (xoro.equals("X"))
        {
            playerSide = "X";
        }
        else (xoro.equalsIgnoreCase("O"))
        {
            playerSide = "O";
        }
    }
}
