package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

public class MenuBarHowToPlay implements ActionBehaviour{

    @Override
    public void Action() {
        String stringHowToPlay = "The Player starts by placing their first piece onto the board.\n" +
                "Player 2/Computer places their piece next.\n" +
                "This goes back and forth until one player gets four pieces in a row horizontally,Vertically or Diagonally eg.\n" +
                "X X X X X X X\t X X X X X X X\n" +
                "X X X X X X X\t X X X X X X X\n" +
                "X X X X X X X\t X X X X O X X\n" +
                "X X X X X X X\t X X X O X X X\n" +
                "X X X X X X X\t X X O X X X X\n" +
                "X O O O O X X\t X O X X X X X\n\n" +
                "X X X X X X X\t X X X X X X X\n" +
                "X X X X X X X\t X X X X X X X\n" +
                "X X X O X X X\t X O X X X X X\n" +
                "X X X O X X X\t X X O X X X X\n" +
                "X X X O X X X\t X X X O X X X\n" +
                "X X X O X X X\t X X X X O X X\n";

        Font font = new Font(Font.MONOSPACED,Font.PLAIN,12);
        JTextArea text = new JTextArea(stringHowToPlay);
        text.setFont(font);

        JOptionPane.showMessageDialog(null,text,"How to Play!",JOptionPane.PLAIN_MESSAGE);
    }
}
