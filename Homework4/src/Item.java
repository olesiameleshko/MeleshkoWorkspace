//Task 6
public class Item {
    double price;
    int date;
    int month;

    public Item(int date) {
        this.date = date;
        System.out.println("1 cons");
    }
    public Item (int date, int month) {
        this(date);
        this.month = month;
        System.out.println("2 cons");
    }
    public Item(double price, int date, int month) {
        this(date, month);
        this.price = price;
        System.out.println("3 cons");
    }

    public double getPrice() {
        return this.price;
    }
    public int getDate() {
        return this.date;
    }
    public int getMonth() {
        return this.month;

    }
}
