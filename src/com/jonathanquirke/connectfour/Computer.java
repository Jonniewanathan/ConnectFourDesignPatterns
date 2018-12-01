package com.jonathanquirke.connectfour;

/**
 * Created by t00125172 on 15/11/2016.
 */
public class Computer extends AbstractPlayer{
    public Computer(){
        super("Computer");
    }

    public void play(AbstractPlay play)
    {
        play.play();
    }

}
