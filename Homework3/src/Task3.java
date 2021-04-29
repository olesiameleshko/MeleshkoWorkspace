public class Task3 {
    public static void main(String[] args) {
        String word = "Hello";
        String tag = "<i>" + "</i>";
        String word1 = "Welcome to Java World";
        String tag1 = "<p>" + "</p>";
        String word2 = "Java Tutorials";
        String tag2 = "<h1>" + "</h1>";
        String htmlString = tag.substring(0, 3) + word + tag.substring(3);
        String htmlString1 = tag1.substring(0, 3) + word1 + tag1.substring(3);
        String htmlString2 = tag2.substring(0, 4) + word2 + tag2.substring(4);
        System.out.println(htmlString);
        System.out.println(htmlString1);
        System.out.println(htmlString2);
    }
}