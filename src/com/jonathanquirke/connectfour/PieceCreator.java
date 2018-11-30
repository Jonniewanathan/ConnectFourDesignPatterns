package com.jonathanquirke.connectfour;

public abstract class PieceCreator {
    abstract Piece createPiece(String type);

    public Piece getPieces(String type){
        Piece piece = createPiece(type);
        piece.addIcons();
        return piece;
    }
}
