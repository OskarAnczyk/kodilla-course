package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactory(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        ShoppingTask shoppingTask = (ShoppingTask) taskFactory.makeTask(TaskFactory.SHOPPING);
        PaintingTask paintingTask = (PaintingTask) taskFactory.makeTask(TaskFactory.PAINTING);
        DrivingTask drivingTask = (DrivingTask) taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertAll(
                () -> assertEquals(shoppingTask.getTaskName(),"Shopping"),
                () -> assertEquals(paintingTask.getTaskName(),"Painting"),
                () -> assertEquals(drivingTask.getTaskName(),"Driving"));
    }
}
