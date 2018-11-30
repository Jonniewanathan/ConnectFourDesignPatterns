package com.jonathanquirke.connectfour;

public class DefaultPieceCreator extends PieceCreator{

    @Override
    Piece createPiece(String type) {
        return new PieceDefault();
    }
}
