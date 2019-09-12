package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatistics{




   // @Before
//    public void beforeTest(){
////        statisticsMock = mock(Statistics.class);
////        List<String>listMock = new ArrayList<>();
////        for(int i=0; i<100; i++){
////            listMock.add("User");
////        }
////        when(statisticsMock.usersNames()).thenReturn(listMock);
////        when(statisticsMock.postsCount()).thenReturn(1000);
////        when(statisticsMock.commentsCount()).thenReturn(100);
////        forumStatistics = new ForumStatistics();
////    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostsNumber(),0.1);
    }

    @Test
    public void testCalculateAdvStatisticsThousandPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsNumber(),0.1);
    }



    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsNumber(),0.1);
    }
//
    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
       //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getPostsNumber(),0.1);
        assertEquals(50, forumStatistics.getCommentsNumber(), 0.1);
        assertEquals(2.0, forumStatistics.getCommentsAveragePost(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
      //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getPostsNumber(),0.1);
        assertEquals(500, forumStatistics.getCommentsNumber(), 0.1);
        assertEquals(5.0, forumStatistics.getCommentsAveragePost(), 0.1);
    }
//
    @Test
    public void testCalculateAdvStatisticsZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String>listNames= new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listNames);


        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsersNumber(),0.1);
    }
//
    @Test
    public void testCalculateAdvStatisticsHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listNames = new ArrayList<>();
        for(int i=0; i<100; i++){
            listNames.add("User");
        }

        when(statisticsMock.usersNames()).thenReturn(listNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersNumber(),0.1);
    }

    @Test
    public void testCalculateAdvStatisticsWithPostsCommentsAndUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listNames = new ArrayList<>();
        for(int i=0; i<1000; i++){
            listNames.add("User");
        }

        when(statisticsMock.usersNames()).thenReturn(listNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getPostsNumber(),0.1);
        assertEquals(500, forumStatistics.getCommentsNumber(), 0.1);
        assertEquals(1000, forumStatistics.getUsersNumber(), 0.1);
        assertEquals(2.0, forumStatistics.getCommentsAverage(), 0.1);
        assertEquals(5.0, forumStatistics.getCommentsAveragePost(), 0.1);
        assertEquals(10.0, forumStatistics.getPostsAverage(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsThreeZeroes(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String>listNames= new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostsNumber(),0.1);
        assertEquals(0, forumStatistics.getCommentsNumber(), 0.1);
        assertEquals(0, forumStatistics.getUsersNumber(), 0.1);
        assertEquals(0.0, forumStatistics.getCommentsAverage(), 0.1);
        assertEquals(0.0, forumStatistics.getCommentsAveragePost(), 0.1);
        assertEquals(0.0, forumStatistics.getPostsAverage(), 0.1);
    }

}