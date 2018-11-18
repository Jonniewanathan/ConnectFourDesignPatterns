package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SideMenuHighScoreBehaviour implements ActionBehaviour {
    List<Player> players = new ArrayList();

    @Override
    public void Action() {
        open();
        highScoresList();
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

    private void highScoresList()
    {
        JTextArea playerList = new JTextArea(20,20);
        for (int i = 0; i < players.size() ; i++)//Starts at one so as not to display the computer in the player select
        {
            playerList.append( " " + i + ": " + players.get(i).toString() + "\n");
        }

        JOptionPane.showMessageDialog(null,playerList,"High Scores",JOptionPane.PLAIN_MESSAGE);
    }
}
