package com.jonathanquirke.connectfour;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
    private ActionBehaviour actionBehaviour;

    @Override
    public void actionPerformed(ActionEvent e) {
            actionBehaviour.Action();
    }

    public void setActionBehaviour(ActionBehaviour actionBehaviour){
        this.actionBehaviour = actionBehaviour;
    }
}
