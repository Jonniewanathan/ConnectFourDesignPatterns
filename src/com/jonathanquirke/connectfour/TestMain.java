package com.jonathanquirke.connectfour;

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
        test.frameShow(test.getFrame());
    }


}
