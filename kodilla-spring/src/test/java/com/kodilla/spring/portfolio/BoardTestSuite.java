package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testTaskAdd(){
        //Given
        //When
        board.addToToDoList("To do");
        board.addToInProgressList("In progress");
        board.addToDoneList("Done");
        //Then
        assertAll(
                () -> assertEquals(board.getDoneList().getTasks().get(0),"Done"),
                () -> assertEquals(board.getInProgressList().getTasks().get(0),"In progress"),
                () -> assertEquals(board.getToDoList().getTasks().get(0),"To do")
        );
    }
}
