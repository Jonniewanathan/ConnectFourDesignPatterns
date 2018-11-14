package com.jonathanquirke.connectfour;

import javax.swing.*;

class MenuBar extends PaneDecorator {
    private GUI gui;

    MenuBar(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Info");
        JMenuItem history = new JMenuItem("History");
        JMenuItem howToPlay = new JMenuItem("How To Play!");

        menuBar.add(menu);
        menu.add(history);
        menu.add(howToPlay);
        frame.setJMenuBar(menuBar);

        return frame;
    }
}
