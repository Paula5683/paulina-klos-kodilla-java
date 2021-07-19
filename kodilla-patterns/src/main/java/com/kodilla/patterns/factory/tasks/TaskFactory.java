package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("ShopTask", "Water", 4);
            case PAINTING:
                return new PaintingTask("PaintTask", "blue", "kitchen");
            case DRIVING:
                return new DrivingTask("DriveTask", "shop", "bicycle");
            default:
                return null;
        }
    }
}
