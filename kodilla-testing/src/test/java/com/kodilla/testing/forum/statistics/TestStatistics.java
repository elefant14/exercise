package com.kodilla.testing.forum.statistics;

import org.junit.Test;

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

//    @Test
//    public void testCalculateAdvStatisticsZeroPosts() {
//        //Given
//        when(statisticsMock.postsCount()).thenReturn(0);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        assertEquals(0, forumStatistics.getPostsNumber());
//        assertEquals(0.0,2.0, forumStatistics.getPostsAverager());
  //  }

    @Test
    public void testCalculateAdvStatisticsThousandPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();


        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsNumber());
      //  assertEquals(100.0, forumStatistics.getPostsAverager());
      //  assertEquals(20.0, forumStatistics.getCommentsAveragePost());
    }

//    @Test
//    public void testCalculateAdvStatisticsZeroComments(){
//        //Given
//        when(statisticsMock.commentsCount()).thenReturn(0);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        assertEquals(0, forumStatistics.getCommentsNumber());
//       // assertEquals(0.0, forumStatistics.getCommentsAverage());
//       // assertEquals(0.0, forumStatistics.getCommentsAveragePost());
//    }
//
//    @Test
//    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
//        //Given
//        when(statisticsMock.commentsCount()).thenReturn(10);
//        when(statisticsMock.postsCount()).thenReturn(50);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        assertEquals(50, forumStatistics.getPostsNumber());
//        assertEquals(10, forumStatistics.getCommentsNumber());
//       // assertEquals(100.0, forumStatistics.getPostsAverager());
//      //  assertEquals(0.0, forumStatistics.getCommentsAverage());
//       // assertEquals(0.0, forumStatistics.getCommentsAveragePost());
//    }
//
//    @Test
//    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
//        //Given
//        when(statisticsMock.commentsCount()).thenReturn(100);
//        when(statisticsMock.postsCount()).thenReturn(10);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        assertEquals(10, forumStatistics.getPostsNumber());
//        assertEquals(100, forumStatistics.getCommentsNumber());
//      //  assertEquals(0.0, forumStatistics.getPostsAverager());
//      //  assertEquals(0.0, forumStatistics.getCommentsAverage());
//     //   assertEquals(0.0, forumStatistics.getCommentsAveragePost());
//    }
//
//    @Test
//    public void testCalculateAdvStatisticsZeroUsers(){
//        //Given
//        List<String>listMock = new ArrayList<>();
//        when(statisticsMock.usersNames()).thenReturn(listMock);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        assertEquals(0, forumStatistics.getUsersNumber());
//
//    }
//
//    @Test
//    public void testCalculateAdvStatisticsHundredUsers(){
//        //Given
//        List<String>listMock = new ArrayList<>();
//        when(statisticsMock.usersNames()).thenReturn(listMock);
//
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        assertEquals(100, forumStatistics.getUsersNumber());
//
//    }
}