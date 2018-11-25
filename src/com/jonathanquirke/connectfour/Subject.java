package com.jonathanquirke.connectfour;

public interface Subject {
    void registerObserver(BoardObserver o);
    void removeObserver(BoardObserver o);
    void notifyObservers();
}
