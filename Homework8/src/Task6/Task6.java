package Task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    public void readData() {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> a = new ArrayList<>();
            try {
                while (true) {
                System.out.print("Enter a number: ");
                int f = sc.nextInt();
                a.add(f);
            }
        } catch (InputMismatchException e) {
                for (int i : a) {
                    System.out.println(i);
                }
        }
    }
}
