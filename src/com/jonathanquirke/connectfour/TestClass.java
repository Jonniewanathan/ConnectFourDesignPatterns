package com.jonathanquirke.connectfour;
//Connect four game

import java.util.Scanner;

//Class start

public class TestClass {
    public static void main(String args[])
    {
        int [][] board = new int[6][7];
        int column;
        int player;
        char win;
        Scanner input = new Scanner(System.in);

        //fills the 2-d array with 1 which signifies a blank space
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = 1;
            }
        }
        do{
            System.out.println("Please enter a Column Player 1: ");
            column = input.nextInt();

            player = 1;

            board = CheckMethods.playerCheck(board,column,player);

            for (int i = 5; i >= 0; i--) {//Prints the board out in the console
                for (int j = 0; j < 7; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            win = CheckMethods.checkWin(board);

            if(win == 'N'){
                System.out.println("Please enter a Column Player 2: ");
                column = input.nextInt();

                player = 2;

                board = CheckMethods.playerCheck(board,column,player);

                for (int i = 5; i >= 0; i--) {//Prints the board out in the console
                    for (int j = 0; j < 7; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                win = CheckMethods.checkWin(board);
            }
        }while(win == 'N');

        if(win == 'Y')
        {
            System.out.println("Yellow Wins");
        }
        if(win == 'R')
        {
            System.out.println("Red Wins");
        }
    }

}