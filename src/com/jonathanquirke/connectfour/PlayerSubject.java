package com.jonathanquirke.connectfour;

public interface PlayerSubject {
    void registerObserver(PlayerObserver o);
    void removeObserver(PlayerObserver o);
    void notifyObservers();
}
