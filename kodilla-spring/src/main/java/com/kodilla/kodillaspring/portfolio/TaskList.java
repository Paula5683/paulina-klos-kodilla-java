package com.kodilla.kodillaspring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }
    public boolean addTask(String task){
        return tasks.add(task);
    }
}
