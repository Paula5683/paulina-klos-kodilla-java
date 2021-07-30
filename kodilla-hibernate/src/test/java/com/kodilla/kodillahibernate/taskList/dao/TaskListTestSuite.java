package com.kodilla.kodillahibernate.taskList.dao;

import com.kodilla.kodillahibernate.taskList.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("First TaskList", "TaskList");
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList> taskListName = taskListDao.findByListName(name);
        //Then
        assertEquals(1, taskListName.size());
        //CleanUp
        int id = taskListName.get(0).getId();
        taskListDao.deleteById(id);
    }
}
