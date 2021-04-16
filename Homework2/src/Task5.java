public class Task5 {
    public static void main(String[] args) {
        int n = 20;
        long factorial = 1L;
        for(int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        System.out.printf("The factorial of " + n + " is " + factorial);
    }
}

