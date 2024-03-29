package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final String using;

    private static final String WHERE = "JOB";
    private static final String USING = "BICYCLE";

    public DrivingTask(final String taskName, final String where,final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving to the: " + where + " by: " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return where.equalsIgnoreCase(WHERE) && using.equalsIgnoreCase(USING);
    }
}
