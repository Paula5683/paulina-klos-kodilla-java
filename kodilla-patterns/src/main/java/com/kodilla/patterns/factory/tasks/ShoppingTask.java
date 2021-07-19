package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    private static final String WHAT_TO_BUY = "FAN";

    public ShoppingTask(final String taskName, final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Product: " + whatToBuy + " x" + quantity);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return whatToBuy.equalsIgnoreCase(WHAT_TO_BUY);
    }
}
