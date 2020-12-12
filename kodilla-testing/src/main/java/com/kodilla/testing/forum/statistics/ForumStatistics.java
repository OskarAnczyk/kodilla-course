package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageOfUserPosts;
    private double averageOfUserComments;
    private double averageOfPostComments;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public double getAverageOfUserPosts() {
        return averageOfUserPosts;
    }

    public void setAverageOfUserPosts(double averageOfUserPosts) {
        this.averageOfUserPosts = averageOfUserPosts;
    }

    public double getAverageOfUserComments() {
        return averageOfUserComments;
    }

    public void setAverageOfUserComments(double averageOfUserComments) {
        this.averageOfUserComments = averageOfUserComments;
    }

    public double getAverageOfPostComments() {
        return averageOfPostComments;
    }

    public void setAverageOfPostComments(double averageOfPostComments) {
        this.averageOfPostComments = averageOfPostComments;
    }

    public void calculateAdvStatistics(Statistics statistics){
        setNumberOfComments(statistics.commentsCount());
        setNumberOfPosts(statistics.postsCount());
        setNumberOfUsers(statistics.usersNames().size());

        if(getNumberOfPosts() > 0){
            int a = getNumberOfComments();
            int b = getNumberOfPosts();
            setAverageOfPostComments((double) a/b);
        }else {
            setAverageOfPostComments(0);
        }

        if(getNumberOfUsers() > 0){
            int a = getNumberOfUsers();
            int b = getNumberOfComments();
            int c = getNumberOfPosts();

            setAverageOfUserComments((double) b/a);

            setAverageOfUserPosts((double) c/a);
        } else {
            setAverageOfUserComments(0);
            setAverageOfUserPosts(0);
        }
    }

    public void showStatistics(){
        System.out.println("Number of users: " + getNumberOfUsers() +
                "\nNumber of posts: " + getNumberOfPosts() +
                "\nNumber of comments: " + getNumberOfComments() +
                "\nAverage of posts per user: " + getAverageOfUserPosts() +
                "\nAverage of comments per user: " + getAverageOfUserComments() +
                "\nAverage of comments per post: " + getAverageOfPostComments());
    }
}
