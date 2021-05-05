public class Task6 {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        if (a.length() < b.length()){
            String c = (a + b + a);
            System.out.println(c);
        }
            else {
            System.out.println(b + a + b);
        }
    }
}
