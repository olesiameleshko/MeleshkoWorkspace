public class Task5 {
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJK";
        characters = characters.replaceAll("[aAeEiIoOuU]", "");
        System.out.println(characters.toLowerCase());
    }
}
