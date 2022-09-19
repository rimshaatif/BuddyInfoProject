public class BuddyInfo {
    private String name;
    private String address;
    private Integer number;

    public BuddyInfo(String name, String address, Integer number){
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo Buddy = new BuddyInfo("Bob", "Parliament Hill", 123456789);
        AddressBook ab = new AddressBook();
        System.out.println("Hello " + Buddy.getName() + "!");
    }
}
