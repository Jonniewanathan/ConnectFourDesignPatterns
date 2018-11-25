package com.jonathanquirke.connectfour;

import java.util.ArrayList;
import java.util.List;

public class ConnectFourBoard implements Subject {
    private static ConnectFourBoard connectFourBoard;
    private int[][] board = new int[6][7];
    private List<Observer> observers = new ArrayList<>();

    private ConnectFourBoard(){
        resetBoard();
    }

    public static ConnectFourBoard getConnectFourBoard(){
        if(connectFourBoard == null){
            connectFourBoard = new ConnectFourBoard();
        }
        return connectFourBoard;
    }

    public void resetBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 1;
            }
        }
        this.notifyObservers();
    }

    public int[][] getBoard(){
        return board;
    }

    public void addPiece(int column, int player){
        boolean valid = false;
        int num = 0;
        int pieceNum = 0;
        while(!valid) {
            //Changing the Piece Colour depending on player
            if(player == 1)
            {
                pieceNum = 2;
            }
            if(player == 2)
            {
                pieceNum = 3;
            }

            //checking if a piece exists in the spot
            if(board[num][column] == 1)
            {
                board[num][column] = pieceNum;//adding a piece to the connect four board
                valid = true;
            }
            num++;
        }
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(o != null){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(board);
        }

    }
}
