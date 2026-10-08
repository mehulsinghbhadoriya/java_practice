package oop.StaticKeyword;

public class Friend {

    static int numofFriends; // Static variable is a variable that is shared by the whole class 
    String name;

    Friend(String name){
        this.name = name;
        numofFriends++;
    }

    static void showFriend(){
        System.out.println("You have "+ numofFriends + " total friends");
    }
    
}
