package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColumnButtons extends PaneDecorator implements ActionListener {
    private GUI gui;
    private JButton[] colButtons;

    ColumnButtons(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        JPanel colButton = createButtons();
        frame.add(colButton, BorderLayout.NORTH);
        return frame;
    }

    void addColumnButtonActionListener(){

        for (JButton colButton : colButtons) {
            colButton.addActionListener(this);

        }
    }

    void removeColumnButtonActionListener(){

        for (JButton colButton : colButtons) {
            colButton.removeActionListener(this);

        }
    }

    private JPanel createButtons(){
        colButtons = new JButton[7];
        JPanel colButton = new JPanel();
        for (int i = 0; i < colButtons.length; i++)
        {
            colButtons[i] = new JButton("Column " + (i+1));
            colButton.add(colButtons[i]);
        }
        return colButton;
    }

    private void switchUsers()
    {
        if(Configuration.playerNum == 1)
        {
            Configuration.playerNum = 2;
        }
        else
        {
            Configuration.playerNum = 1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ConnectFourBoard connectFourBoard = ConnectFourBoard.getConnectFourBoard();
        Computer computer = new Computer();
        int[][] board = connectFourBoard.getBoard();
        if(e.getSource() == colButtons[0])
        {
            System.out.println("This is 1");
            if(board[5][0] != 2 && board[5][0] != 3)
            {
                connectFourBoard.addPiece(0,Configuration.playerNum);
            }
        }
        else if(e.getSource() == colButtons[1])
        {
            System.out.println("This is 2");
            if(board[5][1] != 2 && board[5][1] != 3)
            {
                connectFourBoard.addPiece(1,Configuration.playerNum);
            }

        }
        else if(e.getSource() == colButtons[2])
        {
            System.out.println("This is 3");
            if(board[5][2] != 2 && board[5][2] != 3)
            {
                connectFourBoard.addPiece(2,Configuration.playerNum);
            }
        }
        else if(e.getSource() == colButtons[3])
        {
            System.out.println("This is 4");
            if(board[5][3] != 2 && board[5][3] != 3)
            {
                connectFourBoard.addPiece(3,Configuration.playerNum);
            }
        }
        else if(e.getSource() == colButtons[4])
        {
            System.out.println("This is 5");
            if(board[5][4] != 2 && board[5][4] != 3)
            {
                connectFourBoard.addPiece(4,Configuration.playerNum);
            }
        }
        else if(e.getSource() == colButtons[5])
        {
            System.out.println("This is 6");
            if(board[5][5] != 2 && board[5][5] != 3)
            {
                connectFourBoard.addPiece(5,Configuration.playerNum);
            }
        }
        else if(e.getSource() == colButtons[6])
        {
            System.out.println("This is 7");
            if(board[5][6] != 2 && board[5][6] != 3)
            {
                connectFourBoard.addPiece(6,Configuration.playerNum);
            }
        }
        switchUsers();
        if(Configuration.isComputer){
            AbstractPlay play = new EasyComputer();
            computer.play(play);
            switchUsers();
        }

    }
}
