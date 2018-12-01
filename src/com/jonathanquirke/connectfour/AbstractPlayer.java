package com.jonathanquirke.connectfour;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlayer implements Serializable,PlayerSubject {
    private String name;
    private int win;
    private int loses;
    private List<PlayerObserver> playerObservers = new ArrayList<>();

    public AbstractPlayer(){
        setName("none");
        setExactLose(0);
        setExactWin(0);
    }


    /**single argument constructor method
     @param name the full name of the Player
     */
    public AbstractPlayer(String name){
        setName(name);
        setExactWin(0);
        setExactLose(0);
        notifyObservers();
    }

    /**mutator method to set the player name
     * @param name the name of the student
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**mutator method to add to the players win count
     */
    public void addWin()
    {
        this.win ++;
        notifyObservers();
    }
    /**mutator method to add 1 to the players Lose count
     */
    public void addLose()
    {
        this.loses ++;
        notifyObservers();
    }
    /**mutator method to add to the players win count
     *@param win the numbers of wins the player has
     */
    public void setExactWin(int win)
    {
        this.win = win;
        notifyObservers();
    }
    /**mutator method to add to the players win count
     *@param loses the number of loses the player has
     */
    public void setExactLose(int loses)
    {
        this.loses = loses;
        notifyObservers();
    }

    /**accessor method to return the player name
     * @return name the name of the player
     */
    public String getName()
    {
        return this.name;
    }

    /**accessor method to return the number of player wins
     * @return win the number of player wins
     */
    public int getWin()
    {
        return this.win;
    }

    /**accessor method to return the number of player loses
     * @return loses the number of player loses
     */
    public int getLoses()
    {
        return this.loses;
    }

    @Override
    public void registerObserver(PlayerObserver o) {
        playerObservers.add(o);
    }

    @Override
    public void removeObserver(PlayerObserver o) {
        if(o != null){
            playerObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (PlayerObserver playerObserver : playerObservers) {
            playerObserver.update(this);
        }
    }

    /**toString method to return the players details
     * @return the name, wins and loses of the player
     */
    public String toString()
    {
        return "Name: " + getName() + "" + " Win: " + getWin() + "" + " Loses: " + getLoses();
    }

}
