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
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(100));
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(0,resultAveragePosts);
        assertEquals(1,resultAverageComments);
        assertEquals(0,resultAveragePostComments);
    }

    @Test
    void testCalculateAdvStatisticsPosts1000(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(1000));
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(1,resultAveragePosts);
        assertEquals(1,resultAverageComments);
        assertEquals(1,resultAveragePostComments);
    }

    @Test
    void testCalculateAdvStatisticsComments0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(1000));
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(1,resultAveragePosts);
        assertEquals(0,resultAverageComments);
        assertEquals(0,resultAveragePostComments);
    }

    @Test
    void testCalculateAdvStatisticsLessComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(1000));
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(1,resultAveragePosts);
        assertEquals(0.5,resultAverageComments);
        assertEquals(0.5,resultAveragePostComments);
    }

    @Test
    void testCalculateAdvStatisticsMoreComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(1000));
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(0.5,resultAveragePosts);
        assertEquals(1,resultAverageComments);
        assertEquals(2,resultAveragePostComments);
    }

    @Test
    void testCalculateAdvStatisticsUsers0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(0));
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(0,resultAveragePosts);
        assertEquals(0,resultAverageComments);
        assertEquals(1,resultAveragePostComments);
    }

    @Test
    void testCalculateAdvStatisticsUsers100(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateNNumberOfStrings(100));
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        double resultAveragePosts = forumStatistics.getAverageOfUserPosts();
        double resultAverageComments = forumStatistics.getAverageOfUserComments();
        double resultAveragePostComments = forumStatistics.getAverageOfPostComments();
        assertEquals(10,resultAveragePosts);
        assertEquals(10,resultAverageComments);
        assertEquals(1,resultAveragePostComments);
    }

    private List<String> generateNNumberOfStrings(int numberOfNames){
        return IntStream.range(1, numberOfNames + 1)
                .mapToObj(n -> "Name" + n)
                .collect(Collectors.toList());
    }
}
