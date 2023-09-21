public class BuddyInfo {
    private String name;
    public BuddyInfo(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        BuddyInfo Darren = new BuddyInfo("Darren Wallace");
        AddressBook addBook = new AddressBook();
        addBook.addBuddy(Darren);
        addBook.removeBuddy(Darren);
        System.out.println(Darren.getName());
    }
}