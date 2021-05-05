//Task2
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int thisBoxerScore = this.weight + this.strength - this.age;
        int anotherBoxerScore = anotherBoxer.weight + anotherBoxer.strength - anotherBoxer.age;
        return thisBoxerScore > anotherBoxerScore;
    }
}