//Task 9
public class Recursive {
    void reverseString(String rec) {
        if ((rec == null) || (rec.length() <= 1))
            System.out.println(rec);
        else {
            System.out.print(rec.charAt(rec.length() - 1));
            reverseString(rec.substring(0, rec.length() - 1));
        }
    }
}

