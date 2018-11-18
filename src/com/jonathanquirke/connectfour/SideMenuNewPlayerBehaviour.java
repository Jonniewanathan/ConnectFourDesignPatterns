package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SideMenuNewPlayerBehaviour implements ActionBehaviour {
    List<Player> players = new ArrayList();

    @Override
    public void Action() {
        open();
        addPlayer();
        save();
    }

    private void addPlayer()
    {
        String p1Name = JOptionPane.showInputDialog("Please enter your name");
        Player p1 = new Player(p1Name);
        players.add(p1);
    }
    //saves to the .dat file
    private void save()
    {
        try{
            ObjectOutputStream os;
            os = new ObjectOutputStream(new FileOutputStream("Player.dat"));
            os.writeObject(players);
            os.close();
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Saving of File Has Failed!");
            e.printStackTrace();
        }

    }
    private void open() {
        try{
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("Player.dat"));
            players  = (ArrayList<Player>) is.readObject();
            is.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"open didn't work");
            e.printStackTrace();
        }
    }
}
