package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentHomework implements Observable {
    private final List<Observer> observers;
    private final ArrayDeque<String> homework;
    private final String name;

    public StudentHomework(String name) {
        this.observers = new ArrayList<>();
        this.homework = new ArrayDeque<>();
        this.name = name;
    }

    public void sendHomework(String task){
        homework.offer(task);
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public ArrayDeque<String> getHomework() {
        return homework;
    }

    public String getName() {
        return name;
    }
}
