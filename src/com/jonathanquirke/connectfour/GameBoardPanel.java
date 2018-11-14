package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

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
        Random r = new Random();
        int low = 0;
        int high = 3;
        int result;

        JLabel[][] pieces = new JLabel[6][7];
        ImageIcon empty = new ImageIcon("./images/empty100.png");
        ImageIcon redPiece = new ImageIcon("./images/redPiece100.png");
        ImageIcon yellowPiece = new ImageIcon("./images/yellowPiece100.png");

        ImageIcon[] icons = new ImageIcon[3];
        icons[0] = empty;
        icons[1] = redPiece;
        icons[2] = yellowPiece;

        for (int i = 5; i >= 0; i--)
        {
            for (int j = 0; j < 7; j++)
            {
                result = r.nextInt(high-low) + low;
                pieces[i][j] = new JLabel(icons[result]);
                gameBoard.add(pieces[i][j]);
            }
        }
    }
}
