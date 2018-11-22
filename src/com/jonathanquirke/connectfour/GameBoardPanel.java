package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class GameBoardPanel extends PaneDecorator {
    private GUI gui;
    private ImageIcon[] icons;
    private JLabel[][] pieces;
    private ConnectFourBoard connectFourBoard = ConnectFourBoard.getConnectFourBoard();

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

        pieces = new JLabel[6][7];
        ImageIcon empty = new ImageIcon("./images/empty100.png");
        ImageIcon redPiece = new ImageIcon("./images/redPiece100.png");
        ImageIcon yellowPiece = new ImageIcon("./images/yellowPiece100.png");
        icons = new ImageIcon[3];
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

    public void resetBoard(){
        for (int i = 5; i >= 0; i--)
        {
            for (int j = 0; j < 7; j++)
            {
                pieces[i][j].setIcon(icons[0]);

            }
        }
    }

    public void updateBoard(){
        int[][] board = connectFourBoard.getBoard();
        for (int i = 5; i >= 0; i--)
        {
            for (int j = 0; j < 7; j++)
            {
                if(board[i][j] != 1){
                    if (board[i][j] == 2){
                        pieces[i][j].setIcon(icons[1]);
                    }
                    else if (board[i][j] == 3){
                        pieces[i][j].setIcon(icons[2]);
                    }
                }

            }
        }
    }
}
