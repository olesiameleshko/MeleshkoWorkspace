import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array_sort = {10, 80, 40, 56, 50, 690, -70, 80, 99, 1};
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(array_sort));
        System.out.println("After sort: ");
        Arrays.sort(array_sort);
        System.out.println(Arrays.toString(array_sort));
    }
}
