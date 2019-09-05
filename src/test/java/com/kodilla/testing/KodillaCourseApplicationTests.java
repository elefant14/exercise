package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

class TestingMain {
    public static void main(String[] args){


        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}