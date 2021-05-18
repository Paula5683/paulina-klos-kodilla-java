package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    private List <String> generateListOfUsers(int usersNumber){
        List<String>resultList = new ArrayList<>();
        for (int i = 0; i <usersNumber; i++){
            resultList.add ("a" + i);
        }
        return resultList;
    }
    @Mock
    private Statistics statisticsMock;
    @Test
    void testPostsAndCommentsPerUserWith0Users(){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List<String> users = new ArrayList<String>();
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int postsPerUser = calStat.postsPerUser;
        int commentsPerUser = calStat.commentsPerUser;
        //Then
        assertEquals(0, postsPerUser);
        assertEquals(0, commentsPerUser);
    }
    @Test
    void testPostsAndCommentsPerUserWith100Users(){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List<String> usersList = generateListOfUsers(100);
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int postsPerUser = calStat.postsPerUser;
        int commentsPerUser = calStat.commentsPerUser;
        //Then
        assertEquals(1, postsPerUser);
        assertEquals(10, commentsPerUser);
    }
    @Test
    void testPostPerUserWith1000Posts(){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List <String> usersList = generateListOfUsers(10);
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int postsPerUser = calStat.postsPerUser;
        //Then
        assertEquals(100, postsPerUser);
    }
    @Test
    void testPostPerUserWith0Posts(){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List <String> usersList = generateListOfUsers(10);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(usersList);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int postsPerUser = calStat.postsPerUser;
        //Then
        assertEquals(0, postsPerUser);
    }
    @Test
    void testCommentsPerUserAndPostWith0Comments(){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List <String> usersList = generateListOfUsers(10);
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int commentsPerUser = calStat.commentsPerUser;
        int commentsPerPost = calStat.commentsPerPost;
        //Then
        assertEquals(0, commentsPerUser);
        assertEquals(0, commentsPerPost);
    }
    @Test
    void testCommentsPerPostWithLessPosts(){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List <String> usersList = generateListOfUsers(10);
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(50);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int commentsPerPost = calStat.commentsPerPost;
        //Then
        assertEquals(10, commentsPerPost);
    }
    @Test
    void testCommentsPerPostsWithMorePosts (){
        //Given
        CalculateStatistics calStat = new CalculateStatistics(statisticsMock);
        List <String> usersList = generateListOfUsers(10);
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        calStat.calculateAdvStatistics(statisticsMock);
        int commentsPerPost = calStat.commentsPerPost;
        //Then
        assertEquals(0, commentsPerPost);

    }
}
