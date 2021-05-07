package Task9;

// Task 9
public class Example {
    static int count = 0;
    String item;
    int price;

    public Example(String item, int price) {
        this.item = item;
        this.price = price;
        count++;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }
}

