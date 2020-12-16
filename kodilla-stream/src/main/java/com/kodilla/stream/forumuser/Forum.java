package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList;

    public Forum() {
        userList = new ArrayList<>();
        userList.add(new ForumUser(1,"Jerzy1",'M',LocalDate.of(1980,12,10),100));
        userList.add(new ForumUser(2,"Maciej2",'M',LocalDate.of(2002,12,10),80));
        userList.add(new ForumUser(3,"Karolina3",'F',LocalDate.of(1999,5,10),2000));
        userList.add(new ForumUser(4,"Michal4",'M',LocalDate.of(2000,5,10),1000));
        userList.add(new ForumUser(5,"Zbyszek5",'M',LocalDate.of(2000,5,10),0));

    }

    public List<ForumUser> getUserList() {
        return userList;
    }

}
