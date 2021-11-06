package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentHomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");

        StudentHomework student1 = new StudentHomework("First Student");
        StudentHomework student2 = new StudentHomework("Second Student");
        StudentHomework student3 = new StudentHomework("Third Student");
        StudentHomework student4 = new StudentHomework("Fourth Student");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor1);
        //When
        student1.sendHomework("Task1");
        student2.sendHomework("TaskOne");
        student2.sendHomework("TaskTwo");
        student3.sendHomework("TaskUno");
        student3.sendHomework("TaskDue");
        student3.sendHomework("TaskTre");
        student4.sendHomework("TaskUnus");
        student4.sendHomework("TaskDuo");
        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(5, mentor2.getUpdateCount());
    }
}
