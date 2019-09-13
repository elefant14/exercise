package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int identification;
    private final String UserName;
    private final char sex;
    private LocalDate birthdayDate;
    private final int post;

    ForumUser(int identification, String userName, char sex, LocalDate birthdayDate, int post) {
        this.identification = identification;
        UserName = userName;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.post = post;
    }

    public int getIdentification() {
        return identification;
    }

    public String getUserName() {
        return UserName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identification=" + identification +
                ", UserName='" + UserName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", post=" + post +
                '}';
    }
}
