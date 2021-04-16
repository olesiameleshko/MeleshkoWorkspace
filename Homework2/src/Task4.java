
public class Task4 {
    public static void main(String[] args) {
        double[] array_square = {400, 795, 890, 901, 999, 1008, 6700, 8800, 9000, 12000};
        double[] square_root = square(array_square);
        for (int i = 0; i < array_square.length; i++)
            System.out.println("Square root of " + array_square[i] + " is " + square_root[i]);
    }
    public static double[] square(double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = Math.sqrt(array[i]);
        return result;
    }
}
