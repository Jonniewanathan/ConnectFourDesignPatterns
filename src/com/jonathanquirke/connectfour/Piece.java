package com.jonathanquirke.connectfour;

import javax.swing.*;

public abstract class Piece {
    private final int NUM_PIECES = 3;
    ImageIcon empty;
    ImageIcon redPiece;
    ImageIcon yellowPiece;

    ImageIcon[] icons = new ImageIcon[NUM_PIECES];

    abstract ImageIcon[] addIcons();
}
