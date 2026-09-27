package oop.Static_Keyword;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Glover");
        Friend friend2 = new Friend("Jamahal");
        Friend friend3 = new Friend("israel");
        System.out.println(friend1.name);
        System.out.println(friend1.numofFriends);
        System.out.println(friend2.numofFriends);
        
        System.out.println(Friend.numofFriends); // Static member should be accessed directly through the clas rather than any object

        Friend.showFriend();
        


    }
    
}
