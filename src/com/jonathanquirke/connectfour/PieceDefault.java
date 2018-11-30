package com.jonathanquirke.connectfour;

import javax.swing.*;

public class PieceDefault extends Piece {
    public PieceDefault(){
        empty = new ImageIcon("./images/default/empty100.png");
        redPiece = new ImageIcon("./images/default/redPiece100.png");
        yellowPiece = new ImageIcon("./images/default/yellowPiece100.png");

        icons[0] = empty;
        icons[1] = yellowPiece;
        icons[2] = redPiece;

    }

    @Override
    ImageIcon[] addIcons() {
        return icons;
    }
}
