package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

class GameBoardPanel extends PaneDecorator {
    private GUI gui;

    GameBoardPanel(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        LayoutManager boardGrid = new GridLayout(6,7);
        JPanel gameBoard = new JPanel(boardGrid);
        gameBoard.setBackground(Color.BLUE);
        createBoard(gameBoard);
        frame.add(gameBoard,BorderLayout.CENTER);

        return frame;
    }

    private void createBoard(JPanel gameBoard)
    {
        JLabel[][] pieces = new JLabel[6][7];
        ImageIcon empty = new ImageIcon("./images/empty100.png");
        for (int i = 5; i >= 0; i--)
        {
            for (int j = 0; j < 7; j++)
            {
                pieces[i][j] = new JLabel(empty);
                gameBoard.add(pieces[i][j]);
            }
        }
    }
}
