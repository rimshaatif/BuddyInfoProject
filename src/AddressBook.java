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

    public void print(){
        System.out.println("This is the Address Book:");
    }
    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Bob", "Parliament Hill", 123456789);
        AddressBook ab = new AddressBook();
        ab.print();
        ab.addBuddy(buddy);
        ab.removeBuddy(buddy);

    }
}


