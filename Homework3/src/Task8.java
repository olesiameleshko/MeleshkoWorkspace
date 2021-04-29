public class Task8 {
    public static void main(String[] args) {
        String names = "Den, John, Will, Kate, Adam, Robin";
        names = names.replace(",", "");
        System.out.println(names.replaceAll("\\s+", "\n"));
    }
}


