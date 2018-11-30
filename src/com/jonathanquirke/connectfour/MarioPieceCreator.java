package com.jonathanquirke.connectfour;

public class MarioPieceCreator extends PieceCreator {

    @Override
    Piece createPiece(String type) {
        return new PieceMario();
    }
}
