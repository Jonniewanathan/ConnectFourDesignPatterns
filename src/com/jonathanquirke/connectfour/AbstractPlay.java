package com.jonathanquirke.connectfour;

public abstract class AbstractPlay {
    private ConnectFourBoard connectFourBoard;

    final void play(){
        int column = chooseColumn();
        getConnectFourBoard();
        connectFourBoard.addPiece(column, Configuration.playerNum);
    }
    abstract int chooseColumn();

    private void getConnectFourBoard(){
        connectFourBoard = ConnectFourBoard.getConnectFourBoard();
    }
}
