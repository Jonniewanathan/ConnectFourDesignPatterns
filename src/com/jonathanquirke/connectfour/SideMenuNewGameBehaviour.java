package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SideMenuNewGameBehaviour implements ActionBehaviour {
    private ArrayList<Player> players = new ArrayList();
    private int numPlayers;

    @Override
    public void Action() {
        open();
        numPlayers = JOptionPane.showConfirmDialog(null,"2 Player?");
        resetBoard();
        printPlayerList();
    }

    private void open() {
        try{
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("Player.dat"));
            players  = (ArrayList<Player>) is.readObject();
            is.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"open didn't work");
            e.printStackTrace();
        }
    }

    private void resetBoard()
    {
        int[][] board = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if(board[i][j] != 1)
                {
                    board[i][j] = 1;
                    //pieces[i][j].setIcon(empty);
                }
            }
        }
    }

    private void printPlayerList()
    {
        NewGamePlayerSelect newGamePlayerSelect = new NewGamePlayerSelect();
        newGamePlayerSelect.createGUI(players,numPlayers);

    }
}
