package com.jonathanquirke.connectfour;

import javax.swing.*;

public class TestMain {

    public static void main(String[] args) {
        new TestMain();
    }

    private TestMain() {
        GUI test = new MainGUI();
        test = new MenuBar(test);
        MenuBar menuBar = (MenuBar) test;
        test = new ColumnButtons(test);
        ColumnButtons columnButtons = (ColumnButtons)test;
        test = new SideMenu(test);
        SideMenu sideMenu = (SideMenu)test;
        test = new PlayerInformationPanel(test);
        test = new GameBoardPanel(test);
        GameBoardPanel gameBoardPanel = (GameBoardPanel)test;

        JFrame frame = test.getFrame();

        menuBarHistoryBehaviour(menuBar);
        menuBarHowToPlayBehaviour(menuBar);
        sideMenuHighScoreBehaviour(sideMenu);
        sideMenuNewPlayerBehaviour(sideMenu);
        sideMenuNewGameBehaviour(sideMenu);
        columnButtons.addColumnButtonActionListener();
        gameBoardPanel.resetBoard();
        ConnectFourBoard connectFourBoard = ConnectFourBoard.getConnectFourBoard();
        connectFourBoard.registerObserver(gameBoardPanel);
        connectFourBoard.registerObserver(new CheckMethods());

        test.frameShow(frame);
    }
    private void menuBarHistoryBehaviour(MenuBar menuBar){
        ActionBehaviour menuBarHistory = new MenuBarHistory();
        ActionHandler actionHistoryHandler = new ActionHandler();
        actionHistoryHandler.setActionBehaviour(menuBarHistory);
        menuBar.addHistoryActionListener(actionHistoryHandler);
    }

    private void menuBarHowToPlayBehaviour(MenuBar menuBar){
        ActionBehaviour menuBarHowToPlay = new MenuBarHowToPlay();
        ActionHandler actionHowToPlayHandler = new ActionHandler();
        actionHowToPlayHandler.setActionBehaviour(menuBarHowToPlay);
        menuBar.addHowToPlayActionListener(actionHowToPlayHandler);
    }

    private void sideMenuHighScoreBehaviour(SideMenu sideMenu){
        ActionBehaviour sideMenuHighScoreBehaviour = new SideMenuHighScoreBehaviour();
        ActionHandler actionSideMenuHighScoreHandler = new ActionHandler();
        actionSideMenuHighScoreHandler.setActionBehaviour(sideMenuHighScoreBehaviour);
        sideMenu.addHighScoreActionListener(actionSideMenuHighScoreHandler);
    }

    private void sideMenuNewPlayerBehaviour(SideMenu sideMenu){
        ActionBehaviour sideMenuNewPlayerBehaviour = new SideMenuNewPlayerBehaviour();
        ActionHandler actionSideMenuNewPlayerHandler = new ActionHandler();
        actionSideMenuNewPlayerHandler.setActionBehaviour(sideMenuNewPlayerBehaviour);
        sideMenu.addNewPlayerActionListener(actionSideMenuNewPlayerHandler);
    }

    private void sideMenuNewGameBehaviour(SideMenu sideMenu){
        ActionBehaviour sideMenuNewGameBehaviour = new SideMenuNewGameBehaviour();
        ActionHandler actionSideMenuNewGameHandler = new ActionHandler();
        actionSideMenuNewGameHandler.setActionBehaviour(sideMenuNewGameBehaviour);
        sideMenu.addNewGameActionListener(actionSideMenuNewGameHandler);
    }
}
