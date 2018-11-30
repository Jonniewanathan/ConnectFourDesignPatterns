package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class GameBoardPanel extends PaneDecorator implements BoardObserver {
    private GUI gui;
    private ImageIcon[] icons;
    private JLabel[][] pieces;

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
        if(Configuration.pieceType.equals("default"))
        {
            PieceCreator pieceCreator = new DefaultPieceCreator();
            Piece piece = pieceCreator.getPieces("default");
            icons = piece.icons;
        }
        else if(Configuration.pieceType.equals("mario"))
        {
            PieceCreator pieceCreator = new MarioPieceCreator();
            Piece piece = pieceCreator.getPieces("mario");
            icons = piece.icons;
        }

        pieces = new JLabel[6][7];

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


    @Override
    public void update(int[][] board) {
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
                else {
                    pieces[i][j].setIcon(icons[0]);
                }

            }
        }
    }
}
