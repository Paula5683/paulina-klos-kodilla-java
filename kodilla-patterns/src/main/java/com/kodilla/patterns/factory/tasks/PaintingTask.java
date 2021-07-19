package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    private static final String COLOR_PAINT = "BLUE";
    private static final String WHAT_TO_PAINT = "KITCHEN";

    public PaintingTask(final String taskName,String color,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting: " + whatToPaint + " in color: " + color);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return color.equalsIgnoreCase(COLOR_PAINT) &&
                whatToPaint.equalsIgnoreCase(WHAT_TO_PAINT);
    }
}
