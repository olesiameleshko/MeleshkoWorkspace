class Task7 {
    public static void main(String[] args) {
        InitializationBlock first = new InitializationBlock();
        System.out.println(first.nextId);
        InitializationBlock second = new InitializationBlock("Brad Pitt", 2000);
        System.out.println(second.nextId);
        System.out.println("Den's id is " + first.getId());
        System.out.println("Brad's id is " + second.getId());
        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println(first.salary);
        System.out.println(second.salary);
    }
}
