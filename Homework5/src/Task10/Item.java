package Task10;

//Task 10
public class Item {
    public static final int MAX_NAME = 10;
    // is public which means any class can use it.
    // It is a static variable so you won’t need any object of class in order to access it.
    // It’s final so the value of this variable can never be changed in the current or in any class.
    String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
        if (itemName.length() > MAX_NAME) {

            System.out.println("The name is too long");
        } else {
            System.out.println("The name is matched");

        }
    }
    public String toString () {

        return this.itemName;
    }
}
