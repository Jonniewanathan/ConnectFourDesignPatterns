package com.jonathanquirke.connectfour;

import javax.swing.*;

public class PieceMario extends Piece {
    public PieceMario(){
        yellowPiece = new ImageIcon("./images/mario/SuperMario_Luigi_Piece.png");
        redPiece = new ImageIcon("./images/mario/SuperMario_Mario_Piece.png");
        empty = new ImageIcon("./images/mario/empty100.png");

        icons[0] = empty;
        icons[1] = yellowPiece;
        icons[2] = redPiece;

    }

    @Override
    ImageIcon[] addIcons() {
        return icons;
    }
}
