package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }


    @Override
    public void update(StudentHomework studentHomework) {
        System.out.println(name + ": New homework to check from student: " + studentHomework.getName());
        updateCount++;
        System.out.println("Total works to check: " + updateCount);
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
