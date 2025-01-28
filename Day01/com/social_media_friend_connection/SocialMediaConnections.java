package com.social_media_friend_connection;

public class SocialMediaConnections {
    public static void main(String[] args) {
        UserList list=new UserList();
        User newUser=new User(123,"Vinay",21);
        User udit=new User(234,"Udit",21);
        list.addUser(newUser);
        list.addUser(udit);


        System.out.println("Displaying data");
        list.displayAllUsers();

        list.addFriendConnection(newUser.userId,udit.userId);

        list.displayFriends(udit);
        list.displayFriends(newUser);

        list.removeFriendConnection(newUser,udit);
        list.displayFriends(newUser);
        list.displayFriends(udit);

        list.findMutualFriends(udit,newUser);



    }
}
