package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewGamePlayerSelect implements ActionListener {

    private JComboBox<String> comboBox;
    private JComboBox<String> comboBox2;
    private int numPlayers;
    private ArrayList<Player> players;
    JFrame playerListFrame;

    public void createGUI(ArrayList<Player> players, int numPlayers){
        this.numPlayers = numPlayers;
        this.players = players;
        int num = 1;
        playerListFrame = new JFrame("Player Pick");
        JButton selectPlayer = new JButton("Select Player");
        comboBox = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        for (int i = num; i < players.size() ; i++)//Starts at one so as not to display the computer in the player select
        {
            comboBox.addItem(" " + i + ": " + players.get(i).toString() + "\n");
            comboBox2.addItem(" " + i + ": " + players.get(i).toString() + "\n");
        }
        selectPlayer.addActionListener(this);
        playerListFrame.setSize(400,140);
        LayoutManager flow = new FlowLayout();
        playerListFrame.setLayout(flow);
        playerListFrame.add(comboBox);
        if(numPlayers == JOptionPane.YES_OPTION)
        {
            playerListFrame.add(comboBox2);
        }
        playerListFrame.add(selectPlayer);
        playerListFrame.setVisible(true);
        playerListFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int pNumber = (1 + comboBox.getSelectedIndex());
        int p2Number = (1 + comboBox2.getSelectedIndex());
        Player p1;
        Player p2;
        Player temp;
        Computer comp = new Computer();
        boolean computer;
        if(numPlayers == JOptionPane.YES_OPTION)
        {
            computer = false;
            p1 = players.get(pNumber);
            p2 = players.get(p2Number);
        }
        else if(numPlayers == JOptionPane.NO_OPTION)
        {
            computer = true;
            p1 = players.get(pNumber);
            temp = players.get(0);
            int compWin = temp.getWin();
            int compLose = temp.getLoses();
            comp.setExactWin(compWin);
            comp.setExactLose(compLose);

        }
        playerListFrame.dispose();
    }
}