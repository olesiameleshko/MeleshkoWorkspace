package Task1;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setSpecies("Wild Duck");
        duck.fly();
        duck.setSpecies("");
        duck.fly();
        duck.setSpecies("Domestic Duck");
        duck.setWeight(4);
        duck.fly();
        duck.setWeight(1);
        duck.fly();
        duck.setSpecies("Falkland steamer Duck");
        duck.fly();
        Bird bird = new Bird();
        bird.setDayOfBirth(10);
        bird.setFright(true);
        bird.fly();
        bird.setFright(false);
        bird.fly();
        bird.setDayOfBirth(21);
        bird.fly();
    }
}
