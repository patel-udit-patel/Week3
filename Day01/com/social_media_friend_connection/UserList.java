package com.social_media_friend_connection;

import java.util.Collections;
import java.util.Objects;

public class UserList {
    User head;

    void addUser(User newUser){
        if(head==null){
            head=newUser;
            return;
        }
        User temp=head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newUser;
    }
    void addFriendConnection(int userIdA,int userIdB){
        if(head==null||head.next==null){
            System.out.println("No user available");
            return;
        }
        User temp=head;
        User first=null;
        User second=null;
        while (temp!=null||(first==null&&second==null)){
            if(temp!=null&&temp.userId==userIdA){
                first=temp;
            }
            if(temp!=null&&temp.userId==userIdB){
                second=temp;
            }
            temp=temp.next;
        }
        first.friends.add(second.userId);
        second.friends.add(first.userId);
    }
    void removeFriendConnection(User friendA,User friendB){
        for(int i=0;i<friendA.friends.size();i++){
            if(friendA.friends.get(i)==friendB.userId){
                friendA.friends.remove(i);
            }
            if(friendB.friends.get(i)==friendA.userId){
                friendB.friends.remove(i);
            }
        }
    }

    void displayAllUsers(){
        User temp=head;
        while (temp!=null){
            System.out.println("User ID :"+temp.userId);
            System.out.println("Name :"+temp.name);
            System.out.println("Age :"+temp.age);
            System.out.println();
            temp=temp.next;
        }
    }

    void findMutualFriends(User friendA,User friendB){
        int count=0;
        Collections.sort(friendA.friends);
        Collections.sort(friendB.friends);
        int i=0,j=0;
        while(i<friendA.friends.size()&&j<friendB.friends.size()){
            if(Objects.equals(friendA.friends.get(i), friendB.friends.get(j))) {
                i++;
                j++;
                count++;
            }
            else if(friendA.friends.get(i)>friendB.friends.get(j)){j++;}
            else{ i++;}
        }
        System.out.println("Number of mutual friends between "+friendA.name+" and "+friendB.name +" is "+count);
    }

    void displayFriends(User user){
        System.out.println("These are friends of "+user.name);
        for(int i=0;i<user.friends.size();i++){
            System.out.println(user.friends.get(i));
        }
    }

    void searchForUser(int userId,String name){
        if(head==null)return;
        User temp=head;
        while(temp.userId!=userId&& name.equals(temp.name)){
            temp=temp.next;
        }
        System.out.println("Name :" +temp.name);
        System.out.println("UserId :"+temp.userId);
        System.out.println("Age :"+temp.age);
    }
}
