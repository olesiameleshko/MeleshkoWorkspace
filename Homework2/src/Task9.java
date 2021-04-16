import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array_sort = {10, 80, 40, 56, 50, 690, -70, 80, 99, 1};
        for (int i = 0; i < array_sort.length; i++) {
            for (int j = i + 1; j < array_sort.length; j++) {
                if (array_sort[i] > array_sort[j]) {
                    int sort = array_sort[i];
                    array_sort[i] = array_sort[j];
                    array_sort[j] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(array_sort));
    }
}


