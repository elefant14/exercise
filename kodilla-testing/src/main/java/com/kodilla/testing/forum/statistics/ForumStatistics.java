package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsAverage;
    private double commentsAverage;
    private double commentsAveragePost;




    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsAverage() {
        return postsAverage;
    }

    public double getCommentsAverage() {
        return commentsAverage;
    }

    public double getCommentsAveragePost() {
        return commentsAveragePost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (postsNumber != 0) {
            postsAverage = usersNumber / postsNumber;
        } else {
            postsAverage = 0;
        }

        if (commentsNumber != 0) {
            commentsAverage = usersNumber / commentsNumber;
        } else {
            commentsAverage = 0;

        }

        if (postsNumber != 0) {
            commentsAveragePost = commentsNumber / postsNumber;
        } else {
            commentsAveragePost = 0;
        }
    }
}
