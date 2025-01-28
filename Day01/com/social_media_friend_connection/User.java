package com.social_media_friend_connection;

import java.util.ArrayList;

public class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer>friends;
    User next;

    User(int userId,String name, int age){
        this.userId=userId;
        this.name=name;
        this.age=age;
        friends=new ArrayList<>();
        this.next=null;


    }
}
