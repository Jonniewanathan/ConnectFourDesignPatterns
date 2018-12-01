package com.jonathanquirke.connectfour;

public class EasyComputer extends AbstractPlay {
    @Override
    int chooseColumn() {
        return (int) (Math.random()*6)+1;
    }
}
