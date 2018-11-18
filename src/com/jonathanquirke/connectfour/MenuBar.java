package com.jonathanquirke.connectfour;

import javax.swing.*;

class MenuBar extends PaneDecorator {
    private GUI gui;
    private JMenuItem history;
    private JMenuItem howToPlay;

    MenuBar(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    void addHistoryActionListener(ActionHandler actionHandler){
        history.addActionListener(actionHandler);
    }

    void addHowToPlayActionListener(ActionHandler actionHandler){
        howToPlay.addActionListener(actionHandler);
    }

    @Override
    JFrame createPane(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Info");
        history = new JMenuItem("History");
        howToPlay = new JMenuItem("How To Play!");

        menuBar.add(menu);
        menu.add(history);
        menu.add(howToPlay);
        frame.setJMenuBar(menuBar);

        return frame;
    }
}
