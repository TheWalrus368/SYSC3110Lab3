import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> addBook;
    public AddressBook(){
         addBook = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddy){
        addBook.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        addBook.remove(buddy);
    }
}
