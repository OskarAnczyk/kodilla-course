package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPosts0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        int result = forumStatistics.getNumberOfPosts();
        assertEquals(0,result);
    }

    @Test
    void testCalculateAdvStatisticsPosts1000(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        int expectedPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(expectedPosts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        int result = forumStatistics.getNumberOfPosts();
        assertEquals(1000,result);
    }

    @Test
    void testCalculateAdvStatisticsComments0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        int result = forumStatistics.getNumberOfComments();
        assertEquals(0,result);
    }

    @Test
    void testCalculateAdvStatisticsLessComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        int expectedComments = 500;
        int expectedPosts = 1000;
        when(statisticsMock.commentsCount()).thenReturn(expectedComments);
        when(statisticsMock.postsCount()).thenReturn(expectedPosts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double result = forumStatistics.getAverageOfPostComments();
        assertEquals(0.5,result);
    }

    @Test
    void testCalculateAdvStatisticsMoreComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        int expectedComments = 1000;
        int expectedPosts = 500;
        when(statisticsMock.commentsCount()).thenReturn(expectedComments);
        when(statisticsMock.postsCount()).thenReturn(expectedPosts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double result = forumStatistics.getAverageOfPostComments();
        assertEquals(2,result);
    }

    @Test
    void testCalculateAdvStatisticsUsers0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        int result = forumStatistics.getNumberOfUsers();
        assertEquals(0,result);
    }

    @Test
    void testCalculateAdvStatisticsUsers100(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(100));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        int result = forumStatistics.getNumberOfUsers();
        assertEquals(100,result);
    }

    private List<String> generateNNumberOfStrings(int numberOfNames){
        return IntStream.range(1, numberOfNames + 1)
                .mapToObj(n -> "Name" + n)
                .collect(Collectors.toList());
    }
}
