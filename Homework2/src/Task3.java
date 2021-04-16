import java.util.Arrays;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random R = new Random();
        int[] Array = new int[10];
        for (int i = 0; i <= 9; i++) {
            Array[i] = R.nextInt();
            System.out.println(Array[i]);
        }
    }
}