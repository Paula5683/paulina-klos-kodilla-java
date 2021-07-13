package com.kodilla.kodillaspring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.addTask("First task");
        board.inProgressList.addTask("Progressing");
        board.doneList.addTask("Done");
        //Then
        System.out.println("------ToDoList-------");
        board.toDoList.tasks.stream()
                .forEach(System.out::println);
        System.out.println("---InProgressList----");
        board.inProgressList.tasks.stream()
                .forEach(System.out::println);
        System.out.println("------DoneList-------");
        board.doneList.tasks.stream()
                .forEach(System.out::println);
    }
}
