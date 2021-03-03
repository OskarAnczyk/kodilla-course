package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private final String LIST_NAME = "Lista z nazwa";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LIST_NAME,"description");
        taskListDao.save(taskList);
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LIST_NAME);
        //Then
        assertEquals(1,readTaskList.size());
        //Clean up
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
