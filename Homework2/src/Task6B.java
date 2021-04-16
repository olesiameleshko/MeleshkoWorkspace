public class Task6B {
    public static void main(String args[]) {
        for (int x = 1; x <= 8; x++) {
            System.out.print("*");
        }
        System.out.println();
        for (int y = 1; y < 4; y++) {
            System.out.print("*");
            for (int z = 1; z <= 6; z++)
                System.out.print(" ");
            System.out.println("*");
        }
        for (int k = 1; k <= 8; k++)
            System.out.print("*");
    }
}
