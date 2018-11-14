package com.jonathanquirke.connectfour;

import javax.swing.*;

public class TestMain {

    public static void main(String[] args) {
        new TestMain();
    }

    private TestMain() {
        GUI test = new MainGUI();
        test = new MenuBar(test);
        test = new ColumnButtons(test);
        test = new SideMenu(test);
        test = new PlayerInformationPanel(test);
        test = new GameBoardPanel(test);
        JFrame frame = test.getFrame();
        test.frameShow(frame);
    }


}
