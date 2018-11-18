package com.jonathanquirke.connectfour;

import javax.swing.*;

public class MenuBarHistory implements ActionBehaviour {

    @Override
    public void Action() {
        String stringHistory = "Connect Four (also known as Captain's Mistress, Four Up, Plot Four, Find Four, Fourplay, Four in a Row,\n" +
                "Four in a Line and Gravitrips (in Soviet Union) ) is a two-player connection game in which the players first choose a \n" +
                "color and then take turns dropping colored discs from the top into a seven-column, six-row vertically suspended grid. \n" +
                "The pieces fall straight down, occupying the next available space within the column. The objective of the game is to be \n" +
                "the first to form a horizontal, vertical, or diagonal line of four of one's own discs. Connect Four is a solved game. \n" +
                "The first player can always win by playing the right moves.\n" +
                "\n" +
                "The game was first sold under the famous Connect Four trademark by Milton Bradley in February 1974.";
        JOptionPane.showMessageDialog(null,stringHistory,"History",JOptionPane.PLAIN_MESSAGE);
    }
}
