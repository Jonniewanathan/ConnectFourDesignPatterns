package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

class PlayerInformationPanel extends PaneDecorator implements PlayerObserver {
    private GUI gui;
    JLabel pName;
    JLabel p2Name;
    JLabel pWin;
    JLabel p2Win;
    JLabel pLoses;
    JLabel p2Loses;

    PlayerInformationPanel(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        frame.add(getScores(),BorderLayout.EAST);
        return frame;
    }


    private JPanel getScores()
    {
        pName = new JLabel();
        p2Name = new JLabel();
        pWin = new JLabel();
        p2Win = new JLabel();
        pLoses = new JLabel();
        p2Loses = new JLabel();

        pName.setText("Name: ");
        pWin.setText("Win: ");
        pLoses.setText("Loses: ");
        pWin.repaint();
        pLoses.repaint();

        p2Name.setText("Name: ");
        p2Win.setText("Win: ");
        p2Loses.setText("Loses: ");
        p2Win.repaint();
        p2Loses.repaint();

        Dimension scoreSize = new Dimension(100, 700);
        LayoutManager scoreGrid = new GridLayout(6,1);
        JPanel score = new JPanel(scoreGrid);
        score.add(pName);
        score.add(pWin);
        score.add(pLoses);
        score.add(p2Name);
        score.add(p2Win);
        score.add(p2Loses);
        score.setPreferredSize(scoreSize);
        return score;
    }

    @Override
    public void update(AbstractPlayer o) {
        pName.setText("Name: " + o.getName());
        pWin.setText("Win: " + o.getWin());
        pLoses.setText("Loses: " + o.getLoses());
        pWin.repaint();
        pLoses.repaint();

        p2Name.setText("Name: ");
        p2Win.setText("Win: ");
        p2Loses.setText("Loses: ");
        p2Win.repaint();
        p2Loses.repaint();
    }
}
