import java.util.*;

public class AddressBook  {
    private ArrayList<BuddyInfo> list;

    public AddressBook(){
        list = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo newBuddy){
        list.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        list.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

