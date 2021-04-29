public class Task7 {
    public static void main(String[] args) {
        String emailAdress = "john_smith@example.com";
        int index = emailAdress.indexOf("@");
        String login = emailAdress.substring(0, index);
        int index1 = login.indexOf("_");
        String firstName = login.substring(0, 1).toUpperCase() + login.substring(1, index1);
        String lastName = login.substring(index1 + 1, index1+2).toUpperCase() + login.substring(index1+2);
        String domen = emailAdress.substring(index + 1);
        System.out.println(firstName + " " + lastName);
        System.out.println(domen);
    }
}