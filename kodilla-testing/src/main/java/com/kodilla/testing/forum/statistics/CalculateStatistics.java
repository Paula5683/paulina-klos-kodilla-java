package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    int postsQuantity;
    int commentsQuantity;
    int usersQuantity;
    int postsPerUser;
    int commentsPerUser;
    int commentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
    public void calculateAdvStatistics(Statistics statistics) {
        postsQuantity = statistics.postsCount();
        List<String> users = statistics.userNames();
        usersQuantity = users.size();
        commentsQuantity = statistics.commentsCount();
        if (usersQuantity == 0) {
            postsPerUser = 0;
            commentsPerUser = 0;
        }else if (postsQuantity == 0) {
            postsPerUser = 0;
        } else if (commentsQuantity == 0){
            postsPerUser = postsQuantity / usersQuantity;
            commentsPerUser = 0;
            commentsPerPost = 0;
        }else {
            postsPerUser = postsQuantity / usersQuantity;
            commentsPerUser = commentsQuantity / usersQuantity;
            commentsPerPost = commentsQuantity / postsQuantity;
        }
    }
    public String showStatistics(){
        return "Statistics - number of users: "+ usersQuantity + ", number of posts: " + postsQuantity +
                ", number of comments: " + commentsQuantity + ". Number of posts per user: " + postsPerUser +
                ", number of comments per user: " + commentsPerUser + ", number of comments per post: " +
                commentsPerPost;
    }
}
