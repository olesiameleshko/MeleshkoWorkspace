public class Task2 {
    public static void main(String[] args) {
        String first = "AE_1381";
        //String first = "A";
        //String first = "";
        if (first.length() >= 2) {
            System.out.println(first.substring(0, 2));
        }
        else if (first.length() == 1) {
            System.out.println(first);
        }
        else if (first.isEmpty()) {
            System.out.println("");
        }
    }
}

