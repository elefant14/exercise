package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "Lucas",'M', LocalDate.of(1984,9,13),15 ));
        theForumList.add(new ForumUser(2,"John",'M',LocalDate.of(1990,11,6),20));
        theForumList.add(new ForumUser(3,"Bran",'M',LocalDate.of(1991,3,1),17));
        theForumList.add(new ForumUser(4,"April",'F',LocalDate.of(1985,5,10),0));
        theForumList.add(new ForumUser(5,"Cris",'M',LocalDate.of(1987,7,11),1));
    }

    public List<ForumUser> getForumList() {
        return new ArrayList<ForumUser>(theForumList);
    }
}